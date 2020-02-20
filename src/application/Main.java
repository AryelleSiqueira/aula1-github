package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			employees.add(new Employee(id, name, salary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		Employee emp = employees.stream().filter(x -> x.getId() == id).findAny().orElse(null);
		
		if (emp != null) {
			System.out.print("Enter the percentage: ");
			emp.increaseSalary(sc.nextDouble());
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println("\nList of employees:");
		for (Employee e : employees)
			System.out.println(e);
		
		System.out.println("TESTE");
		
		sc.close();
	}

}
