package com.ms_votecount_and_result;
//import com.ms_voting_mgmt.*;

import java.util.List;

public interface CandidateService {
    List<Candidate> getAllCandidates();
    Candidate getCandidateById(Long id);
    Candidate createCandidate(Candidate candidate);
    Candidate updateCandidate(Long id, Candidate candidate);
    void deleteCandidate(Long id);
}

