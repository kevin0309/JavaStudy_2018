// 실질적인 시간표 부분 (요일,수업장소,시작시간)
// ex.. 시스템프로그래밍 강의는 월요일 16시 시작
 

import java.util.*;

public class TimeTablesDays {
	private String day; //요일
	private String position; //수업장소
	private double startTime; //시작시간
	private ArrayList<TimeTablesConstituent> Cons;
	
	public TimeTablesDays(String day, String position, double startTime, ArrayList<TimeTablesConstituent> cons) {
		super();
		this.day = day;
		this.position = position;
		this.startTime = startTime;
		Cons = cons;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getStartTime() {
		return startTime;
	}

	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}

	public ArrayList<TimeTablesConstituent> getCons() {
		return Cons;
	}

	public void setCons(ArrayList<TimeTablesConstituent> cons) {
		Cons = cons;
	} 
	
}
	
	