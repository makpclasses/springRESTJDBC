package com.amky.model;

public class Account {
	
	private int id;
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String phone;
	
	
	public Account() {
		 
    }
 
    public Account(Integer id, 
    				String username,
    				String password,
    				String email,
    				String firstName, 
    				String lastName, 
    				String address1,
    				String address2,
    				String city,
    				String state,
    				String zip,
    				String phone) {
        super();
        this.id = id;
        this.username = username;
		this.password = password;
		this.email=email;
        this.firstName = firstName;
        this.lastName = lastName;
		this.address1=address1;
		this.address2=address2;
		this.city = city;
		this.state=state;
		this.zip=zip;
		this.phone=phone;
        
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

    
    
}
