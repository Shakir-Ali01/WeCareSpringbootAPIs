package com.health.wecare.Service;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.wecare.Entity.Appointment;
import com.health.wecare.Entity.Coach;
import com.health.wecare.Entity.User;
import com.health.wecare.Repository.AppointmentRepo;
import com.health.wecare.Repository.CoachRepo;
import com.health.wecare.Repository.UserRepo;

@Service
public class WeCareServiceImpl implements WecareService{

	@Autowired
	private CoachRepo coachRepo;
	
	
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private AppointmentRepo appointmentRepo;
	
	public Coach saveCoach(Coach addCoach) { 
	 Coach checkThisNumberIsExists=coachRepo.findByNumber(addCoach.getNumber());
	   if(checkThisNumberIsExists!=null)
	   {
		   return checkThisNumberIsExists;
	   }
	   else {
		   Coach addedCoach= coachRepo.save(addCoach);
		   addCoach.setId(addedCoach.getId());
		   return addCoach;
	   }
	
	}
	@Override
	public Coach Coachlogin(Integer coachId, String password) {
		// TODO Auto-generated method stub
		Coach LoginCoachInfo=coachRepo.findByIdAndPassword(coachId,password);
		return LoginCoachInfo;
	}
	@Override
	public User saveUser(User addUser) {
		 User checkThisNumberIsExists=userRepo.findByNumber(addUser.getNumber());
		   if(checkThisNumberIsExists!=null)
		   {
			   return checkThisNumberIsExists;
		   }
		   else {
			   User addedUser= userRepo.save(addUser);
			   addUser.setId(addedUser.getId());
			   return addUser;
		   }
	}
	@Override
	public User Userlogin(Integer userId, String password) {
		// TODO Auto-generated method stub
		User LoginUserInfo=userRepo.findByIdAndPassword(userId,password);
		return LoginUserInfo;
	}
	@Override
	public List<Coach> fetchAllCoach() {
		// TODO Auto-generated method stub
		Iterable<Coach> defects = coachRepo.findAll();
		List<Coach> coachentity = new ArrayList<>();
		defects.forEach(coach -> {
			Coach coachEntity = new Coach();
			coachEntity.setDob(coach.getDob());
			coachEntity.setGender(coach.getGender());
			coachEntity.setId(coach.getId());
			coachEntity.setName(coach.getName());
			coachEntity.setNumber(coach.getNumber());
			coachEntity.setSpeciality(coach.getSpeciality());
			coachentity.add(coachEntity);
		});
		return coachentity;
	}
	@Override
	public Appointment addAppointment(Appointment addAppointment) {
		// TODO Auto-generated method stub
		Appointment app=appointmentRepo.save(addAppointment);
		  addAppointment.setId(app.getId());
		  return addAppointment;
	}
	@Override
	public List<Appointment> fetchUserAppointment(Integer userId) {
		Iterable<Appointment> app = appointmentRepo.findByUserId(userId);
		List<Appointment> appointentity = new ArrayList<>();
		app.forEach(appoint -> {
			Appointment appointEntity = new Appointment();
			appointEntity.setAppointmentDate(appoint.getAppointmentDate());
			appointEntity.setCoachId(appoint.getCoachId());
			appointEntity.setId(appoint.getId());
			appointEntity.setSlot(appoint.getSlot());
			appointEntity.setUserId(appoint.getUserId());			
			appointentity.add(appointEntity);
		});
		return appointentity;
	}
	@Override
	public List<Appointment> fetchCoachAppointment(String coachId) {
		// TODO Auto-generated method stub
		Iterable<Appointment> cApp = appointmentRepo.findByCoachId(coachId);
		List<Appointment> appointentity = new ArrayList<>();
		cApp.forEach(appoint -> {
			Appointment appointEntity = new Appointment();
			appointEntity.setAppointmentDate(appoint.getAppointmentDate());
			appointEntity.setCoachId(appoint.getCoachId());
			appointEntity.setId(appoint.getId());
			appointEntity.setSlot(appoint.getSlot());
			appointEntity.setUserId(appoint.getUserId());			
			appointentity.add(appointEntity);
		});
		return appointentity;
	}
	@Override
	public Appointment updateAppointment(Appointment updateAppointment) {
		// TODO Auto-generated method stub
		Optional getAppointmentValue=appointmentRepo.findById(updateAppointment.getId());
		Appointment aEntity=(Appointment) getAppointmentValue.get();
		aEntity.setAppointmentDate(updateAppointment.getAppointmentDate());
		aEntity.setSlot(updateAppointment.getSlot());
		return appointmentRepo.save(aEntity);
		//return null;
	}
	@Override
	public String deleteAppointment(Integer appId) {
		// TODO Auto-generated method stub
		 
		appointmentRepo.deleteById(appId);
		return "Id Delete Successfully";
	}

}
