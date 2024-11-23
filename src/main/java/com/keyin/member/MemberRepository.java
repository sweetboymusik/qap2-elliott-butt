package com.keyin.member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends CrudRepository<Member, Integer> {
    Iterable<Member> getMembersByLastName(String username);

    Iterable<Member> getMembersByFirstName(String lastName);

    Optional<Member> getMemberByFirstName(String firstName);

    Optional<Member> getMemberByLastName(String lastName);

    Optional<Member> getMemberByFirstNameAndLastName(String firstName, String lastName);

    Optional<Member> getMemberByEmail(String email);

    Optional<Member> getMemberByPhoneNumber(String phoneNumber);

    Iterable<Member> getMemberByMembershipDurationInMonths(int membershipDurationInMonths);
}
