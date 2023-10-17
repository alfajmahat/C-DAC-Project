package com.ms_votecount_and_result;
//import com.ms_voting_mgmt.*;


import jakarta.persistence.*;

@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_id")
    private Long id;

    @Column(name = "candidate_name", length = 100)
    private String candidateName;

    @Column(name = "party_name", length = 100)
    private String partyName;

    @Column(name = "extra_int_col")
    private Integer extraIntCol;

    @Column(name = "extra_varchar_col", length = 50)
    private String extraVarcharCol;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

	public Candidate(Long id, String candidateName, String partyName, Integer extraIntCol, String extraVarcharCol,
			Boolean isDeleted) {
		super();
		this.id = id;
		this.candidateName = candidateName;
		this.partyName = partyName;
		this.extraIntCol = extraIntCol;
		this.extraVarcharCol = extraVarcharCol;
		this.isDeleted = isDeleted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
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

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", candidateName=" + candidateName + ", partyName=" + partyName
				+ ", extraIntCol=" + extraIntCol + ", extraVarcharCol=" + extraVarcharCol + ", isDeleted=" + isDeleted
				+ ", getId()=" + getId() + ", getCandidateName()=" + getCandidateName() + ", getPartyName()="
				+ getPartyName() + ", getExtraIntCol()=" + getExtraIntCol() + ", getExtraVarcharCol()="
				+ getExtraVarcharCol() + ", getIsDeleted()=" + getIsDeleted() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

    
   
}

