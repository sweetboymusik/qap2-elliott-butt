package com.keyin.tournament;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface TournamentRepository extends CrudRepository<Tournament, Integer> {
    Optional<Tournament> getTournamentByStartDate(LocalDate startDate);

    Optional<Tournament> getTournamentByEndDate(LocalDate endDate);
}
