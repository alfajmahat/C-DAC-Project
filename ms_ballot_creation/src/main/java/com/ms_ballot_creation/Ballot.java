package com.ms_ballot_creation;

//import java.time.LocalDate;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
////import jakarta.persistence.JoinColumn;
//import jakarta.persistence.Lob;
////import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;


import java.time.LocalDate;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="Ballot")
public class Ballot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ballot_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "election_id")
    private Election election;

    @Column(name = "ballot_name")
    private String name;

    @Column(name = "ballot_description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "is_open")
    private Boolean isOpen;

    @Lob
    @Column(name = "fingerprint")
    private byte[] fingerprint;

    @Column(name = "extra_col_1")
    private Integer extraCol1;

    @Column(name = "extra_col_2", length = 50)
    private String extraCol2;

    @Column(name = "is_deleted")
    private Boolean isDeleted;
    
  
    //constructor
    
    public Ballot(Long id, Election election, String name, String description, LocalDate startDate, LocalDate endDate,
			Boolean isOpen, byte[] fingerprint, Integer extraCol1, String extraCol2, Boolean isDeleted) {
		super();
		this.id = id;
		this.election = election;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isOpen = isOpen;
		this.fingerprint = fingerprint;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Boolean getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	public byte[] getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(byte[] fingerprint) {
		this.fingerprint = fingerprint;
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

	@Override
	public String toString() {
		return "Ballot [id=" + id + ", election=" + election + ", name=" + name + ", description=" + description
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", isOpen=" + isOpen + ", fingerprint="
				+ Arrays.toString(fingerprint) + ", extraCol1=" + extraCol1 + ", extraCol2=" + extraCol2
				+ ", isDeleted=" + isDeleted + "]";
	}

   
    
}
