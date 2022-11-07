package com.jacobz.nxauto.shop.service;

import com.jacobz.nxauto.entity.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "nx-auto-ms-customer",fallback = CustomerServiceFallback.class)
public interface CustomerService {
    @GetMapping("/customer/{id}")
    Customer getCustomerById(@PathVariable("id") Integer id) ;
}
