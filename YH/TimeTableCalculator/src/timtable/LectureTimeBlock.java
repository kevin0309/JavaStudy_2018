package timtable;

public class LectureTimeBlock {

	private Day day;
	private double start;
	private double end;
	
	public LectureTimeBlock(Day day, double start, double end) {
		super();
		this.day = day;
		this.start = start;
		this.end = end;
	}
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
	}
	public double getStart() {
		return start;
	}
	public void setStart(double start) {
		this.start = start;
	}
	public double getEnd() {
		return end;
	}
	public void setEnd(double end) {
		this.end = end;
	}
	
}
