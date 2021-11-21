package com.math.microbrew.services;

import com.math.microbrew.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID uuid);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID uuid, CustomerDto customerDto);

    void deleteCustomer(UUID uuid);
}
