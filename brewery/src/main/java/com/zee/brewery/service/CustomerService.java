package com.zee.brewery.service;

import com.zee.brewery.web.modal.CustomerDto;
import java.util.UUID;

public interface CustomerService {

  CustomerDto getCustomerByID(UUID id);

  CustomerDto saveNewCustomer(CustomerDto customerDto);

  void updateCustomer(UUID customerId, CustomerDto customerDto);

  void deleteById(UUID customerId);
}
