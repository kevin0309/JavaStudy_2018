import java.util.*;

public class DankookTimeTable implements TimeTables{

	private ArrayList<TimeTablesDays> Cons;
	private ArrayList<Course> Cb;
	
	public DankookTimeTable(ArrayList<TimeTablesDays> cons, ArrayList<Course> cb) {
		super();
		Cons = cons;
		Cb = cb;
	}

	public void setCons(ArrayList<TimeTablesDays> cons) {
		Cons = cons;
	}

	public void setCb(ArrayList<Course> cb) {
		Cb = cb;
	}

	@Override
	public void PrintTable() {
		// TODO Auto-generated method stub
		for(int i=0;i<Cons.size();i++){
			System.out.println("["+Cons.get(i).getDay()+"]요일 =>");
			for(int j=0; j<Cons.get(i).getCons().size();j++){
				System.out.println(Cons.get(i).getCons().get(j).getCourse_name()+" ++ ");
			}
		}
	}

	@Override
	public ArrayList<Course> getCons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TimeTablesDays> getCb() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
