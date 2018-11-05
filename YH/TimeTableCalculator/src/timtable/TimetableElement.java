package timtable;

public class TimetableElement {

	private int index;
	private double length;
	private String lectureName;
	
	/**
	 * 
	 * @param index
	 * @param length 시간단위 ex)30분 -> 0.5
	 */
	public TimetableElement(int index, double length) {
		super();
		this.index = index;
		this.length = length;
		this.lectureName = "없음";
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	
}
