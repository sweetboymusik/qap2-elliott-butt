package com.keyin.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Member {
    // instance variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    private String address;

    private String email;

    private String phoneNumber;

    private LocalDateTime membershipStartDate;

    private int membershipDurationInMonths;

    // constructors
    public Member() {
    }

    public Member(String firstName, String lastName, String address, String email, String phoneNumber, LocalDateTime membershipStartDate, int membershipDurationInMonths) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.membershipStartDate = membershipStartDate;
        this.membershipDurationInMonths = membershipDurationInMonths;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(LocalDateTime membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }

    public int getMembershipDurationInMonths() {
        return membershipDurationInMonths;
    }

    public void setMembershipDurationInMonths(int membershipDurationInMonths) {
        this.membershipDurationInMonths = membershipDurationInMonths;
    }
}
