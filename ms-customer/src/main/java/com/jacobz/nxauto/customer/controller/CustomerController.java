package com.jacobz.nxauto.customer.controller;

import com.jacobz.nxauto.customer.service.MockService;
import com.jacobz.nxauto.entity.Customer;
import com.jacobz.nxauto.model.ResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final MockService mockService;

    @GetMapping("/customer/{id}")
    public ResponseEntity<ResponseData> getCustomerInfo(@PathVariable Integer id) {
        Customer customer = mockService.mockData().get(id);
        return ResponseEntity.ok(new ResponseData().success().data(customer));
    }
}
