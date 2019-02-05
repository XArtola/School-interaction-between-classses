package com.zubiri.school;

import java.util.ArrayList;


public class School {

	private ArrayList<Administrative> administratives = new ArrayList<Administrative>();
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private String schoolName = "";

	public School(String schoolName) {
		this.schoolName = schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}
	
	/**
	 * @return the same arraylist of Person objects, but ordered by name 
	 * @param the ArrayList of person objects you want to order
	 */
	public ArrayList<Person> orderPersons(ArrayList<Person> persons) {

		ArrayList<Person> aux = new ArrayList<Person>();
		while (persons.size() > 1) {
			
				int smallestIndex = 0;

				for (int j = 0; j < persons.size(); j++) {

					if (persons.get(smallestIndex).getName().compareTo(persons.get(j).getName()) > 0)

						smallestIndex = j;

				}
				aux.add(persons.get(smallestIndex));
				persons.remove(smallestIndex);
		
		}
			aux.add(persons.get(0));
			return aux;

	}

	// ADMINISTRATIVES MANAGEMENT

	public ArrayList<Administrative> getAdministratives() {
		return administratives;
	}

	public void setAdministratives(ArrayList<Administrative> administratives) {
		this.administratives = administratives;
	}

	/**
	 * 
	 * @param index of the administrative you want in the arraylist
	 * @return the administrative class object in that index
	 */
	public Administrative getAdministrative(int index) {
		return administratives.get(index);
	}

	/**
	 * 
	 * @param administrative you want to add
	 *                       <p>
	 *                       When you add an administrative to the arraylist, it
	 *                       will generate an ID automatically and it will be saved
	 *                       in each Administrative object as a property
	 *                       </p>
	 */
	public void addAdministrative(Administrative administrative) {
		generateID(administrative);
		ArrayList<Person> persons = new ArrayList<Person>();
		for(int i = 0; i<administratives.size();i++) {
			persons.add(i, (Person)administratives.get(i));
		}
		
		orderPersons(persons);
		
		for (int i = 0; i<persons.size();i++) {
			administratives.add(i,administratives.get(i));
		}
		setAdministratives(administratives);
	}

	/**
	 * 
	 * @param administrativeID
	 * @return the index of the administrative who has that ID
	 */
	public int findAdministrative(String administrativeID) {
		for (int i = 0; i < administratives.size(); i++)
			if (administratives.get(i).getAdministrativeID().matches(administrativeID.toUpperCase()))
				return i;
		return -1;
	}

	/**
	 * 
	 * @param index of the administrative you want to delete
	 */
	public void deleteAdministrative(int index) {
		administratives.remove(index);
	}

	/**
	 * 
	 * @param index          of the administrative you want to modify
	 * @param administrative object with the new information that you want to change
	 */
	public void modifyAdministrative(int index, Administrative administrative) {
		administratives.add(index, administrative);
	}

	/**
	 * 
	 * @param administrative object which you create the ID for
	 */
	public void generateID(Administrative administrative) {
		administrative.setAdministrativeID("A" + (administratives.size() + 1));
	}

	

	// TEACHERS MANAGEMENT

	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}

	/**
	 * 
	 * @param index of the teacher you want in the arraylist
	 * @return the teacher class object in that index
	 */
	public Teacher getTeacher(int index) {
		return teachers.get(index);
	}

	/**
	 * 
	 * @param index of the teacher you want in the arraylist
	 * @return the teacher class object in that index
	 */
	public void addTeacher(Teacher teacher) {
		generateID(teacher);
		ArrayList<Person> persons = new ArrayList<Person>();
		for(int i = 0; i<teachers.size();i++) {
			persons.add(i, (Person)teachers.get(i));
		}
		
		orderPersons(persons);
		
		for (int i = 0; i<persons.size();i++) {
			teachers.add(i,teachers.get(i));
		}
		setTeachers(teachers);
	}

	/**
	 * 
	 * @param teacher you want to add
	 *                <p>
	 *                When you add an teacher to the arraylist, it will generate an
	 *                ID automatically and it will be saved in each Administrative
	 *                object as a property
	 *                </p>
	 */
	public int findTeacher(String teacherID) {
		for (int i = 0; i < teachers.size(); i++)
			if (teachers.get(i).getTeacherID().matches(teacherID.toUpperCase()))
				return i;
		return -1;
	}

	public void printTeachers() {
		if (teachers.size() > 0) {
			for (int i = 0; i < teachers.size(); i++) {
				// we think it would be more useful using the getTeachers().get() entering the
				// index we want (instead of the name)
				System.out.println("- " + teachers.get(i).getTeacherID() + "\t" + teachers.get(i).getName());
			}
		} else
			System.out.println("There's no teacher created yet.");
	}

	/**
	 * 
	 * @param index of the teacher you want to delete
	 */
	public void deleteTeacher(int index) {
		teachers.remove(index);
	}

	/**
	 * 
	 * @param index   of the teacher you want to modify
	 * @param teacher object with the new information that you want to change
	 */
	public void modifyTeacher(int index, Teacher teacher) {
		teachers.add(index, teacher);
	}

	/**
	 * 
	 * @param teacher object which you create the ID for
	 */
	public void generateID(Teacher teacher) {
		teacher.setTeacherID("T" + (teachers.size() + 1));
	}


	// STUDENTS MANAGEMENT

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	/**
	 * 
	 * @param index of the student you want in the arraylist
	 * @return the student class object in that index
	 */
	public Student getStudent(int index) {
		return students.get(index);
	}

	/**
	 * 
	 * @param index of the student you want in the arraylist
	 * @return the student class object in that index
	 */
	public void addStudent(Student student) {
		generateID(student);
		ArrayList<Person> persons = new ArrayList<Person>();
		for(int i = 0; i<students.size();i++) {
			persons.add(i, (Person)students.get(i));
		}
		
		orderPersons(persons);
		
		for (int i = 0; i<persons.size();i++) {
			students.add(i,students.get(i));
		}
		setStudents(students);
	}

	/**
	 * 
	 * @param student you want to add
	 *                <p>
	 *                When you add an student to the arraylist, it will generate an
	 *                ID automatically and it will be saved in each Administrative
	 *                object as a property
	 *                </p>
	 */
	public int findStudent(String studentID) {
		for (int i = 0; i < students.size(); i++)
			if (students.get(i).getStudentID().matches(studentID.toUpperCase()))
				return i;
		return -1;
	}

	/**
	 * 
	 * @param index of the student you want to delete
	 */
	public void deleteStudent(int index) {
		students.remove(index);
	}

	/**
	 * 
	 * @param index   of the student you want to modify
	 * @param student object with the new information that you want to change
	 */
	public void modifyStudent(int index, Student student) {
		students.add(index, student);
	}

	/**
	 * 
	 * @param student object which you create the ID for
	 */
	public void generateID(Student student) {
		student.setStudentID("S" + (students.size() + 1));
	}

	/**
	 * @param classroom you want to find the tutor of
	 * @return position of the teacher object with that classroom assigned in tutor
	 */
	public int tutorOf(String classroom) {
		for (int i = 0; i < teachers.size(); i++) {
			if (teachers.get(i).getTutor().equals(classroom))
				return i;
		}
		return -1;
	}

	

	// Methods to manage information between classes
	
	/**
	 * 
	 * @param studentID
	 * @return a String that contains the ID of the tutor; if it doesn't find it, it'll return "notFound" 
	 */

	public String findTutorID(String studentID) {

		for (int i = 0; i < teachers.size(); i++) {

			if (students.get(findStudent(studentID)).getClassroom().matches(teachers.get(i).getTutor())) {

				return teachers.get(i).getTeacherID();
			}

		}

		return "notFound";

	}

	/**
	 * 
	 * @param teacherID
	 * @return a String with the IDs of the students who that teacher is the tutor of; if it's not found it returns an empty string
	 */
	public String getStudentsByTeacherID(String teacherID) {

		String found = "";
		if (teachers.get(findTeacher(teacherID.toUpperCase())).getTutor().matches(""))
			return found;
		else {
			for (int i = 0; i < students.size(); i++) {

				if (teachers.get(findTeacher(teacherID)).getTutor().matches(students.get(i).getClassroom())) {

					found += students.get(i).getStudentID() + "::";
				}

			}
			return found;
		}

	}

	/**
	 * 
	 * @param a String with the subject
	 * @return a String with the IDs of the teachers that teaches the subject separated by '::'; if they don't match it'll return an empty String
	 */
	public String findTeacherIDBySubject(String subject) {

		String found = "";

		if (teachers.size() > 0) {

			for (int i = 0; i < teachers.size(); i++) {

				for (int j = 0; j < teachers.get(i).getSubjects().size(); j++) {

					if (teachers.get(i).getSubjects().get(j).matches(subject))
						found += teachers.get(i).getTeacherID() + "::";
				}

			}
		}

		return found;

	}
}
