import java.time.LocalDateTime;
import java.util.Date;

import Scheduling.CommonObject;
import Scheduling.TaskObject;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskObject k = new TaskObject();
		
		System.out.print(k.getStartDateTime());
		System.out.println();

		System.out.println();
		System.out.print(CommonObject.TodayDate());
	}

}
