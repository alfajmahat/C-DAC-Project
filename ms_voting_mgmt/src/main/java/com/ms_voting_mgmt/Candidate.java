package com.ms_voting_mgmt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_id")
    private Long candidateId;

    @ManyToOne
    @JoinColumn(name = "election_id")
    private Election election;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "party", length = 100)
    private String party;

    @Column(name = "bio", columnDefinition = "TEXT")
    private String bio;

    @Column(name = "is_approved")
    private Boolean isApproved;

    @Column(name = "extra_col_1")
    private Integer extraCol1;

    @Column(name = "extra_col_2", length = 50)
    private String extraCol2;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

	public void setCandidateId(Long candidateId2) {
		// TODO Auto-generated method stub
		
	}

	public Election getElection() {
		return election;
	}

	public void setElection(Election election) {
		this.election = election;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Boolean getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
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

	public Long getCandidateId() {
		return candidateId;
	}

	public Candidate(Long candidateId, Election election, String name, String party, String bio, Boolean isApproved,
			Integer extraCol1, String extraCol2, Boolean isDeleted) {
		super();
		this.candidateId = candidateId;
		this.election = election;
		this.name = name;
		this.party = party;
		this.bio = bio;
		this.isApproved = isApproved;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", election=" + election + ", name=" + name + ", party="
				+ party + ", bio=" + bio + ", isApproved=" + isApproved + ", extraCol1=" + extraCol1 + ", extraCol2="
				+ extraCol2 + ", isDeleted=" + isDeleted + ", getElection()=" + getElection() + ", getName()="
				+ getName() + ", getParty()=" + getParty() + ", getBio()=" + getBio() + ", getIsApproved()="
				+ getIsApproved() + ", getExtraCol1()=" + getExtraCol1() + ", getExtraCol2()=" + getExtraCol2()
				+ ", getIsDeleted()=" + getIsDeleted() + ", getCandidateId()=" + getCandidateId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

   
}
