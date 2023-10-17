package com.ms_ballot_creation;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/ballots")
@CrossOrigin(origins = "*")
public class BallotController {
    @Autowired
    private BallotService ballotService;

    
    @GetMapping
    public String ballotHome()
    {
    	return "Inside Ballot";
    }
    
    @PostMapping("/create")
    public ResponseEntity<Ballot> createBallot(@RequestBody Ballot ballot) {
        // Implement the endpoint for creating a ballot
    	System.out.println(ballot);
        Ballot createdBallot = ballotService.createBallot(ballot);
        return ResponseEntity.ok(createdBallot);
    }

    // Implement other endpoints for managing ballots
}
