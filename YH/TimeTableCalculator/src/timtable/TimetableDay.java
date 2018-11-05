package timtable;

import java.util.ArrayList;

public class TimetableDay {

	private Day dayCat;
	private ArrayList<TimetableElement> schedule;
	private double startHour;
	private double endHour;
	
	public TimetableDay(Day dayCat, double startHour,  ArrayList<TimetableElement> schedule) {
		super();
		this.dayCat = dayCat;
		this.startHour = startHour;
		this.schedule = schedule;
		this.endHour = startHour;
		
		for (TimetableElement e : schedule)
			endHour += e.getLength();
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
	
	public double getEndHour() {
		return endHour;
	}

	public void setStartHour(double startHour) {
		this.startHour = startHour;
	}

	public ArrayList<TimetableElement> getSchedule() {
		return schedule;
	}
	
}
