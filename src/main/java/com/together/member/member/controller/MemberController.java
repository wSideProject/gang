package com.together.member.member.controller;

import com.together.member.member.model.Member;
import com.together.member.member.service.MemberService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/api/v1/members")
    public CreateMemberResponse saveMemberV1(@RequestBody Member member){
    Long id =     memberService.join(member);

    return new CreateMemberResponse(id);
    }

    @GetMapping("/api/v1/members")
    public List<Member> membersV1() {
        return memberService.findMemberAll();
    }
    @Data
    static class CreateMemberResponse {
        private Long id;
        public CreateMemberResponse(Long id){
            this.id = id;
        }
    }

}
