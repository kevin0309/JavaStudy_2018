package logic;

public class DailySchedule {

	private boolean[][] time;

	public DailySchedule() {
		super();
		this.time = new boolean[24][60];
	}

	public boolean[][] getTime() {
		return time;
	}

}
