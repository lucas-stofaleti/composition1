package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Department;
import entities.enums.WorkerLevel;

public class Main 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter department's name: ");
		Department dpte = new Department(sc.next());
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.next());
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		System.out.print("How many contracts to this worker? ");
		
		sc.close();
	}
}
