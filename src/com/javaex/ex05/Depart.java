package com.javaex.ex05;

public class Depart extends Employee{

	//필드
	private String department;

	//생성자
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	//메소드 getter/setter
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	//메소드 일반
	public void showInformation() {
        System.out.println("이름:" + getName() + "    연봉:" + getSalary() + "    부서:" + department);
    }
	
	@Override
	public String toString() {
		return "Depart [department=" + department + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}

	
	
}
