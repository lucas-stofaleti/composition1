package entities;

import java.util.Calendar;

public class HourContract 
{
	private Calendar date;
	private double valuePerHour;
	private int hours;
	
	public HourContract(Calendar date, double valuePerHour, int hours) 
	{
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Calendar getDate() 
	{
		return date;
	}
	public void setDate(Calendar date) 
	{
		this.date = date;
	}
	public double getValuePerHour() 
	{
		return valuePerHour;
	}
	public void setValuePerHour(double valuePerHour) 
	{
		this.valuePerHour = valuePerHour;
	}
	public int getHours() 
	{
		return hours;
	}
	public void setHours(int hours) 
	{
		this.hours = hours;
	}
	
	public double totalValue ()
	{
		return valuePerHour * hours;
	}
}
