package timeTablePackage;

public class TimeTable {
	private TimeBlock[][] timeTableArr=new TimeBlock[5][24];
	private char tempday[]= {'월','화','수','목','금'};//임시
	
	public TimeTable(){
		for(int i=0;i<5;i++) {
			for(int j=0;j<24;j++) {
				timeTableArr[i][j].setDay(tempday[i]); //과연 교시를 기준으로 하였을때 period,day는 필요한가?>확장성?
				timeTableArr[i][j].setPeriod(j+1);
				timeTableArr[i][j].setLecture(null);
			}
		}
	}
	public void init(int day,int start,int end,String lecture) {//요일시작시간 끝시간 과목          요일 나중에 수정
		for(int i=start-1;i<end;i++) 
			timeTableArr[day][i].setLecture(lecture);
		timeTableArr[day][start-1].setStart(true);
		timeTableArr[day][end-1].setEnd(true);
		
	}
	public TimeBlock[][] getTimeTableArr() {
		return timeTableArr;
	}
	public void setTimeTableArr(TimeBlock[][] timeTableArr) {
		this.timeTableArr = timeTableArr;
	}
}
