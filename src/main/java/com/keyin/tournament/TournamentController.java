package com.keyin.tournament;

import com.keyin.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
@CrossOrigin
public class TournamentController {
    @Autowired
    private TournamentService tournamentService;

    @GetMapping("/tournament/all")
    public Iterable<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @GetMapping("/tournament/id/{id}")
    public Optional<Tournament> getTournamentById(@PathVariable("id") int id) {
        return tournamentService.getTournamentById(id);
    }

    @GetMapping("/tournament/start_date/{startDate}")
    public Optional<Tournament> getTournamentByStartDate(@PathVariable("startDate") String startDate) {
        LocalDate date = LocalDate.parse(startDate);
        return tournamentService.getTournamentByStartDate(date);
    }

    @GetMapping("/tournament/end_date/{endDate}")
    public Optional<Tournament> getTournamentByEndDate(@PathVariable("endDate") String endDate) {
        LocalDate date = LocalDate.parse(endDate);
        return tournamentService.getTournamentByEndDate(date);
    }

    @GetMapping("/tournament/id/{id}/members")
    public Iterable<Member> getMembersByTournamentId(@PathVariable("id") int id) {
        return tournamentService.getMembersByTournamentId(id);
    }

    @PostMapping("/tournament/add")
    public Tournament addTournament(@RequestBody Tournament tournament) {
        return tournamentService.addTournament(tournament);
    }

    @PostMapping("tournament/id/{tournamentId}/members/add/{memberId}")
    public Iterable<Member> addMemberToTournament(@PathVariable("tournamentId") int tournamentId, @PathVariable("memberId") int memberId) {
        return tournamentService.addMemberTournament(tournamentId, memberId);
    }

}
