package com.jacobz.nxauto.shop.service;

import com.jacobz.nxauto.entity.Customer;
import com.jacobz.nxauto.model.ResponseData;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceFallback implements CustomerService {
    @Override
    public ResponseData getCustomerById(Integer id) {
        System.err.println("[[this is fallback!]]");
        return new ResponseData().data(new Customer(id, null, "DALLAS")).msg("fallback").status(503);
    }
}
