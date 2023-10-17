package com.ms_voting_mgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/preferences")
@CrossOrigin(origins = "*")
public class VoterCandidatePreferenceController {
    private final VoterCandidatePreferenceService preferenceService;

    @Autowired
    public VoterCandidatePreferenceController(VoterCandidatePreferenceService preferenceService) {
        this.preferenceService = preferenceService;
    }

    @PostMapping("/create")
    public VoterCandidatePreference createPreference(@RequestBody VoterCandidatePreference preference) {
        return preferenceService.saveVoterCandidatePreference(preference);
    }

    @GetMapping("/{preferenceId}")
    public VoterCandidatePreference getPreferenceById(@PathVariable Long preferenceId) {
        return preferenceService.getVoterCandidatePreferenceById(preferenceId);
    }

    @GetMapping("/all")
    public List<VoterCandidatePreference> getAllPreferences() {
        return preferenceService.getAllVoterCandidatePreferences();
    }

    // Define other REST endpoints for CRUD operations as needed
}
