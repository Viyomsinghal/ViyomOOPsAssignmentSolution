package com.greatLearning;

public class Main {
	public static void main(String[] args) {
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hrd = new HrDepartment();
		TechDepartment techdept = new TechDepartment();

		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();

		System.out.println("Welcome to " + hrd.departmentName());
		System.out.println(hrd.doActivity());
		System.out.println(hrd.getTodaysWork());
		System.out.println(hrd.getWorkDeadline());
		System.out.println(hrd.isTodayAHoliday());
		System.out.println();

		System.out.println("Welcome to " + techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday());
		System.out.println();

	}
}
