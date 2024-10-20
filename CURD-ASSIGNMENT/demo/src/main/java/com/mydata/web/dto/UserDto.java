package com.mydata.web.dto;

public class UserDto {

	private Long id;
    private String first_Name;
    private String last_Name;
    private Long phone_Number;
    private String email_Id;
    private String address;
    
    
    
    
	public UserDto(Long id, String first_Name, String last_Name, Long phone_Number, String email_Id, String address) {
		super();
		this.id = id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.phone_Number = phone_Number;
		this.email_Id = email_Id;
		this.address = address;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public Long getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(Long phone_Number) {
		this.phone_Number = phone_Number;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
    
}
