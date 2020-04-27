package com.seclore.pojo;

public class Person {
	private int personId;
	Staff staff;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, Staff staff) {
		super();
		this.personId = personId;
		this.staff = staff;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", staff=" + staff + "]";
	}

}
