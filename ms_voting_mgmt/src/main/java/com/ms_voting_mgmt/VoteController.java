package com.ms_voting_mgmt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/votes")
@CrossOrigin(origins = "*")
public class VoteController {
    private final VoteService voteService;

    @Autowired
    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @GetMapping
    public ResponseEntity<List<Vote>> getAllVotes() {
        List<Vote> votes = voteService.getAllVotes();
        return new ResponseEntity<>(votes, HttpStatus.OK);
    }

    @GetMapping("/{voteId}")
    public ResponseEntity<Vote> getVoteById(@PathVariable Long voteId) {
        Vote vote = voteService.getVoteById(voteId);
        if (vote != null) {
            return new ResponseEntity<>(vote, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Vote> createVote(@RequestBody Vote vote) {
        Vote createdVote = voteService.createVote(vote);
        return new ResponseEntity<>(createdVote, HttpStatus.CREATED);
    }

    @PutMapping("/{voteId}")
    public ResponseEntity<Vote> updateVote(@PathVariable Long voteId, @RequestBody Vote vote) {
        Vote updatedVote = voteService.updateVote(voteId, vote);
        if (updatedVote != null) {
            return new ResponseEntity<>(updatedVote, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{voteId}")
    public ResponseEntity<Void> deleteVote(@PathVariable Long voteId) {
        voteService.deleteVote(voteId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
