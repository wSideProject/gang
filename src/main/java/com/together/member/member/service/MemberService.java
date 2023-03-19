package com.together.member.member.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.together.member.member.model.Member;
import com.together.member.member.repository.MemberRepository;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    /**
     * 회원가입
      */
    public Long join(Member member) {
        validateDuplicateMember(member); //중복회원 검증
        memberRepository.save(member);
        return member.getId();
    }
    private void validateDuplicateMember(Member member){
     List<Member> findMembers = memberRepository.findByName(member.getName());
        if(!findMembers.isEmpty()){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }
    // 회원 전체조회
    @Transactional(readOnly = true)
    public List<Member> findMemberAll(){
        return memberRepository.findAll();
    }
    @Transactional(readOnly = true)
    public Member findOneMember(Long memberId){
        return memberRepository.findOne(memberId);
    }
}
