package com.ms_votecount_and_result;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Arrays;


@Entity
@Table(name = "vote")
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vote_id")
    private Long id;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Lob
    @Column(name = "fingerprint")
    private byte[] fingerprint;

    @Column(name = "extra_int_col")
    private Integer extraIntCol;

    @Column(name = "extra_varchar_col", length = 50)
    private String extraVarcharCol;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "voter_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public byte[] getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(byte[] fingerprint) {
		this.fingerprint = fingerprint;
	}

	public Integer getExtraIntCol() {
		return extraIntCol;
	}

	public void setExtraIntCol(Integer extraIntCol) {
		this.extraIntCol = extraIntCol;
	}

	public String getExtraVarcharCol() {
		return extraVarcharCol;
	}

	public void setExtraVarcharCol(String extraVarcharCol) {
		this.extraVarcharCol = extraVarcharCol;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Long getId() {
		return id;
	}

	public Vote(Long id, Timestamp timestamp, byte[] fingerprint, Integer extraIntCol, String extraVarcharCol,
			Boolean isDeleted, User user, Candidate candidate) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.fingerprint = fingerprint;
		this.extraIntCol = extraIntCol;
		this.extraVarcharCol = extraVarcharCol;
		this.isDeleted = isDeleted;
		this.user = user;
		this.candidate = candidate;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", timestamp=" + timestamp + ", fingerprint=" + Arrays.toString(fingerprint)
				+ ", extraIntCol=" + extraIntCol + ", extraVarcharCol=" + extraVarcharCol + ", isDeleted=" + isDeleted
				+ ", user=" + user + ", candidate=" + candidate + ", getTimestamp()=" + getTimestamp()
				+ ", getFingerprint()=" + Arrays.toString(getFingerprint()) + ", getExtraIntCol()=" + getExtraIntCol()
				+ ", getExtraVarcharCol()=" + getExtraVarcharCol() + ", getIsDeleted()=" + getIsDeleted()
				+ ", getUser()=" + getUser() + ", getCandidate()=" + getCandidate() + ", getId()=" + getId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



    // Constructors, getters, setters, and other methods...
}

