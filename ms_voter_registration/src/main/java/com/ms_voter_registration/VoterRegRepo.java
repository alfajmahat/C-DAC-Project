package com.ms_voter_registration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterRegRepo extends JpaRepository<VoterRegistrationRequest, Integer> {

}
