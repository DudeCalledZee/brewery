package com.zee.brewery.web.mappers;

import com.zee.brewery.domain.Customer;
import com.zee.brewery.web.modal.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customer);

}
