package com.keyin.tournament;

import com.keyin.member.Member;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tournament {
    // instance variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate startDate;

    private LocalDate endDate;

    private String location;

    private float entryFee;

    private float prizeAmount;

    @OneToMany()
    @JoinTable(
            name = "tournament_member",
            joinColumns = @JoinColumn(name = "tournament_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")
    )
    private List<Member> participatingMembers;

    // constructors
    public Tournament() {
    }

    public Tournament(LocalDate startDate, LocalDate endDate, String location, float entryFee, float prizeAmount) {
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
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
