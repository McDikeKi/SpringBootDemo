package org.harvey.springbootdemo.dao;

import java.util.List;

import org.harvey.springbootdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface UserDao extends JpaRepository<User, Integer>{
	public User findById(String id);
	public List<User> findByName(String name);
	public List<User> findByGender(String name);
	public List<User> findByAge(int age);
	public List<User> findByAgeGreaterThan(int min);  
	
	@Transactional
	@Modifying
	@Query(value = "delete from user where id=?1",nativeQuery = true)
	public void deleteById(String id);
	
	@Transactional
	@Modifying
	@Query(value = "update user set name=?1 where id=?2 ",nativeQuery = true)
	public void updateNameById(String name,String id);
}
