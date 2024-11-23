package com.keyin.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/member/all")
    public Iterable<Member> getAllMember() {
        return memberService.getAllMembers();
    }

    @PostMapping("/member")
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }
}
