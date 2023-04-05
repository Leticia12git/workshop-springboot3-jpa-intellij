package com.educandoweb.course.course.repository;

import com.educandoweb.course.course.entities.OrderItem;
import com.educandoweb.course.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
