package com.together.member.taste.controller;

import com.together.member.member.controller.MemberController;
import com.together.member.member.model.Member;
import com.together.member.member.service.MemberService;
import com.together.member.taste.entity.Taste;
import com.together.member.taste.model.TasteDTO;
import com.together.member.taste.service.TasteService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequiredArgsConstructor
public class TasteController {
    private final TasteService tasteService;
    @PostMapping("/api/v1/taste")
    public TasteResponse saveMemberV1(@RequestBody Taste tasteDTO){
        Long id =     tasteService.saveTaste(tasteDTO);

        return new TasteController.TasteResponse(id);
    }

    @GetMapping("/api/v1/taste")
    public List<Taste> membersV1() {
        return tasteService.findTaste();
    }
    @Data
    static class TasteResponse {
        private Long id;
        public TasteResponse(Long id){
            this.id = id;
        }
    }
}
