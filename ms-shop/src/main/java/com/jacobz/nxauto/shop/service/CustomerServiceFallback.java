package com.jacobz.nxauto.shop.service;

import com.jacobz.nxauto.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceFallback implements CustomerService{
    @Override
    public Customer getCustomerById(Integer id) {
        System.out.println("[[this is fallback!]]");
        return new Customer(id, null, "DALLAS");
    }
}
