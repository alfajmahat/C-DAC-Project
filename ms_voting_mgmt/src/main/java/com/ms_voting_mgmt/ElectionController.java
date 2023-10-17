package com.ms_voting_mgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/elections")
@CrossOrigin(origins = "*")
public class ElectionController {

    private final ElectionService electionService;

    @Autowired
    public ElectionController(ElectionService electionService) {
        this.electionService = electionService;
    }

    @GetMapping
    public List<Election> getAllElections() {
        return electionService.getAllElections();
    }

    @GetMapping("/{id}")
    public Election getElectionById(@PathVariable Long id) {
        return electionService.getElectionById(id);
    }

    @PostMapping
    public Election createElection(@RequestBody Election election) {
        return electionService.createElection(election);
    }

    @PutMapping("/{id}")
    public Election updateElection(@PathVariable Long id, @RequestBody Election election) {
        return electionService.updateElection(id, election);
    }

    @DeleteMapping("/{id}")
    public void deleteElection(@PathVariable Long id) {
        electionService.deleteElection(id);
    }
}

