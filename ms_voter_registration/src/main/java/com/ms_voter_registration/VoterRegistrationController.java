package com.ms_voter_registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voter")
@CrossOrigin(origins = "*")
public class VoterRegistrationController 
{
	 @Autowired
	    private VoterRegistrationService voterRegistrationService;

	    @PostMapping("/register")
	    public ResponseEntity<String> registerVoter(@RequestBody VoterRegistrationRequest request) {
	        String response = voterRegistrationService.registerVoter(request);
	        return ResponseEntity.ok(response);
	    }
	    @GetMapping("/register")
	    public String regHome()
	    {
	    	return "Inside Registration";
	    }
}
