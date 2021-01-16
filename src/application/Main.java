package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main 
{
	public static void main(String[] args) throws ParseException 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat ("MM/yyyy");
		
		
		
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
		Worker worker = new Worker(name, level, baseSalary, dpte);
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			int j = i+1;
			System.out.println("Enter contract #" + j + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Calendar date = Calendar.getInstance();
			date.setTime(sdf.parse(sc.next()));
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(date,valuePerHour,hours);
			worker.addContract(contract);
		}
		
		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		Calendar date = Calendar.getInstance();
		date.setTime(sdf1.parse(sc.next()));
		System.out.println(worker.income(date));
		
		sc.close();
	}
}
