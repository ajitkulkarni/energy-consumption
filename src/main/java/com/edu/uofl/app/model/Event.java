package com.edu.uofl.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="events")
public class Event implements Serializable {
	
	private static final long serialVersionUID = -4750578050574601187L;

	@Id
	@GeneratedValue
	@Column(name="event_id")
	private Long eventId;
	
	@Column(name="user_name")
	private String userName;

	@Column(name="event_name")
	private String eventName;

	@Column(name="device_name")
	private String deviceName;

	@Column(name="event_time")
	private Date eventTime;

	@Column(name="distance")
	private Double distance;
	
	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public Date getEventTime() {
		return eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", userName=" + userName + ", eventName=" + eventName + ", deviceName="
				+ deviceName + ", eventTime=" + eventTime + ", distance=" + distance + "]";
	}
}
