package com.ms_voting_mgmt;



import java.util.List;

public interface VoteService {
    List<Vote> getAllVotes();

    Vote getVoteById(Long voteId);

    Vote createVote(Vote vote);

    Vote updateVote(Long voteId, Vote vote);

    void deleteVote(Long voteId);
}
