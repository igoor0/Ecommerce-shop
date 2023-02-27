package com.igorkohsin.backend.controller;

import com.igorkohsin.backend.model.order.Order;
import com.igorkohsin.backend.model.product.Product;
import com.igorkohsin.backend.model.user.User;
import com.igorkohsin.backend.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping()
    public ResponseEntity addOrder(@RequestBody Order order) {
        return ResponseEntity.ok().build();
    }
}
