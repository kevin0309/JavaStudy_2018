package timeTablePackage;

public class TimeBlock {//더쪼개면?

	private char day;//요일
	private boolean start,end;//이 부분은 lecture 클래스의 credit으로 처리
	private int period;//교시
	private String lecture;//과목
	
	public TimeBlock(){
	}
	
	public boolean getStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	public boolean getEnd() {
		return end;
	}

	public void setEnd(boolean end) {
		this.end = end;
	}
	
	public char getDay() {
		return day;
	}
	public void setDay(char day) {
		this.day = day;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public String getLecture() {
		return lecture;
	}
	public void setLecture(String lecture) {
		this.lecture = lecture;
	}
	
	
}
