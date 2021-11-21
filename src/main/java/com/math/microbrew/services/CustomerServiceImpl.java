package com.math.microbrew.services;

import com.math.microbrew.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    public CustomerDto getCustomerById(UUID id){

        return CustomerDto.builder().name("Matheesh").id(UUID.randomUUID()).build();
    }

    @Override
    public CustomerDto saveCustomer(UUID uuid) {

        log.info("Saved Customer");
        return CustomerDto.builder().build();
    }

    @Override
    public void updateCustomer(UUID uuid) {
        log.info("Updated customer");
    }

    public void deleteCustomer(UUID id){
        log.info("Deleted customer" + id);
    }
}
