package com.ms_voting_mgmt;

import java.util.List;

public interface ElectionService {
    List<Election> getAllElections();
    Election getElectionById(Long id);
    Election createElection(Election election);
    Election updateElection(Long id, Election election);
    void deleteElection(Long id);
}
