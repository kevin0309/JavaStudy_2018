import java.util.*;

public interface TimeTables { //공통요소들. . . 추상화
	public void PrintTable(); //출력
	public ArrayList<Course> getCons();
	public ArrayList<TimeTablesDays> getCb();
}
