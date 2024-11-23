package com.keyin.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Iterable<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
