package com.ms_voter_registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterRegistrationService 
{
	@Autowired
	private VoterRegRepo voterRegRepo;
	
	  public String registerVoter(VoterRegistrationRequest request) {
		  
		  System.out.println("\n\n");
		  System.out.println(request);
	        voterRegRepo.save(request);
	        return "Voter registered successfully!!!";
	    }
}
