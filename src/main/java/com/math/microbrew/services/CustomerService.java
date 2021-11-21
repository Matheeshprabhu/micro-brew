package com.math.microbrew.services;

import com.math.microbrew.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID uuid);

    CustomerDto saveCustomer(UUID uuid);

    void updateCustomer(UUID uuid);

    void deleteCustomer(UUID id);
}
