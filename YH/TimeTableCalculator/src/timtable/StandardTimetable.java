package timtable;

import java.util.ArrayList;

public class StandardTimetable implements Timetable {

	private ArrayList<TimetableDay> schedule;
	private ArrayList<Lecture> lectures;

	public StandardTimetable(ArrayList<TimetableDay> schedule) {
		super();
		this.schedule = schedule;
	}

	public ArrayList<TimetableDay> getSchedule() {
		return schedule;
	}
	
	public ArrayList<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(ArrayList<Lecture> lectures) throws DuplicateLectureTimeException {
		this.lectures = lectures;
		
		for (Lecture lecture : lectures)
			for (LectureTimeBlock tb : lecture.getTimeBlocks()) {
				double hour = schedule.get(tb.getDay().ordinal()).getStartHour();
				for (int i = 0; i < schedule.get(tb.getDay().ordinal()).getSchedule().size(); i++) {
					TimetableElement element = schedule.get(tb.getDay().ordinal()).getSchedule().get(i);
					if (tb.getStart() <= hour && tb.getEnd() > hour)
						if (element.getLectureName().equals("없음"))
							element.setLectureName(lecture.getName());
						else
							throw new DuplicateLectureTimeException("failed to calc timetable (Causes : "+element.getLectureName()+" / "+lecture.getName() +" - 중복된 시간표 : "+tb.getDay().getKorName()+"요일 "+ (i+1)+"교시)");
					hour+=element.getLength();
				}
			}
	}

	public void print() {
		for (int i = 0; i < schedule.size(); i++) {
			System.out.print(schedule.get(i).getDayCat().getKorName()+"요일 : ");
			for (int j = 0; j < schedule.get(i).getSchedule().size(); j++) {
				System.out.printf(schedule.get(i).getSchedule().get(j).getLectureName()+ " | ");
			}
			System.out.println();
		}
	}
}
