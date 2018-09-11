package com.convochat.model;

public class User {

	private int uid;
	private String firstname;
	private String lastname;

	public User() {
		super();
	}

	public User(int uid, String firstname, String lastname) {
		super();
		this.uid = uid;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
