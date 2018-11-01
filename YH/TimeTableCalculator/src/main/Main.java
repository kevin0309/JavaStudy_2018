package main;

import java.util.ArrayList;

import timtable.Day;
import timtable.DuplicateLectureTimeException;
import timtable.Lecture;
import timtable.LectureTimeBlock;
import timtable.StandardTimetableFactory;
import timtable.Timetable;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		
		Timetable test = new StandardTimetableFactory().getInstance();
		
		ArrayList<LectureTimeBlock> seTimeBlocks = new ArrayList<>();
		seTimeBlocks.add(new LectureTimeBlock(Day.TUE, 14.5, 16));
		seTimeBlocks.add(new LectureTimeBlock(Day.WED, 14.5, 16));
		Lecture softwareEngineering = new Lecture("소프트웨어공학", seTimeBlocks);
		
		ArrayList<LectureTimeBlock> spTimeBlocks = new ArrayList<>();
		spTimeBlocks.add(new LectureTimeBlock(Day.WED, 16, 19));
		Lecture servicePlatform = new Lecture("서비스플랫폼", spTimeBlocks);
		
		ArrayList<Lecture> lectures = new ArrayList<>();
		lectures.add(softwareEngineering);
		lectures.add(servicePlatform);
		try {
			test.setLectures(lectures);
		} catch (DuplicateLectureTimeException e) {
			e.printStackTrace();
		}
		
		test.print();
	}

}
