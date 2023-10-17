package com.ms_voting_mgmt;



import java.sql.Timestamp;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vote")
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vote_id")
    private Long voteId;

    @OneToOne
    @JoinColumn(name = "election_id")
    private Election electionId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @OneToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidateId;

    @Column(name = "vote_time")
    private Timestamp voteTime;

    @Column(name = "extra_col_1")
    private Long extraCol1;

    @Column(name = "extra_col_2", length = 50)
    private String extraCol2;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    // Getters and setters

    public Long getVoteId() {
        return voteId;
    }

    public void setVoteId(Long voteId) {
        this.voteId = voteId;
    }

    public Election getElectionId() {
        return electionId;
    }

    public void setElectionId(Election electionId) {
        this.electionId = electionId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Candidate getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Candidate candidateId) {
        this.candidateId = candidateId;
    }

    public Timestamp getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(Timestamp voteTime) {
        this.voteTime = voteTime;
    }

    public Long getExtraCol1() {
        return extraCol1;
    }

    public void setExtraCol1(Long extraCol1) {
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

	public Vote(Long voteId, Election electionId, User userId, Candidate candidateId, Timestamp voteTime, Long extraCol1,
			String extraCol2, Boolean isDeleted) {
		super();
		this.voteId = voteId;
		this.electionId = electionId;
		this.userId = userId;
		this.candidateId = candidateId;
		this.voteTime = voteTime;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Vote [voteId=" + voteId + ", electionId=" + electionId + ", userId=" + userId + ", candidateId="
				+ candidateId + ", voteTime=" + voteTime + ", extraCol1=" + extraCol1 + ", extraCol2=" + extraCol2
				+ ", isDeleted=" + isDeleted + ", getVoteId()=" + getVoteId() + ", getElectionId()=" + getElectionId()
				+ ", getUserId()=" + getUserId() + ", getCandidateId()=" + getCandidateId() + ", getVoteTime()="
				+ getVoteTime() + ", getExtraCol1()=" + getExtraCol1() + ", getExtraCol2()=" + getExtraCol2()
				+ ", getIsDeleted()=" + getIsDeleted() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
    
}

