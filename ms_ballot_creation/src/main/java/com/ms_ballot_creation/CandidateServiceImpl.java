package com.ms_ballot_creation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl implements CandidateService {
	@Autowired
	private CandidateRepository candRepo;
	
	@Override
    public Candidate createCandidate(Candidate candidate)
    {
    	return candRepo.save(candidate);
    }
    

	@Override
	public Candidate updateCandidate(Long id, Candidate updatedCandidate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Candidate getCandidateById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Candidate> getAllCandidates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCandidate(Long id) {
		// TODO Auto-generated method stub
		
	}

    // Implement other methods
}

