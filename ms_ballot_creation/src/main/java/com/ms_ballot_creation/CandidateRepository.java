package com.ms_ballot_creation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    // Add custom queries if needed
}

