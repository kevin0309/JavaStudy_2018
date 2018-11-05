import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("★★★★★★ Time Table ★★★★★★");
		
		/*
		TimeTables ttb = new DankookTimeTable().getCb();
		DankookTimeTable.Printable();
		*/
		
		//컴퓨터구조(cs)
		ArrayList<CourseBoundary> csBound = new ArrayList<>();
		csBound.add(new CourseBoundary("화",16.0,19.0));
		Course computerScience = new Course("컴구","좆경산",csBound);
		
		//공학수학(em)
		ArrayList<CourseBoundary> emBound = new ArrayList<>();
		emBound.add(new CourseBoundary("수",9.0,10.5));
		Course engineeringMathematics = new Course("공수","개규혁",emBound);
		
		ArrayList<Course> co = new ArrayList<>();
		co.add(computerScience);
		co.add(engineeringMathematics);
		
	}
}
