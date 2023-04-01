package com.together.member.taste.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="restaurant_id")
    private Long id;
    private String name;
    @OneToMany(mappedBy = "restaurant")
    private List<MenuItem> menuItems = new ArrayList<>();
    @Embedded
    private Address address;


}
