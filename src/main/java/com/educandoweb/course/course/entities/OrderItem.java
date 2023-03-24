package com.educandoweb.course.course.entities;

import com.educandoweb.course.course.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Entity
@JsonIgnore
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private Integer quantity;
    private Double price;

    public double getSubTotal(){
        return quantity * price;

    }
}
