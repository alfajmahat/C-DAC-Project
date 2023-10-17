package com.ms_ballot_creation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectionServiceImpl implements ElectionService {
    @Autowired
    private ElectionRepository electionRepository;

    @Override
    public Election createElection(Election election) {
        return electionRepository.save(election);
    }


	@Override
	public Election updateElection(Long id, Election updatedElection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Election getElectionById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Election> getAllElections() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteElection(Long id) {
		// TODO Auto-generated method stub
		
	}

    // Implement other methods
}

