package timtable;

import java.util.ArrayList;

public interface Timetable {
	public void print();
	public ArrayList<TimetableDay> getSchedule();
	public ArrayList<Lecture> getLectures();
	public void setLectures(ArrayList<Lecture> lectures) throws DuplicateLectureTimeException;
}
