package com.classs30;

public class DrivableTest {
	public static void main(String[] args) {
		Drivable obj=new Toyota();
		obj.drive();
		//obj.DRIVE_FAST=false; CE final value cannot be reasiined 
		
		Toyota toyota=new Toyota();
		toyota.drive();
		toyota.stop();
		
	}
}
