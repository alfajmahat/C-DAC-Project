package com.ms_voting_mgmt;

import java.util.List;

public interface VoterCandidatePreferenceService {
    VoterCandidatePreference saveVoterCandidatePreference(VoterCandidatePreference preference);

    VoterCandidatePreference getVoterCandidatePreferenceById(Long preferenceId);

    List<VoterCandidatePreference> getAllVoterCandidatePreferences();

    // Define other service methods as needed
}
