package com.seclore.pojo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.seclore.views.CompanyViews;

import org.codehaus.jackson.map.annotate.JsonView;

@JsonSerialize(include = Inclusion.NON_NULL)
public class Staff {
	// all
	@JsonView(CompanyViews.Normal.class)
	private String name;
	@JsonView(CompanyViews.Normal.class)
	private int age;

	@JsonView({ CompanyViews.HR.class, CompanyViews.Manager.class })
	private String[] position;

	@JsonView(CompanyViews.Manager.class)
	private List<String> skills;

	@JsonView(CompanyViews.HR.class)
	private Map<String, BigDecimal> salary;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, int age, String[] position, List<String> skills, Map<String, BigDecimal> salary) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
		this.skills = skills;
		this.salary = salary;
	}

	public Staff(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getPosition() {
		return position;
	}

	public void setPosition(String[] position) {
		this.position = position;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Map<String, BigDecimal> getSalary() {
		return salary;
	}

	public void setSalary(Map<String, BigDecimal> salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", position=" + Arrays.toString(position) + ", skills=" + skills
				+ ", salary=" + salary + "]";
	}

}