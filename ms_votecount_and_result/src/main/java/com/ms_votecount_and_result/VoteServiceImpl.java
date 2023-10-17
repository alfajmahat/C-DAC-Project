package com.ms_votecount_and_result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

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
    public Vote getVoteById(Long id) {
        return voteRepository.findById(id).orElse(null);
    }

    @Override
    public Vote createVote(Vote vote) {
        return voteRepository.save(vote);
    }

    @Override
    public Vote updateVote(Long id, Vote vote) {
        // Check if the vote with the given id exists
        if (!voteRepository.existsById(id)) {
            return null; // Handle the case where the vote doesn't exist
        }

        // Update the vote's fields
        vote.setId(id);
        return voteRepository.save(vote);
    }

    @Override
    public void deleteVote(Long id) {
        voteRepository.deleteById(id);
    }
}

