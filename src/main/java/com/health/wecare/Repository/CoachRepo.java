package com.health.wecare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.wecare.Entity.Coach;

public interface CoachRepo extends JpaRepository<Coach, Integer>{
  Coach findByNumber(Long number);
  Coach findByIdAndPassword(Integer id,String Password);
}
