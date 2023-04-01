package com.together.member.taste.repository;

import com.together.member.taste.controller.TasteController;
import com.together.member.taste.entity.Taste;
import com.together.member.taste.service.TasteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
@WebMvcTest(TasteController.class)
class TasteRepositoryTest {

    @Autowired
    MockMvc mockMVc;

    @MockBean
    TasteService tasteService;

    @Test
    void getTestById() throws Exception {
    mockMVc.perform(get("/api/v1/taste/"+1)
            .accept(MediaType.APPLICATION_JSON));
            //.andExpect(status().isOK());
    }

}