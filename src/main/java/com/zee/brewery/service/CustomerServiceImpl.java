package com.zee.brewery.service;

import com.zee.brewery.web.modal.CustomerDto;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public CustomerDto getCustomerByID(UUID id) {
    return CustomerDto.builder()
        .id(UUID.randomUUID())
        .name("Zee")
        .build();
  }

  @Override
  public CustomerDto saveNewCustomer(CustomerDto customerDto) {
    return CustomerDto.builder()
        .id(UUID.randomUUID())
        .build();
  }

  @Override
  public void updateCustomer(UUID customerId, CustomerDto customerDto) {
    //todo impl - would add new beer
  }

  @Override
  public void deleteById(UUID customerId) {
    log.debug("Deleting Customer");
  }
}
