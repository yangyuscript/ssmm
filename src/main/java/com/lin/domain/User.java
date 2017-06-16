package com.lin.domain;  
   
public class User {  
    private Integer id;  
    private String name;  
    private String password;  
    private String email;  
  
    
    public User(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	@Override  
    public String toString() {  
        return "User [userId=" + id + ", userName=" + name  
                + ", userPassword=" + password + ", userEmail=" + email  
                + "]";  
    }  
      
}  