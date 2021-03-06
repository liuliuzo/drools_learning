package com.liuliu.learning.drools.fusion.model;

import java.util.Date;

public class Person {

	private String name;
	private Integer age;
	private String like;
	private String sex;
	private String desc;
	private String address;
	private Date createTime;

	public Person(String name, Integer age, Date createTime) {
		super();
		this.name = name;
		this.age = age;
		this.createTime = createTime;
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

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", like=" + like + ", sex=" + sex + ", desc=" + desc
				+ ", address=" + address + ", createTime=" + createTime + "]";
	}

}
