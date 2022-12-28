package com.oilshopping.products.OrderRepository;

import com.oilshopping.products.model.PlaceOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceOrderRepository extends JpaRepository<PlaceOrder, Integer> {

}
