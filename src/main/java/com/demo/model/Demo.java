package com.demo.model;

public class Demo {

	String id;
	
	String name;

	String desc;

	public String getDesc() {
		return desc;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}

	
}
