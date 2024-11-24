package com.keyin.tournament;

import com.keyin.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Optional;


@Service
public class TournamentService {
    @Autowired
    private TournamentRepository tournamentRepository;

    public Iterable<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    public Optional<Tournament> getTournamentById(int id) {
        return tournamentRepository.findById(id);
    }

    public Optional<Tournament> getTournamentByStartDate(LocalDate startDate) {
        return tournamentRepository.getTournamentByStartDate(startDate);
    }

    public Optional<Tournament> getTournamentByEndDate(LocalDate endDate) {
        return tournamentRepository.getTournamentByEndDate(endDate);
    }

    public Iterable<Member> getMembersByTournamentId(int tournamentId) {
        Optional<Tournament> tournament = tournamentRepository.findById(tournamentId);

        if (tournament.isPresent()) {
            return tournament.get().getParticipatingMembers();
        }

        return Collections.emptyList();
    }

    public Tournament addTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }
}