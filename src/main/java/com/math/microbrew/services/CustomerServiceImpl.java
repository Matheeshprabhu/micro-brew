package com.math.microbrew.services;

import com.math.microbrew.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    public CustomerDto getCustomerById(UUID id){

        return CustomerDto.builder().name("Matheesh").id(UUID.randomUUID()).build();
    }
}
