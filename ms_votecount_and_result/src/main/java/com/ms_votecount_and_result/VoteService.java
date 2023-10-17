package com.ms_votecount_and_result;

import java.util.List;

public interface VoteService {
    List<Vote> getAllVotes();

    Vote getVoteById(Long id);

    Vote createVote(Vote vote);

    Vote updateVote(Long id, Vote vote);

    void deleteVote(Long id);
}
