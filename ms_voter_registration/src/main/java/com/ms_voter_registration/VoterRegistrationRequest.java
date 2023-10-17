package com.ms_voter_registration;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="voter_registration")
public class VoterRegistrationRequest 
{
	@Id
	//@Column(columnDefinition="int default 0")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int voter_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
    private String last_name;
	
	@Column(name="date_of_birth")
    private LocalDate date_of_birth;
	
	@Column(name="address")
    private String address;
	
//	@Column(name="fingerprint")
//    private byte[] fingerprint;
//	
	@Column(name="extra_int_col")
    private int extra_int_col;
	
	@Column(name="extra_varchar_col")
    private String extra_varchar_col;
	
	@Column(name="is_deleted")
    private Boolean is_deleted;
	
	
	
	
    public VoterRegistrationRequest() {
		super();
		is_deleted=false;
	}

	// Constructor
	public VoterRegistrationRequest(int voter_id, String first_name, String last_name, LocalDate date_of_birth,
			String address, byte[] fingerprint, int extra_int_col, String extra_varchar_col, Boolean is_deleted) {
		super();
		this.voter_id = voter_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
		this.address = address;
		//this.fingerprint = fingerprint;
		this.extra_int_col = extra_int_col;
		this.extra_varchar_col = extra_varchar_col;
		this.is_deleted = is_deleted;
	}

	// Getters and setters
	public int getVoter_id() {
		return voter_id;
	}

	public void setVoter_id(int voter_id) {
		this.voter_id = voter_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
//
//	public byte[] getFingerprint() {
//		return fingerprint;
//	}
//
//	public void setFingerprint(byte[] fingerprint) {
//		this.fingerprint = fingerprint;
//	}

	public int getExtra_int_col() {
		return extra_int_col;
	}

	public void setExtra_int_col(int extra_int_col) {
		this.extra_int_col = extra_int_col;
	}

	public String getExtra_varchar_col() {
		return extra_varchar_col;
	}

	public void setExtra_varchar_col(String extra_varchar_col) {
		this.extra_varchar_col = extra_varchar_col;
	}

	public Boolean getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(Boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	@Override
	public String toString() {
		return "VoterRegistrationRequest [voter_id=" + voter_id + ", first_name=" + first_name + ", last_name="
				+ last_name + ", date_of_birth=" + date_of_birth + ", address=" + address + ", extra_int_col="
				+ extra_int_col + ", extra_varchar_col=" + extra_varchar_col + ", is_deleted=" + is_deleted + "]";
	}
    
    
	
	

}
