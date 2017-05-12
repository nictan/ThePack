package Scheduling;

import java.util.Calendar;
import java.util.Date;

public class CommonObject {
	public static Date TodayDate () {
		Calendar c = Calendar.getInstance();

		// and get that as a Date
		return c.getTime();
	}
}
