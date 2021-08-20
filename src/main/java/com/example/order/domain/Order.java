package com.example.order.domain;

import com.example.item.domain.Item;
import com.example.user.domain.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id")
    private long orderId;

    @Column(name = "price")
    private long price;

    @Column(name = "order_status")
    private String count;

    //fetch 는 가지고 오는것 , 아이템과 유저가 발생해야 생길수 있다.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

}
