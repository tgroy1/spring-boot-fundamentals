package com.tgroy.aopdemo.example2;

public class Employee {

	private int id;

	public Employee(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

}
