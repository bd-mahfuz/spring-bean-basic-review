package com.learnSpring.injectBySetter;

import java.util.Iterator;
import java.util.List;

public class Student {

	private int id;
	private String name;
	private Course course;
	private List<Course> listOfCourses;
	
	
	public List<Course> getListOfCourses() {
		return listOfCourses;
	}
	public void setListOfCourses(List<Course> listOfCourses) {
		this.listOfCourses = listOfCourses;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showCourseList() {
		Iterator iter = listOfCourses.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	
}
