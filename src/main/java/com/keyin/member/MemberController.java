package com.keyin.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/member/all")
    public Iterable<Member> getAllMember() {
        return memberService.getAllMembers();
    }

    @GetMapping("/member/id/{id}")
    public Optional<Member> getMemberById(@PathVariable int id) {
        return memberService.getMemberById(id);
    }

    @GetMapping("/member/last_name/{lastName}")
    public Iterable<Member> getMembersByLastName(@PathVariable String lastName) {
        return memberService.getMembersByLastName(lastName);
    }

    @GetMapping("/member/first_name/{firstName}")
    public Iterable<Member> getMembersByFirstName(@PathVariable String firstName) {
        return memberService.getMembersByFirstName(firstName);
    }

    @GetMapping("/member/full_name/{firstName}/{lastName}")
    public Optional<Member> getMemberByFullName(@PathVariable String firstName, @PathVariable String lastName) {
        return memberService.getMemberByFirstNameAndLastName(firstName, lastName);
    }

    @GetMapping("/member/email/{email}")
    public Optional<Member> getMemberByEmail(@PathVariable String email) {
        return memberService.getMemberByEmail(email);
    }

    @GetMapping("/member/phone_number/{phoneNumber}")
    public Optional<Member> getMemberByPhoneNumber(@PathVariable String phoneNumber) {
        return memberService.getMemberByPhoneNumber(phoneNumber);
    }

    @GetMapping("/member/membership_duration/{duration}")
    public Iterable<Member> getMembersByMembershipDuration(@PathVariable int duration) {
        return memberService.getMembersByMembershipDuration(duration);
    }

    @PostMapping("/member")
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }
}
