package com.together.member.taste.model;


import lombok.Builder;
import lombok.Data;


import java.time.LocalDateTime;


@Data
@Builder
public class TasteDTO {
    private Long id;
    private String name;
    private String nickname;
    private String tasteType;
    private String tArea;
    private String expLv;
    private String planType;

    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

}
