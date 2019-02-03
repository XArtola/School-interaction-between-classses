package com.zubiri.school;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Worker extends Person {

	private double salary = 0.0;
	private Calendar joined = new GregorianCalendar(0, 0, 0);

	public double getSalary() {

		return salary;

	}

	public void setSalary(double salary) {

		if (checkSalary(salary))

			this.salary = salary;
	}

	public Calendar getJoined() {

		return joined;
	}

	public void setJoined(Calendar joined) {

		if (checkDate(joined))

			this.joined = joined;
	}
	
	/**
	 * 
	 * @param salary you want to check
	 * @return true if it's bigger than 0.0
	 */
	public boolean checkSalary(double salary) {

		if (salary >= 0.0)
			return true;

		return false;

	}
	
	/**
	 * 
	 * @return the calculation of the totally earned money of this worker since he/she joined
	 */
	public double earnedMoney() {
		Calendar now = new GregorianCalendar();
		int years = now.get(Calendar.YEAR)-joined.get(Calendar.YEAR);
		int months = now.get(Calendar.MONTH)-joined.get(Calendar.MONTH);
		
		return (years*12 + months)*salary;
		
		
	}

}
