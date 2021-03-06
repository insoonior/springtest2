package com.hao.personnel.information;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias(value="student")
public class Student {
	private Integer id;
	private String name;
	private Date birth;
	private boolean gender;
	private String teacher;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, Date birth, boolean gender, String teacher) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.teacher = teacher;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birth=" + birth + ", gender=" + gender + ", teacher="
				+ teacher + "]";
	}

}
