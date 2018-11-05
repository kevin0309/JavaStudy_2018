package logic.vo;

import java.util.ArrayList;

import timtable.TimetableDay;

public class TempTimetable {
	private ArrayList<TimetableDay> days;

	public TempTimetable(ArrayList<TimetableDay> days) {
		super();
		this.days = days;
	}

	public ArrayList<TimetableDay> getDays() {
		return days;
	}

	public void setDays(ArrayList<TimetableDay> days) {
		this.days = days;
	}
	
	
}
