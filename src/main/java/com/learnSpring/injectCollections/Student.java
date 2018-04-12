package com.learnSpring.injectCollections;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private List<Course> listOfCourse;
	private Set<Course> setOfCourses;
	private Map<String, Course> map;
	private Properties properties;
	
	
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public List<Course> getListOfCourse() {
		return listOfCourse;
	}
	public void setListOfCourse(List<Course> listOfCourse) {
		this.listOfCourse = listOfCourse;
	}
	public Set<Course> getSetOfCourses() {
		return setOfCourses;
	}
	public void setSetOfCourses(Set<Course> setOfCourses) {
		this.setOfCourses = setOfCourses;
	}
	public Map<String, Course> getMap() {
		return map;
	}
	public void setMap(Map<String, Course> map) {
		this.map = map;
	}
	
	public void showList() {
		System.out.println("Using list");
		for(Course course : listOfCourse) {
			System.out.println(course);
		}
	}
	
	public void showSet() {
		System.out.println("Using set");
		for(Course course : setOfCourses) {
			System.out.println(course);
		}
	}
	
	public void showMap() {
		System.out.println("Using Map");
		for(Course course : map.values()) {
			System.out.println(course);
		}
	}
	
	public void showProperties() {
		System.out.println("Using Properties:");
		Enumeration<Object> en = properties.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
