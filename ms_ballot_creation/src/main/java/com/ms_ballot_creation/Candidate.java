package com.ms_ballot_creation;

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
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ballot_id")
    private Ballot ballot;

    @Column(name = "candidate_name")
    private String name;

    @Column(name = "candidate_info", columnDefinition = "TEXT")
    private String info;

    @Column(name = "party", length = 50)
    private String party;

    @Column(name = "votes_received")
    private Integer votesReceived;

    @Column(name = "extra_col_1")
    private Integer extraCol1;

    @Column(name = "extra_col_2", length = 50)
    private String extraCol2;

    @Column(name = "is_deleted")
    private Boolean isDeleted;
    
    //constructor
    
 public Candidate(Long id, Ballot ballot, String name, String info, String party, Integer votesReceived,
			Integer extraCol1, String extraCol2, Boolean isDeleted) {
		super();
		this.id = id;
		this.ballot = ballot;
		this.name = name;
		this.info = info;
		this.party = party;
		this.votesReceived = votesReceived;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.isDeleted = isDeleted;
	}

// Getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ballot getBallot() {
		return ballot;
	}

	public void setBallot(Ballot ballot) {
		this.ballot = ballot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public Integer getVotesReceived() {
		return votesReceived;
	}

	public void setVotesReceived(Integer votesReceived) {
		this.votesReceived = votesReceived;
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

