package com.ms_ballot_creation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ElectionRepository extends JpaRepository<Election, Long> {
    // Add custom queries if needed
}
