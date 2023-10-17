package com.ms_voting_mgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ElectionServiceImpl implements ElectionService {

    private final ElectionRepository electionRepository;

    @Autowired
    public ElectionServiceImpl(ElectionRepository electionRepository) {
        this.electionRepository = electionRepository;
    }

    @Override
    public List<Election> getAllElections() {
        return electionRepository.findAll();
    }

    @Override
    public Election getElectionById(Long id) {
        return electionRepository.findById(id).orElse(null);
    }

    @Override
    public Election createElection(Election election) {
    	System.out.println(election);
        return electionRepository.save(election);
    }

    @Override
    public Election updateElection(Long id, Election election) {
        if (electionRepository.existsById(id)) {
            election.setId(id);
            return electionRepository.save(election);
        }
        return null; // Handle the case where the election with the given id doesn't exist
    }

    @Override
    public void deleteElection(Long id) {
        electionRepository.deleteById(id);
    }
}

