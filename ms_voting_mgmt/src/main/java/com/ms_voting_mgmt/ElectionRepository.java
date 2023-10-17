package com.ms_voting_mgmt;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectionRepository extends JpaRepository<Election, Long> {
    // You can define custom query methods here if needed
}

