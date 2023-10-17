package com.ms_votecount_and_result;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    // Custom query methods, if needed
}
