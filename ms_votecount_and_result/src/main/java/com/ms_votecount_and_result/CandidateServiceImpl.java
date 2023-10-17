package com.ms_votecount_and_result;
//import com.ms_voting_mgmt.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CandidateServiceImpl implements CandidateService {
    private final CandidateRepository candidateRepository;

    @Autowired
    public CandidateServiceImpl(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate getCandidateById(Long id) {
        Optional<Candidate> candidate = candidateRepository.findById(id);
        return candidate.orElse(null);
    }

    @Override
    public Candidate createCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    @Transactional
    public Candidate updateCandidate(Long id, Candidate candidate) {
        Candidate existingCandidate = getCandidateById(id);
        if (existingCandidate != null) {
            // Update the fields you want to change
            existingCandidate.setCandidateName(candidate.getCandidateName());
            existingCandidate.setPartyName(candidate.getPartyName());
            existingCandidate.setExtraIntCol(candidate.getExtraIntCol());
            existingCandidate.setExtraVarcharCol(candidate.getExtraVarcharCol());
            existingCandidate.setIsDeleted(candidate.getIsDeleted());
            return candidateRepository.save(existingCandidate);
        }
        return null;
    }

    @Override
    public void deleteCandidate(Long id) {
        candidateRepository.deleteById(id);
    }
}

