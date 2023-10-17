package com.ms_ballot_creation;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CandidateService {
    Candidate createCandidate(Candidate candidate);
    Candidate updateCandidate(Long id, Candidate updatedCandidate);
    Candidate getCandidateById(Long id);
    List<Candidate> getAllCandidates();
    void deleteCandidate(Long id);
}

