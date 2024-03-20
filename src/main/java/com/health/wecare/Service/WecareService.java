package com.health.wecare.Service;
import java.util.List;

import com.health.wecare.Entity.Appointment;
import com.health.wecare.Entity.Coach;
import com.health.wecare.Entity.User;

public interface WecareService {
	public Coach saveCoach(Coach addCoach);
	public Coach Coachlogin(Integer coachId,String password); 
	public List<Coach> fetchAllCoach();
//	user functionality
	public User saveUser(User addCoach);
	public User Userlogin(Integer coachId,String password); 
	//add Appointment
	public Appointment addAppointment(Appointment addAppointment);
	public List<Appointment> fetchUserAppointment(Integer userId);
	public List<Appointment> fetchCoachAppointment(String coachId);
   //update Appointment
	public Appointment updateAppointment(Appointment updateAppointment);
	//delete Appointment
	public String deleteAppointment(Integer appId);
	

	
}
