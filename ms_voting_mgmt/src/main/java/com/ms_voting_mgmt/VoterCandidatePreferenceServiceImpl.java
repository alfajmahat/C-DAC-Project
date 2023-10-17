package com.ms_voting_mgmt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoterCandidatePreferenceServiceImpl implements VoterCandidatePreferenceService {
    private final VoterCandidatePreferenceRepository preferenceRepository;

    @Autowired
    public VoterCandidatePreferenceServiceImpl(VoterCandidatePreferenceRepository preferenceRepository) {
        this.preferenceRepository = preferenceRepository;
    }

    @Override
    public VoterCandidatePreference saveVoterCandidatePreference(VoterCandidatePreference preference) {
        // Implement the save logic
        return preferenceRepository.save(preference);
    }

    @Override
    public VoterCandidatePreference getVoterCandidatePreferenceById(Long preferenceId) {
        // Implement retrieval logic by ID
        return preferenceRepository.findById(preferenceId).orElse(null);
    }

    @Override
    public List<VoterCandidatePreference> getAllVoterCandidatePreferences() {
        // Implement retrieval of all preferences
        return preferenceRepository.findAll();
    }

    // Implement other service methods as needed
}

