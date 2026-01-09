package com.prowings.Java2025.Enum;

public class EnumDayDemo {
	public static void main(String[] args) {
		
		Day day = Day.SUNDAY;
		
		Boolean res = isHoliday(day) ;
		System.out.println(res);
	}

	public static boolean isHoliday(Day day) {
		if(day.equals(Day.SUNDAY) || day.equals(Day.SATURDAY))
			return true;
		else
			return false;
	}

}
