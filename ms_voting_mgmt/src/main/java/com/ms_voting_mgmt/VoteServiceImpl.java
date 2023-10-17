package com.ms_voting_mgmt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoteServiceImpl implements VoteService {
    private final VoteRepository voteRepository;

    @Autowired
    public VoteServiceImpl(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @Override
    public List<Vote> getAllVotes() {
        return voteRepository.findAll();
    }

    @Override
    public Vote getVoteById(Long voteId) {
        Optional<Vote> vote = voteRepository.findById(voteId);
        return vote.orElse(null);
    }

    @Override
    public Vote createVote(Vote vote) {
        return voteRepository.save(vote);
    }

    @Override
    public Vote updateVote(Long voteId, Vote updatedVote) {
        Optional<Vote> existingVote = voteRepository.findById(voteId);

        if (existingVote.isPresent()) {
            updatedVote.setVoteId(voteId);
            return voteRepository.save(updatedVote);
        }

        return null;
    }

    @Override
    public void deleteVote(Long voteId) {
        voteRepository.deleteById(voteId);
    }
}
