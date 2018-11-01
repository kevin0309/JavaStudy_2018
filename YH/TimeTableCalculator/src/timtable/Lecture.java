package timtable;

import java.util.ArrayList;

public class Lecture {

	private String name;
	private ArrayList<LectureTimeBlock> timeBlocks;
	
	public Lecture(String name, ArrayList<LectureTimeBlock> timeBlocks) {
		super();
		this.name = name;
		this.timeBlocks = timeBlocks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<LectureTimeBlock> getTimeBlocks() {
		return timeBlocks;
	}
	public void setTimeBlocks(ArrayList<LectureTimeBlock> timeBlocks) {
		this.timeBlocks = timeBlocks;
	}
	
}
