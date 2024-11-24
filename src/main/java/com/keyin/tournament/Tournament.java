package com.keyin.tournament;

import com.keyin.member.Member;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tournament {
    // instance variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String location;

    private float entryFee;

    private float prizeAmount;

    @OneToMany(mappedBy = "tournament")
    private List<Member> participatingMembers;

    // constructors
    public Tournament() {
    }

    public Tournament(LocalDateTime startDate, LocalDateTime endDate, String location, float entryFee, float prizeAmount) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.entryFee = entryFee;
        this.prizeAmount = prizeAmount;
        this.participatingMembers = new ArrayList<>();
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(float entryFee) {
        this.entryFee = entryFee;
    }

    public float getPrizeAmount() {
        return prizeAmount;
    }

    public void setPrizeAmount(float prizeAmount) {
        this.prizeAmount = prizeAmount;
    }

    public List<Member> getParticipatingMembers() {
        return participatingMembers;
    }

    public void setParticipatingMembers(List<Member> participatingMembers) {
        this.participatingMembers = participatingMembers;
    }
}
