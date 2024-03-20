package com.health.wecare.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appointment {
	 @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Integer id;
	  private String appointmentDate;
	  private String slot;
	  private Integer userId;
	  private String coachId;
	public Appointment(Integer id, String appointmentDate, String slot, Integer userId, String coachId) {
		super();
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.slot = slot;
		this.userId = userId;
		this.coachId = coachId;
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointmentDate=" + appointmentDate + ", slot=" + slot + ", userId="
				+ userId + ", coachId=" + coachId + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getCoachId() {
		return coachId;
	}
	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
