package com.class25;

public class Test {
	public static void main(String[] args) {
		System.out.println("Create an object of a Employee class");
		
		Employee obj=new Employee();
		obj.salary=70000;
		Employee.companyName="Syntax";
		obj.work();
		obj.getPaid();
		System.out.println();
		
		System.out.println("I creating an object for scrum team");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=9000000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product backlog, sprint Backlof, Burndown chart";
		sm.ceremonies="Sprint demo, Planning, retro, Daily Standup";
		sm.attendScrumMeeting();
		System.out.println();
		Developer dev=new Developer();
		dev.salary=13000000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint backlog";
		dev.ceremonies="Sprint demo, Planning, retro, Daily Standup";
		dev.attendScrumMeeting();
		dev.employeeId=101;
		//dev.employeessn
	}

}
