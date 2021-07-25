package com.test.streams.mapvsflatmap;

import java.util.List;

public class Customer {
	
	private int id;
	private String name;
	private String email;
	private List<String> phoneNum;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phoneNum
	 */
	public List<String> getPhoneNum() {
		return phoneNum;
	}
	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(List<String> phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Customer(int id, String name, String email, List<String> phoneNum) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phoneNum=" + phoneNum + "]";
	}
	
	

}
