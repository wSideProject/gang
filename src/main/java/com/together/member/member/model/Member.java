package com.together.member.member.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue
    @Column(name="mem_id")
    private Long id;

    private String name;
    private String nickname;
    private String email;
    private String birthDate;
    private boolean fromSocial;
    private Date regDate;
    private String regId;
    private Date modDate;
    private String modId;
}
