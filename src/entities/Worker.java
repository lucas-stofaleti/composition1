package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import entities.enums.WorkerLevel;

public class Worker 
{
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	private Department dpte;
	private List<HourContract> list = new ArrayList<>();
	
	public Worker(String name, WorkerLevel level, double baseSalary, Department dpte) 
	{
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.dpte = dpte;
	}

	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public WorkerLevel getLevel() 
	{
		return level;
	}
	public void setLevel(WorkerLevel level) 
	{
		this.level = level;
	}
	public double getBaseSalary() 
	{
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) 
	{
		this.baseSalary = baseSalary;
	}
	public Department getDpte() 
	{
		return dpte;
	}
	public void setDpte(Department dpte) 
	{
		this.dpte = dpte;
	}
	public List<HourContract> getList() 
	{
		return list;
	}
	
	public void addContract(HourContract contract)
	{
		list.add(contract);
	}
	public void removeContract(HourContract contract)
	{
		list.remove(contract);
	}
	public double income(Calendar dt)
	{
		double total = baseSalary;
		for (HourContract hc : list)
		{
			if(dt.get(Calendar.YEAR) == hc.getDate().get(Calendar.YEAR) && dt.get(Calendar.MONTH) == hc.getDate().get(Calendar.MONTH))
			{
				total += hc.totalValue();
			}
		}
		return total;
	}
}
