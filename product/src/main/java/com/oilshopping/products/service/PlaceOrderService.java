package com.oilshopping.products.service;

import com.oilshopping.products.model.PlaceOrder;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public interface PlaceOrderService extends Serializable {

    void placeOrder(PlaceOrder placeOrder);
}
