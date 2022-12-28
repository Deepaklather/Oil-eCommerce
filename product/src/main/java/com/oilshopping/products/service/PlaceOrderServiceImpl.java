package com.oilshopping.products.service;

import com.oilshopping.products.OrderRepository.PlaceOrderRepository;
import com.oilshopping.products.model.PlaceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PlaceOrderServiceImpl implements PlaceOrderService{
    @Autowired
    PlaceOrderRepository repo;
    @Override
    public void placeOrder(PlaceOrder placeOrder) {

        Date date = new Date();
        placeOrder.setOrderDate(date);

        repo.save(placeOrder);

    }
}
