package com.together.member.member.repository;

import com.together.member.member.controller.MemberController;
import com.together.member.member.model.Member;
import com.together.member.member.service.MemberService;
import com.together.member.taste.controller.TasteController;
import com.together.member.taste.entity.Taste;
import com.together.member.taste.service.TasteService;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository repository;

    @Test
    public void regUser() throws Exception{
        Member member = new Member();
        member.setName("ADMIN");
        member.setNickname("어드민");
        member.setEmail("dev.rachelxx@gmail.com");
        member.setFromSocial(false);

        Long saveId = memberService.join(member);
        assertEquals(member, repository.findOne(saveId));
    }


}