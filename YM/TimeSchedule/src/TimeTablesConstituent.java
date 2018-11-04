// 시간표의 구성요소
// 단위시간(교시 사이에 몇분씩인지), 과목이름, 몇교시


import java.util.*;

public class TimeTablesConstituent {
	private double unit_time = 0.5; //단위 시간(30분)
	private String course_name; //과목명
	private int n; //몇교시
	
	//생성자
	public TimeTablesConstituent(double unit_time, String course_name, int n) {
		super();
		this.unit_time = unit_time;
		this.course_name = course_name;
		this.n = n;
	}

	//getter&setter
	public double getUnit_time() {
		return unit_time;
	}

	public void setUnit_time(double unit_time) {
		this.unit_time = unit_time;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
