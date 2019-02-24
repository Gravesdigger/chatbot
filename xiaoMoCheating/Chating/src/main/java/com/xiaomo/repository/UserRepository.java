package com.xiaomo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.xiaomo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User>{
	
	@Query(value="SELECT * FROM User WHERE name=?1 AND password=?2 AND status=1",nativeQuery=true)
	public User searchByNameAndPassword(String name,String password);
	
	@Query(value="SELECT * FROM User WHERE name=?1 AND status=1",nativeQuery=true)
	public User searchByName(String name);
	
}
