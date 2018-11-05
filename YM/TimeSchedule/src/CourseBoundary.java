//각 과목들의 '수업 요일' 과 '시작 시간~끝나는 시간'
// ex.. 자료구조는 화요일 10시30분 시작~12시 끝 


import java.util.*;

public class CourseBoundary {
	private String day; //수업 요일
	private double startTime; //시작시간
	private double endTime; //끝나는시간
	
	/*우클릭 -> source -> "generate Constructor" */
	public CourseBoundary(String day, double startTime, double endTime) {
		super();
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	/*우클릭 -> source -> "generate getter&setter" */
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public double getStartTime() {
		return startTime;
	}

	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}

	public double getEndTime() {
		return endTime;
	}

	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}
	
	
}
