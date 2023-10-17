package com.ms_ballot_creation;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/elections")
@CrossOrigin(origins = "*")
public class ElectionController {
    @Autowired
    private ElectionService electionService;

    @PostMapping
    public ResponseEntity<Election> createElection(@RequestBody Election election) {
        Election createdElection = electionService.createElection(election);
        return new ResponseEntity<>(createdElection, HttpStatus.OK);
    }

    // Implement other endpoints for managing elections here
}


