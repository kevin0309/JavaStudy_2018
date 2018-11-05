package logic;

public class DailySchedule {

	private int[][] time;

	public DailySchedule() {
		super();
		this.time = new int[24][60];
	}

	public int[][] getTime() {
		return time;
	}

}
