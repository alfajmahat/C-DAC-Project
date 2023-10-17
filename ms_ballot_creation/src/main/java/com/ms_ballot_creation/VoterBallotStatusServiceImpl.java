package com.ms_ballot_creation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterBallotStatusServiceImpl implements VoterBallotStatusService {
    @Autowired
    private VoterBallotStatusRepository statusRepository;

    @Override
    public VoterBallotStatus createVoterBallotStatus(VoterBallotStatus status) {
        return statusRepository.save(status);
    }


	@Override
	public VoterBallotStatus updateVoterBallotStatus(Long id, VoterBallotStatus updatedStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VoterBallotStatus getVoterBallotStatusById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VoterBallotStatus> getAllVoterBallotStatuses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteVoterBallotStatus(Long id) {
		// TODO Auto-generated method stub
		
	}

    // Implement other methods
}
