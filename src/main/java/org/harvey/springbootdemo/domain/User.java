package org.harvey.springbootdemo.domain;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	@Id
	private String id;
	
	@Column(name = "name", nullable = false,length = 10)
	private String name;
	
	@Column(name = "gender",nullable = true,length = 6)
	private String gender;
	
	@Column(name = "age",nullable = true,length = 3)
	private int age;

	public User(){ }
	
	public User(String id,String name){
		this.id = id;
		this.name = name;
	}
	
	public User(String id,String name,String gender,int age){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
