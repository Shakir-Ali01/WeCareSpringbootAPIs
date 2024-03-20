package com.health.wecare.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.wecare.Entity.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer>{
 List<Appointment> findByUserId(Integer Id);
 List<Appointment> findByCoachId(String Id);
 
}
