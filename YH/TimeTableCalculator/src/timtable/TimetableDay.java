package timtable;

import java.util.ArrayList;

public class TimetableDay {

	private Day dayCat;
	private ArrayList<TimetableElement> schedule;
	private double startHour;
	
	public TimetableDay(Day dayCat, double startHour,  ArrayList<TimetableElement> schedule) {
		super();
		this.dayCat = dayCat;
		this.startHour = startHour;
		this.schedule = schedule;
	}

	public Day getDayCat() {
		return dayCat;
	}

	public void setDayCat(Day dayCat) {
		this.dayCat = dayCat;
	}

	public double getStartHour() {
		return startHour;
	}

	public void setStartHour(double startHour) {
		this.startHour = startHour;
	}

	public ArrayList<TimetableElement> getSchedule() {
		return schedule;
	}

	public void setSchedule(ArrayList<TimetableElement> schedule) {
		this.schedule = schedule;
	}
	
}
