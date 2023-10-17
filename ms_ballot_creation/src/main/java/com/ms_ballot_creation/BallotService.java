package com.ms_ballot_creation;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BallotService {
    Ballot createBallot(Ballot ballot);
    Ballot updateBallot(Long id, Ballot updatedBallot);
    Ballot getBallotById(Long id);
    List<Ballot> getAllBallots();
    void deleteBallot(Long id);
}

