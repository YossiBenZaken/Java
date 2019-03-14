package dateproject;

public class Date {
	private int day,month,year;
	public Date(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
	}
	public Date(Date other) {
		day=other.day;
		month=other.month;
		year=other.year;
	}
	public int GetDay() {
		return day;
	}
	public int GetMonth() {
		return month;
	}
	public int GetYear() {
		return year;
	}
	public void SetDay(int d) {
		day=d;
	}
	public void SetMonth(int m) {
		month=m;
	}
	public void SetYear(int y) {
		year=y;
	}
	public String showDate() {
		return GetDay()+"/" + GetMonth()+"/"+GetYear();
	}
}
