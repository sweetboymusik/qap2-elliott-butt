package com.keyin.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.time.ZoneId;

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

    private double membershipDurationInYears;

    // constructors
    public Member() {
    }

    public Member(String firstName, String lastName, String address, String email, String phoneNumber, LocalDateTime membershipStartDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.membershipStartDate = membershipStartDate;

        // calculate membershipDuration (in years)
        long startInMilli = membershipStartDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long currentInMilli = System.currentTimeMillis();

        long diffInMilli = currentInMilli - startInMilli;
        long milliInYear = (long) (365.25 * 24 * 60 * 60 * 1000);

        this.membershipDurationInYears = (double) diffInMilli / milliInYear;
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

    public double getMembershipDurationInYears() {
        return membershipDurationInYears;
    }

    public void setMembershipDurationInYears(double membershipDuration) {
        this.membershipDurationInYears = membershipDuration;
    }
}
