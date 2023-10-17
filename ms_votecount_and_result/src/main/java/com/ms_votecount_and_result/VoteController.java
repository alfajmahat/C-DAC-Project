package com.ms_votecount_and_result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/votes")
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

    @GetMapping("/{id}")
    public ResponseEntity<Vote> getVoteById(@PathVariable Long id) {
        Vote vote = voteService.getVoteById(id);
        if (vote == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(vote, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Vote> createVote(@RequestBody Vote vote) {
        Vote createdVote = voteService.createVote(vote);
        return new ResponseEntity<>(createdVote, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vote> updateVote(@PathVariable Long id, @RequestBody Vote vote) {
        Vote updatedVote = voteService.updateVote(id, vote);
        if (updatedVote == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedVote, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVote(@PathVariable Long id) {
        voteService.deleteVote(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

