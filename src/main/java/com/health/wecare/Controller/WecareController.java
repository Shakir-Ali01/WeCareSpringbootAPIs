package com.health.wecare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.wecare.Entity.Appointment;
import com.health.wecare.Entity.Coach;
import com.health.wecare.Entity.User;
import com.health.wecare.Service.WecareService;

@RestController
@RequestMapping("wecare")
@Validated
@CrossOrigin
public class WecareController {
	@Autowired
	private WecareService wecareService;
	
	//save coach
	   @PostMapping("/addCoach")
	   public ResponseEntity<Coach> createCoach(@RequestBody Coach addCoach)
	   {
		   Coach addedCoach=wecareService.saveCoach(addCoach);
		   return ResponseEntity.status(HttpStatus.CREATED).body(addCoach);
	   }
	   //login coach
//	   @PostMapping("/coachLogin")
//	   public ResponseEntity<Coach> loginCoach(@RequestBody Coach loginCoach)
//	   {
//		   Coach loginC=wecareService.Coachlogin(loginCoach.getId(),loginCoach.getPassword());
//		   return ResponseEntity.status(HttpStatus.OK).body(loginC);
//	   }
	   @GetMapping("/coachLogin/{id}/{password}")
	   public ResponseEntity<Coach> loginCoach(@PathVariable Integer id,@PathVariable String password)
	   {
		   Coach loginC=wecareService.Coachlogin(id,password);
		   return ResponseEntity.status(HttpStatus.OK).body(loginC);
	   }
	   //fetching All Coach
	   @GetMapping("/fetchAllCoach")
	   public ResponseEntity<List<Coach>> fetchAllCoach()
	   {
		   List<Coach> allCoach=wecareService.fetchAllCoach();
		   return ResponseEntity.status(HttpStatus.OK).body(allCoach);
	   }
	   //save User
	   @PostMapping("/addUser")
	   public ResponseEntity<User> createUser(@RequestBody User addUser)
	   {
		   User addedUser=wecareService.saveUser(addUser);
		   return ResponseEntity.status(HttpStatus.CREATED).body(addUser);
	   }
	   // user login
	   //login coach
//	   @PostMapping("/userLogin")
//	   public ResponseEntity<User> userLogin(@RequestBody User loginUser)
//	   {
//		   User userLogin=wecareService.Userlogin(loginUser.getId(),loginUser.getPassword());
//		   return ResponseEntity.status(HttpStatus.CREATED).body(userLogin);
//	   }
	 //login coach
	   @GetMapping("/userLogin/{id}/{password}")
	   public ResponseEntity<User> userLogin(@PathVariable Integer id ,@PathVariable String password)
	   {
		   User userLogin=wecareService.Userlogin(id,password);
		   return ResponseEntity.status(HttpStatus.CREATED).body(userLogin);
	   }
	   
	   //add addAppointment
	   @PostMapping("/addAppointment")
	   public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment addAppointment)
	   {
		   Appointment addedAppointment=wecareService.addAppointment(addAppointment);
		   return ResponseEntity.status(HttpStatus.CREATED).body(addAppointment);
	   }
	   //update Appointment
	   @PutMapping("/updateAppointment")
	   public ResponseEntity<Appointment> updateAppointment(@RequestBody Appointment updateAppointment)
	   {
		   Appointment updAppointment=wecareService.updateAppointment(updateAppointment);
		   return ResponseEntity.status(HttpStatus.CREATED).body(updAppointment);
	   }
	   //delete Appointmenmt
	   @DeleteMapping("/deleteAppointment/{appId}")
	   public ResponseEntity deleteAppointment(@PathVariable Integer appId)
	   {
		    String deleteAppointment=wecareService.deleteAppointment(appId);
		   return ResponseEntity.status(HttpStatus.OK).body(deleteAppointment);
	   }
	   @GetMapping("/fetchUserAppointment/{userId}")
	   public ResponseEntity<List<Appointment>> fetchUserAppointment(@PathVariable Integer userId)
	   {
		   List<Appointment> userAppointment=wecareService.fetchUserAppointment(userId);
		   return ResponseEntity.status(HttpStatus.OK).body(userAppointment);
	   }
	   //get schedule appointment using coach id
	   @GetMapping("/fetchCoachAppointment/{coachId}")
	   public ResponseEntity<List<Appointment>> fetchCoachAppointment(@PathVariable String coachId)
	   {
		   List<Appointment> coachAppointment=wecareService.fetchCoachAppointment(coachId);
		   return ResponseEntity.status(HttpStatus.OK).body(coachAppointment);
	   }
}
