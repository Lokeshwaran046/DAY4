package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studenttable")
public class StudentEntity {
	@Id
	private int id;
	private String name;
	private String stream;
	public StudentEntity() {
		super();
	}
	public StudentEntity(int id, String name, String stream) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
}