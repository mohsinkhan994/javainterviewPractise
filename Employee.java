package com.coding.pratice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	
	
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	
	

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		List <Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1,"Mohsin", 28, "Male", "Software", 2019, 120000.0));
		empList.add(new Employee(2,"Mariia", 24, "Female", "Teacher", 2022, 50000.0));
		empList.add(new Employee(3,"Muneem", 59, "Male", "Business", 1984, 20000.0));
		empList.add(new Employee(4,"Shabira", 60, "Female", "HouseWife", 1987, 10000.0));
		empList.add(new Employee(5,"Arshan", 6, "Male", "Software", 2030, 1100000.0));
		empList.add(new Employee(6,"Mehzabeen", 30, "Female", "Teacher", 2017, 10000.0));
		empList.add(new Employee(7,"Shafia", 34, "Female", "Nurse", 2017, 60000.0));
		
		
		// how many males and females are there in the org
		
		Map<String, Long> MaleFemaleCount =  empList.stream().collect(
				Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Male female count " + MaleFemaleCount);
		
		// print the name of depart in org
		
		empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::print);
		
		
		// Average age of males and females
		
		Map<String, Double> averageAgeofMF = empList.stream().collect(Collectors.groupingBy(Employee::getGender, 
				Collectors.averagingInt(Employee::getAge)));
		
		System.out.println("average age of employee " + averageAgeofMF);
		
		// highest paid employee
		
		Optional<Employee> highestPaid = empList.stream().collect(
				Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println("highest  paid eployee" + highestPaid);
		
		//get the names of the employees who joined after 2015
		
		empList.stream().filter(e->e.yearOfJoining>2015).map(Employee::getName).forEach(System.out::println);
		
		//average salary of each department
		
		Map<String, Double> averageSalary = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				
				Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println("average salary" + averageSalary);
		
		
		// get the youngest employee 
		
		Optional<Employee> youngestEmp=	empList.stream().filter(e-> e.getGender()== "Male" )
		.min(Comparator.comparing(Employee::getAge));
		
		System.out.println(youngestEmp + "youngest");
				
		
		// average salary of male and female
		
		Map<String, Double> averageSalMF = empList.stream().collect(
				Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("average salary of male and female"+ averageSalMF);
		
		
		//count no. of employees in software and teaching
		
		
		Map<String, Long> count = empList.stream().filter(e->e.getDepartment()== "Teacher")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				
				System.out.println(count + "teachers");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
