package com.ms_ballot_creation;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface VoterBallotStatusService {
    VoterBallotStatus createVoterBallotStatus(VoterBallotStatus status);
    VoterBallotStatus updateVoterBallotStatus(Long id, VoterBallotStatus updatedStatus);
    VoterBallotStatus getVoterBallotStatusById(Long id);
    List<VoterBallotStatus> getAllVoterBallotStatuses();
    void deleteVoterBallotStatus(Long id);
}

