package timtable;

import java.util.ArrayList;

public class StandardTimetableFactory implements TimetableFactory {

	public Timetable getInstance() {
		ArrayList<TimetableDay> dayArr = new ArrayList<>();
		
		for (int i = 0; i < 7; i++) {
			ArrayList<TimetableElement> elementArr = new ArrayList<>();
			for (int j = 1; j < 19; j++)
				elementArr.add(new TimetableElement(j, 0.5));
			elementArr.add(new TimetableElement(19, 1));
			dayArr.add(new TimetableDay(Day.values()[i], 9, elementArr));
		}
		
		StandardTimetable res = new StandardTimetable(dayArr);
		return res;
	}
}
