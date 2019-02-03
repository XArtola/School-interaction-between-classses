package com.zubiri.school;

import java.util.ArrayList;

public class Teacher extends Worker{
	
	private String teacherID = "";
	private String tutor = "";
	private ArrayList<String> subjects = new ArrayList<String>();
	
	public String getTeacherID() {

		return teacherID;

	}
	
	public void setTeacherID(String teacherID) {

		this.teacherID = teacherID;

	}
	
	public String getTutor() {
		
		return tutor;
		
	}

	public void setTutor(String tutor) {
		if (!isTutor())
			this.tutor = tutor;
	}
	
	public ArrayList<String> getSubjects() {

		return subjects;

	}

	public void setSubjects(ArrayList<String> subjects) {

			this.subjects = subjects;

	}
	
	/**
	 * 
	 * @param subject you want to add to the subject arraylist
	 */
	public void addSubject(String subject) {
		subjects.add(subject);
	}

	/**
	 * 
	 * @param index in the arraylist of the subject you want to get
	 * @return
	 */
	public String getSubject(int index) {
		return subjects.get(index);
	}
	
	/**
	 * 
	 * @param index in the arraylist of the subject you want to delete
	 */
	public void deleteSubject(int index) {
		subjects.remove(index);
	}

	/**
	 * 
	 * @param string -  subject you want to find the index of
	 * @return index of the subject in ther array, or -1 if it's not found
	 */
	public int findSubject(String subject) {
		return subjects.indexOf(subject);
	}
	
	/**
	 * 
	 * @param index in the subject arraylist 
	 * @param String - new subject you want to save instead of the older one
	 */
	public void modifySubjet(int index, String subject) {
		
		subjects.add(index, subject);
		
	}
	
	/**
	 * 
	 * @return true if the teacher has asigned a classroom as tutor
	 */
	public boolean isTutor() {
		if(tutor.matches(""))
			return false;
		return true;
		
	}
}
