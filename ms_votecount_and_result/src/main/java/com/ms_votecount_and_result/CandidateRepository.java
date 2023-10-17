package com.ms_votecount_and_result;
//import com.ms_voting_mgmt.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    // You can add custom query methods if needed
}

