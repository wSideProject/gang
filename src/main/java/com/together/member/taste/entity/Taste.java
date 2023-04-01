package com.together.member.taste.entity;

import com.together.member.member.model.Member;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Taste {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String nickname;
    private String tasteType;
    private String tArea;
    private String expLv;
    private String planType;


    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

    @ManyToOne
    @JoinColumn(name = "mem_id")
    private Member member;

    public void setMember(Member member){
        this.member = member;
        member.getTaste().add(this);
    }


}
