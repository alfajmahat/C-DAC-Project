package com.ms_voting_mgmt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterCandidatePreferenceRepository extends JpaRepository<VoterCandidatePreference, Long> {
    // Define custom queries or methods if needed
}

