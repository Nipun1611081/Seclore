package com.seclore.pojo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Project {
	private int projectId;
	private String name;
	private Date startDate;

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String name, Date startDate) {
		super();
		this.projectId = projectId;
		this.name = name;
		this.startDate = startDate;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", name=" + name + ", startDate=" + startDate + "]";
	}

}
