package logic;

import java.util.ArrayList;

import timtable.Lecture;
import timtable.LectureTimeBlock;
import timtable.Timetable;

public class CalcTimetable {

	public void calcSimilarity(ArrayList<Timetable> timetables) {
		double resArr[][][] = new double[7][24][60];
		ArrayList<ArrayList<DailySchedule>> tempSchedules = new ArrayList<>();
		
		for (Timetable timetable : timetables) {
			ArrayList<DailySchedule> tempSchedule = WeeklyScheduleFactory.getInstance();
			for (Lecture lectures : timetable.getLectures())
				for (LectureTimeBlock block : lectures.getTimeBlocks()) {
					int iStart = (int)(((int)block.getStart() * 60) + (block.getStart() - (int)block.getStart())*6);
					int iEnd = (int)(((int)block.getEnd() * 60) + (block.getEnd() - (int)block.getEnd())*6);
					for (int i = iStart; i <= iEnd; i++)
						tempSchedule.get(block.getDay().ordinal()).getTime()[i/60][i%60] = true;
				}
			tempSchedules.add(tempSchedule);
		}
		
		int cntArr[][][] = new int[7][24][60];
		for (ArrayList<DailySchedule> schedule : tempSchedules)
			for (int i = 0; i < 7; i++)
				for (int j = 0; j < 24; j++)
					for (int k = 0; k < 60; j++)
						if (schedule.get(i).getTime()[j][k])
							cntArr[i][j][k]++;
				
	}
}
