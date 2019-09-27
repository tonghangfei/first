package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String uid ;
    private String name ;
    private Integer age ;
    private Date birthday ;
    private Double salary ;
    public User(int age, String name) {
    	this.name = name;
    	this.age = (Integer) age;
    }
    
    public User() {}
    
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
    

}
