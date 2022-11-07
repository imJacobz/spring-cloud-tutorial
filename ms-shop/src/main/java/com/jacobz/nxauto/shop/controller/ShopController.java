package com.jacobz.nxauto.shop.controller;

import com.jacobz.nxauto.entity.Shop;
import com.jacobz.nxauto.shop.service.CustomerService;
import com.jacobz.nxauto.shop.service.MockShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopController {
    private final CustomerService customerService;
    private final MockShopService mockShopService;

    public ShopController(CustomerService customerService, MockShopService mockShopService) {
        this.customerService = customerService;
        this.mockShopService = mockShopService;
    }

    @GetMapping("/shop/customer/{id}")
    public List<Shop> showShopForCustomer(@PathVariable Integer id) {
        String customerCity = customerService.getCustomerById(id).getCity();
        return mockShopService.mockShops().stream()
                .filter(shop -> shop.getCity().equalsIgnoreCase(customerCity)).toList();
    }

}
