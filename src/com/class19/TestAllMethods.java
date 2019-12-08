package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AllMethods obj=new AllMethods();
		int large=obj.findLargest(300, 500);
		System.out.println(large);
		boolean a=obj.isOdd(500);
		System.out.println(a);
		String day=obj.weekDayName(6);
		if(day.equals("Tuesday") || day.equals("Wednesday")||day.equals("Thursday")||
				day.equals("Saturday")||day.equals("Sunday")) {
			System.out.println("I am practicing Java");
		}else {
			System.out.println("Unknown");
		}

	}

}
