package com.keyin.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Iterable<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> getMemberById(int userId) {
        return memberRepository.findById(userId);
    }

    public Iterable<Member> getMembersByFirstName(String lastName) {
        return memberRepository.getMembersByFirstName(lastName);
    }

    public Iterable<Member> getMembersByLastName(String lastName) {
        return memberRepository.getMembersByLastName(lastName);
    }

    public Optional<Member> getMemberByFirstNameAndLastName(String firstName, String lastName) {
        return memberRepository.getMemberByFirstNameAndLastName(firstName, lastName);
    }

    public Optional<Member> getMemberByEmail(String email) {
        return memberRepository.getMemberByEmail(email);
    }

    public Optional<Member> getMemberByPhoneNumber(String phoneNumber) {
        return memberRepository.getMemberByPhoneNumber(phoneNumber);
    }

    public Iterable<Member> getMembersByMembershipDuration(int duration) {
        return memberRepository.getMemberByMembershipDurationInMonths(duration);
    }

    public Member addMember(Member member) {
        return memberRepository.save(member);
    }
}


