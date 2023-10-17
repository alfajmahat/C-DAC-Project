package com.ms_ballot_creation;

//import org.springframework.security.core.userdetails.User;

//import org.apache.catalina.User;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
public class VoterBallotStatus {
       
	@Id
//	@ManyToOne(targetEntity = Voter.class)
    //@Join
    @Column(name = "voter_id")
    private int voter;

	@ManyToOne(targetEntity = Ballot.class)
    @JoinColumn(name = "ballot_id")
    private Ballot ballot;

    @Column(name = "has_voted")
    private Boolean hasVoted;

    @Column(name = "extra_col_1")
    private Integer extraCol1;

    @Column(name = "extra_col_2", length = 50)
    private String extraCol2;

    @Column(name = "is_deleted")
    private Boolean isDeleted;
    
    //constructor
    
 
    public VoterBallotStatus(int voter, Ballot ballot, Boolean hasVoted, Integer extraCol1, String extraCol2,
			Boolean isDeleted) {
		super();
		this.voter = voter;
		this.ballot = ballot;
		this.hasVoted = hasVoted;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.isDeleted = isDeleted;
	}

    // getters and setters
    
	public int getVoter() {
		return voter;
	}

	public void setVoter(int voter) {
		this.voter = voter;
	}

	public Boolean getHasVoted() {
		return hasVoted;
	}

	public void setHasVoted(Boolean hasVoted) {
		this.hasVoted = hasVoted;
	}

	public Integer getExtraCol1() {
		return extraCol1;
	}

	public void setExtraCol1(Integer extraCol1) {
		this.extraCol1 = extraCol1;
	}

	public String getExtraCol2() {
		return extraCol2;
	}

	public void setExtraCol2(String extraCol2) {
		this.extraCol2 = extraCol2;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}



    
    
    
    
}

