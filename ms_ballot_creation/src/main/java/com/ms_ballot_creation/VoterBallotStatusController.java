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
@RequestMapping("/voter-ballot-statuses")
@CrossOrigin(origins = "*")
public class VoterBallotStatusController {
    @Autowired
    private VoterBallotStatusService statusService;

    @PostMapping
    public ResponseEntity<VoterBallotStatus> createVoterBallotStatus(@RequestBody VoterBallotStatus status) {
        VoterBallotStatus createdStatus = statusService.createVoterBallotStatus(status);
        return ResponseEntity.ok(createdStatus);
    }

    // Implement other endpoints for retrieving, updating, and deleting voter ballot statuses
}

