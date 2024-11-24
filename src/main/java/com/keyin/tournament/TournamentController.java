package com.keyin.tournament;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/tournament/add")
    public Tournament addTournament(@RequestBody Tournament tournament) {
        return tournamentService.addTournament(tournament);
    }
}
