package com.educandoweb.course.course.services;

import com.educandoweb.course.course.entities.OrderItem;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderItemServices {

    @Autowired
    private OrderItem orderItem;


}
