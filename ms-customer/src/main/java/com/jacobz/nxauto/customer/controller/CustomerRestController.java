package com.jacobz.nxauto.customer.controller;

import com.jacobz.nxauto.customer.service.MockService;
import com.jacobz.nxauto.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

    private final MockService mockService;

    @Autowired
    public CustomerRestController(MockService mockService) {
        this.mockService = mockService;
    }


    @GetMapping("/customer/{id}")
    public Customer getCustomerInfo(@PathVariable Integer id) {
        return mockService.mockData().get(id);
    }
}
