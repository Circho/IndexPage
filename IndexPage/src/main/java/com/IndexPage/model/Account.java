package com.IndexPage.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


/**
 *实体类 
 * @author huangyuan
 *
 */
@Entity
@Table(name="account")
public class Account   {
	   
	   @Id
	   @GeneratedValue//主键一般这样设置就可以了@GenericGenerator是特殊主键设置方法
	   private Long Id;
	   
	   @Column(unique=true)
	   @NotNull
	   @Size(min = 1, max = 25)
	   //@Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
	   private String UserName;
	   
	   @NotEmpty
	   @Size(min = 1, max = 25)
	   private String Password;
	   
	   @Column(unique=true)	   
	   @Email
	   private String Email;
	   
	   @Max(10)
	   private int Level;


/*
 * 
 * getter and setter method
 */
	   
	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public int getLevel() {
		return Level;
	}


	public void setLevel(int level) {
		Level = level;
	}


	   

	   
	   
	   

}
