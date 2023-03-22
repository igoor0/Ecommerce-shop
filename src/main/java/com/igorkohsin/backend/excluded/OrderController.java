package com.igorkohsin.backend.excluded;

import com.igorkohsin.backend.excluded.Order;
import com.igorkohsin.backend.excluded.OrderServiceImpl;
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
    private OrderServiceImpl orderService;

    @PostMapping()
    public ResponseEntity addOrder(@RequestBody Order order) {
        return ResponseEntity.ok().build();
    }
}
