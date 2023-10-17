package com.ms_voting_mgmt;

import java.util.List;

public interface CandidateService {
    List<Candidate> getAllCandidates();

    Candidate getCandidateById(Long candidateId);

    Candidate createCandidate(Candidate candidate);

    Candidate updateCandidate(Long candidateId, Candidate candidate);

    void deleteCandidate(Long candidateId);
}
