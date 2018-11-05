package logic;

import java.util.ArrayList;

public class WeeklyScheduleFactory {

	public static ArrayList<DailySchedule> getInstance() {
		ArrayList<DailySchedule> res = new ArrayList<>();
		for (int i = 0; i < 7; i++)
			res.add(new DailySchedule());
		return res;
	}
}
