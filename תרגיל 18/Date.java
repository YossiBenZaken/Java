package yossi;

public class Date {
	private int day,month,year;
	public Date(int Day,int Month,int Year)
	{
		day=Day;
		month=Month;
		year= Year;
	}
	public int GetDay()
	{
		return day;
	}
	public int GetMonth()
	{
		return month;
	}
	public int GetYear()
	{
		return year;
	}
	@Override
	public String toString() {
		return day+"/"+month+"/"+year;
	}
}
