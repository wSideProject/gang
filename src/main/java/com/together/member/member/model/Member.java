package com.together.member.member.model;

import com.together.member.taste.entity.Taste;
import com.together.member.taste.model.TasteDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

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

    @OneToMany(mappedBy = "member")
    private List<Taste> taste = new ArrayList<>();
}
