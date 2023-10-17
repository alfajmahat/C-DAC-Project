package com.ms_ballot_creation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface VoterBallotStatusRepository extends JpaRepository<VoterBallotStatus, Long> {
    // Add custom queries if needed
}

