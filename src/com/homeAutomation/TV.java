package com.homeAutomation;
import java.util.Scanner;

public class TV extends Device implements EntertainmentDevices{

	double currentVolume = 10;
	double currentChannel = 107;
	double numberOfChannel = 300;
	
	
	Scanner sc = new Scanner(System.in);
	
		
	public double getCurrentVolume() {
		return currentVolume;
	}
	public void setCurrentVolume(double currentVolume) {
		this.currentVolume = currentVolume;
	}
	public double getCurrentChannel() {
		return currentChannel;
	}
	public void setCurrentChannel(double currentChannel) {
		this.currentChannel = currentChannel;
	}
	public double getNumberOfChannel() {
		return numberOfChannel;
	}
	public void setNumberOfChannel(double numberOfChannel) {
		this.numberOfChannel = numberOfChannel;
	}
	
	
	public void volumeIncrease() {
		double num = 0;
		if(powerStatus==true)
		{
		System.out.println("Increase volume upto");
		double volume = sc.nextDouble();
		for(double i = getCurrentVolume(); i<=volume;i++)
			num = getCurrentVolume()+i;
	}

	setCurrentVolume(num);
}
    public void volumeDecrease() {
    	double num = 0;
    	if(powerStatus==true)
		{
		System.out.println("Decrease volume upto");
		double volume = sc.nextDouble();
		for(double i = getCurrentVolume(); i>=volume;i--)
			num = getCurrentVolume()+i;
	}

	setCurrentVolume(num);
}

    public void changeChannel() {
    	while(true)
    	{
    		System.out.println("Change channel By \n1.forward channel.\n2.Reverse channel.\n3.Go to specific channel.");
    		int choice = sc.nextInt();
    		
    	}
    }
}
    	
    	
	

	

