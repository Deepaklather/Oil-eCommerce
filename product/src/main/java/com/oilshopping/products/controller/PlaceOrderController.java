package com.oilshopping.products.controller;

import com.oilshopping.products.model.PlaceOrder;
import com.oilshopping.products.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.logging.Logger;

@RestController
@Validated
@RequestMapping("/user")
public class PlaceOrderController {

    private static Logger logger = Logger.getLogger(PlaceOrderController.class.getName());
    @Autowired
    PlaceOrderService placeOrderService;
    @PostMapping(value = "/placeOrder",
                produces = "application/json",
                consumes = "application/json")
    public ResponseEntity<String> initiateOrder(@RequestBody PlaceOrder placeOrder) throws IOException {

        placeOrderService.placeOrder(placeOrder);


        return new ResponseEntity<String>("Your order has been successfully placed. You will be contacted soon.",HttpStatus.OK);
    }
}
