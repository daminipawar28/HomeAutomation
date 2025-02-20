package com.homeAutomation;

import java.time.Duration;
import java.time.LocalTime;

public class Device {
	String deviceType;
	boolean powerStatus;
	LocalTime onTime;
	LocalTime offTime;
	
	public Device() {
		
		
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public boolean isPowerStatus() {
		return powerStatus;
	}

	public void setPowerStatus(boolean powerStatus) {
		this.powerStatus = powerStatus;
	}

	public LocalTime getOnTime() {
		return onTime;
	}

	public void setOnTime(LocalTime onTime) {
		this.onTime = onTime;
	}

	public LocalTime getOffTime() {
		return offTime;
	}

	public void setOffTime(LocalTime offTime) {
		this.offTime = offTime;
	}
	
	public boolean turnOn() {
		if(powerStatus == true) {
			powerStatus = false;
			return powerStatus;
			
		
		}
		LocalTime time = LocalTime.now();
		setOnTime(time);
	
		
		return true;
		
	}
	public void activeTime()
	{
		Duration duration = Duration.between(onTime, offTime);
		System.out.println("Device active for "+duration.toHours()+":"+duration.toMinutes()+":"+duration.toSeconds());
	}	

}
