package com.together.member.taste.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("PASTA")
@Getter
@Setter
public class Pasta extends Item{

    private String director;
    private String type;
    private String topping;
}
