package com.together.member.taste.entity;

import com.together.member.taste.item.Item;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class MenuItem {
    @Id @GeneratedValue
    @Column(name="menu_item_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name="item_id")
    private Item item;

    private int price;
    private int buyCount;
    @ManyToOne
    @JoinColumn(name="restaurant_id")
    private Restaurant restaurant;

}
