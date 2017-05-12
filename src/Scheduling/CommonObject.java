package Scheduling;

import java.util.Calendar;
import java.util.Date;

public class CommonObject {
	public static Date TodayDate () {
		Calendar c = Calendar.getInstance();

		// and get that as a Date
		return c.getTime();
	}
	
	public static Date DefaultDateSetting() {
		Date theDate = new Date();
		theDate.setDate(1);
		theDate.setMonth(0);
		theDate.setYear(0);
		theDate.setHours(0);
		theDate.setMinutes(0);
		theDate.setSeconds(0);
		
		return theDate;
	}
}
