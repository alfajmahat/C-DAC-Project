package com.ms_ballot_creation;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ElectionService {
    Election createElection(Election election);
    Election updateElection(Long id, Election updatedElection);
    Election getElectionById(Long id);
    List<Election> getAllElections();
    void deleteElection(Long id);
}

