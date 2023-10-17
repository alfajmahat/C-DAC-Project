package com.ms_votecount_and_result;
//import com.ms_voting_mgmt.*;




import jakarta.persistence.*;

@Entity
@Table(name = "results")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private Long resultId;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @Column(name = "total_votes")
    private Integer totalVotes;

    @Column(name = "is_winner")
    private Boolean isWinner;

    @Column(name = "extra_int_col")
    private Integer extraIntCol;

    @Column(name = "extra_varchar_col", length = 50)
    private String extraVarcharCol;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

	public Long getResultId() {
		return resultId;
	}

	public void setResultId(Long resultId) {
		this.resultId = resultId;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Integer getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(Integer totalVotes) {
		this.totalVotes = totalVotes;
	}

	public Boolean getIsWinner() {
		return isWinner;
	}

	public void setIsWinner(Boolean isWinner) {
		this.isWinner = isWinner;
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
		return "Result [resultId=" + resultId + ", candidate=" + candidate + ", totalVotes=" + totalVotes
				+ ", isWinner=" + isWinner + ", extraIntCol=" + extraIntCol + ", extraVarcharCol=" + extraVarcharCol
				+ ", isDeleted=" + isDeleted + ", getResultId()=" + getResultId() + ", getCandidate()=" + getCandidate()
				+ ", getTotalVotes()=" + getTotalVotes() + ", getIsWinner()=" + getIsWinner() + ", getExtraIntCol()="
				+ getExtraIntCol() + ", getExtraVarcharCol()=" + getExtraVarcharCol() + ", getIsDeleted()="
				+ getIsDeleted() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Result(Long resultId, Candidate candidate, Integer totalVotes, Boolean isWinner, Integer extraIntCol,
			String extraVarcharCol, Boolean isDeleted) {
		super();
		this.resultId = resultId;
		this.candidate = candidate;
		this.totalVotes = totalVotes;
		this.isWinner = isWinner;
		this.extraIntCol = extraIntCol;
		this.extraVarcharCol = extraVarcharCol;
		this.isDeleted = isDeleted;
	}


}

