package com.igorkohsin.backend.service.impl;

import com.igorkohsin.backend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl {
    @Autowired
    private OrderRepository orderRepository;
}