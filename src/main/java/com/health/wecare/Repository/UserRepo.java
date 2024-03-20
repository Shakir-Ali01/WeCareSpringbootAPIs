package com.health.wecare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.health.wecare.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	  User findByNumber(Long number);
	  User findByIdAndPassword(Integer id,String Password);

}
