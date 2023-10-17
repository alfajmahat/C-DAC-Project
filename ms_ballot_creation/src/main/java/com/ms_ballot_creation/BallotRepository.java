package com.ms_ballot_creation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BallotRepository extends JpaRepository<Ballot, Long> {
    // Add custom queries if needed
}

