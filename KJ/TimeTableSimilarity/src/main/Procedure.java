package main;

import timeTablePackage.TimeTable;

public class Procedure {

	private TimeTable add(TimeTable a,TimeTable b) { 
		
		TimeTable temp=a;
	for(int i=0;i<5;i++) {
		for(int j=0;j<24;j++) {
			if(temp.getTimeTableArr()[i][j].getLecture()==null)
				temp.setTimeTableArr(b.getTimeTableArr());//이시발..ㅋㅋㅋ 질문
		}	
	}
	
return temp;
}
	
public void find(TimeTable a,TimeTable b){
	TimeTable temp=add(a,b);
	
	for(int i=0;i<5;i++) {
		for(int j=0;j<24;j++) {
			if(temp.getTimeTableArr()[i][j].getLecture()!=null)
				System.out.println("■");
			else
				System.out.println("□");
			}	
		}
	}
	
public void Calculate(TimeTable a,String target) {//사실은 요일까지 받아서 계산
		
	for(int i=0;i<5;i++) {
		for(int j=0;j<24;j++) {
				//if()쉬발기억안나네 거뭐냐 스트링비교함수 
			}	
		}
			
	}
}
