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
@Table(name = "Voter_Candidate_Preference")
public class VoterCandidatePreference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "preference_id")
    private Long preferenceId;

    @ManyToOne
    @JoinColumn(name = "vote_id")
    private Vote vote;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @Column(name = "preference_order")
    private Integer preferenceOrder;

    @Column(name = "extra_col_1")
    private Integer extraCol1;

    @Column(name = "extra_col_2", length = 50)
    private String extraCol2;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

	public Long getPreferenceId() {
		return preferenceId;
	}

	public void setPreferenceId(Long preferenceId) {
		this.preferenceId = preferenceId;
	}

	public Vote getVote() {
		return vote;
	}

	public void setVote(Vote vote) {
		this.vote = vote;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Integer getPreferenceOrder() {
		return preferenceOrder;
	}

	public void setPreferenceOrder(Integer preferenceOrder) {
		this.preferenceOrder = preferenceOrder;
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

	public VoterCandidatePreference(Long preferenceId, Vote vote, Candidate candidate, Integer preferenceOrder,
			Integer extraCol1, String extraCol2, Boolean isDeleted) {
		super();
		this.preferenceId = preferenceId;
		this.vote = vote;
		this.candidate = candidate;
		this.preferenceOrder = preferenceOrder;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "VoterCandidatePreference [preferenceId=" + preferenceId + ", vote=" + vote + ", candidate=" + candidate
				+ ", preferenceOrder=" + preferenceOrder + ", extraCol1=" + extraCol1 + ", extraCol2=" + extraCol2
				+ ", isDeleted=" + isDeleted + ", getPreferenceId()=" + getPreferenceId() + ", getVote()=" + getVote()
				+ ", getCandidate()=" + getCandidate() + ", getPreferenceOrder()=" + getPreferenceOrder()
				+ ", getExtraCol1()=" + getExtraCol1() + ", getExtraCol2()=" + getExtraCol2() + ", getIsDeleted()="
				+ getIsDeleted() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

    // Constructors, getters, setters
    
    
}
