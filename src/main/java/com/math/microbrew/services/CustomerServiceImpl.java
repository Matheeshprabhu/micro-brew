package com.math.microbrew.services;

import com.math.microbrew.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    public CustomerDto getCustomerById(UUID id){

        return CustomerDto.builder().id(UUID.randomUUID()).name("Matheesh").build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {

        log.info("Saved Customer");
        return CustomerDto.builder().name(customerDto.getName()).id(customerDto.getId()).build();
    }

    @Override
    public void updateCustomer(UUID uuid, CustomerDto customerDto) {
        log.info("Updated customer");
    }

    public void deleteCustomer(UUID uuid){
        log.info("Deleted customer" + uuid);
    }
}
