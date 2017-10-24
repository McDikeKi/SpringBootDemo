package org.harvey.springbootdemo.controller;

import java.util.List;

import org.harvey.springbootdemo.dao.UserDao;
import org.harvey.springbootdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/getByName")
	public String getByName(String name){
		List<User> userList = userDao.findByName(name);  
		if (userList != null && userList.size()!=0) {  
			return "The user length is: " + userList.size();  
		}  
		return "user " + name + " is not exist.";  
	}
	
	@RequestMapping("/getByGender")
	public String getByGender(String gender){
		List<User> userList = userDao.findByGender(gender);  
		if (userList != null && userList.size()!=0) {  
			return "The user length is: " + userList.size();  
		}  
		return "user " + gender + " is not exist.";  
	}
	
	@RequestMapping("/getByAge")
	public String getByAge(int age){
		List<User> userList = userDao.findByAge(age);  
		if (userList != null && userList.size()!=0) {  
			return "The user length is: " + userList.size();  
		}  
		return "user " + age + " is not exist.";  
	}
	
	@RequestMapping("/getByAgeGreaterThan")
	public String getByAgeGreaterThan(int age){
		List<User> userList = userDao.findByAgeGreaterThan(age);  
		if (userList != null && userList.size()!=0) {  
			return "The user length is: " + userList.size();  
		}  
		return "user " + age + " is not exist.";  
	}
	
	@RequestMapping("/save")
	public String save(String id,String name,String gender,int age){ 
		userDao.save(new User(id, name,gender,age));
		return "user saved";
	}
	
	@RequestMapping("/updateNameById")
	public String updateNameById(String name,String id){ 
		userDao.updateNameById(name, id);
		return "user updated";
	}
	
	@RequestMapping("/deleteById")
	public String deleteById(String id){ 
		userDao.deleteById(id);
		return "user deleted";
	}
}
