package com.ms_voting_mgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Candidate getCandidateById(Long candidateId) {
        return candidateRepository.findById(candidateId).orElse(null);
    }

    @Override
    public Candidate createCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public Candidate updateCandidate(Long candidateId, Candidate candidate) {
        if (candidateRepository.existsById(candidateId)) {
            candidate.setCandidateId(candidateId);
            return candidateRepository.save(candidate);
        }
        return null; // Candidate with the given ID does not exist
    }

    @Override
    public void deleteCandidate(Long candidateId) {
        candidateRepository.deleteById(candidateId);
    }
}

