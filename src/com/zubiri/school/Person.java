package com.zubiri.school;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

	private String name = "";
	private Calendar birthDate = new GregorianCalendar(0, 0, 0);
	private String dni = "";
	private String phoneNumber = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (checkName(name))
			this.name = name;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Calendar birthDate) {
		if (checkDate(birthDate))
			this.birthDate = birthDate;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (checkDni(dni))
			this.dni = dni;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (checkPhoneNumber(phoneNumber))
			this.phoneNumber = phoneNumber;
	}

	/**
	 * 
	 * @return int with the age of the person
	 */
	public int age() {
		Calendar now = new GregorianCalendar();
		return now.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
	}

	/**
	 * 
	 * @param name you want to check
	 * @return true if the entered name has not numbers or symbols, else false
	 */
	public boolean checkName(String name) {
		if (name.matches("[A-Za-z]+"))
			return true;
		return false;
	}
	
	/**
	 * 
	 * @param date you want to check
	 * @return true if the date you enter is smaller than today's date
	 */
	public boolean checkDate(Calendar date) {
		if (date.compareTo(new GregorianCalendar()) < 0)
			return true;
		return false;
	}

	/**
	 * 
	 * @param dni
	 * @return true if it has a dni format
	 */
	public boolean checkDni(String dni) {
		if (dni.length() == 9 && dni.substring(0, 7).matches("[0-9]+") && dni.substring(8).matches("[A-Za-z]"))
			return true;
		return false;
	}

	/**
	 * 
	 * @param String - phoneNumber
	 * @return true if the phoneNumber is only numbers
	 */
	public boolean checkPhoneNumber(String phoneNumber) {
		if (phoneNumber.matches("[0-9]+") && phoneNumber.length() == 9)
			return true;
		return false;
	}

	/**
	 * 
	 * @return which fields are empty - string made by numbers: 1-if the name property is empty; 2-birth date;3-dni;4-phoneNumber.
	 */
	public String checkPerson() {
		String missingFields = "";
		if (name.matches(""))
			missingFields += "1";
		if (birthDate.compareTo(new GregorianCalendar(0, 0, 0)) == 0)
			missingFields += "2";
		if (dni.matches(""))
			missingFields += "3";
		if (phoneNumber.matches(""))
			missingFields += "4";
		return missingFields;
	}

}
