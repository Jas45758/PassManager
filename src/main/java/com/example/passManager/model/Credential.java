package com.example.passManager.model;

public class Credential {
	private String username;
	private String service;
	private String encryptedPassword;
	
	public Credential() {
		
	}
	
	public  Credential(String username, String service, String encryptedPassword) {
		this.username = username;
		this.service = service;
		this.encryptedPassword = encryptedPassword;
	}
	
	public String getUsername() {
		return username;
	}
	public String getService() {
		return service;
	} 
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	
   
    public void setUsername(String username) {
    	this.username = username;
    }
    public void setService(String service) {
    	this.service = service;
    }
    
    public void getEncryptedPassword(String encryptedPassword) {
    	this.encryptedPassword = encryptedPassword;
    }


}
