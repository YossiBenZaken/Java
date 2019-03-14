
public class Time {
	private int hour,minute,second;
	public Time(int h,int m,int s)
	{
		hour = h<24 && h>0 ? h : 0;
		minute = m<60 && m>0 ? m : 0;
		second = s<60 && s>0 ? s : 0;;
	}
	public Time(Time other)
	{
		this.hour = other.hour;
		this.minute = other.minute;
		this.second = other.second;
	}
	public int GetHour() {
		return hour;
	}
	public int GetMinute() {
		return minute;
	}
	public int GetSecond() {
		return second;
	}
	public void setHour(int num)
	{
		hour = num<24 && num>0 ? num : hour;
	}
	public void setMinute(int num)
	{
		minute = num<60 && num>0 ? num : minute;
	}
	public void setSecond(int num)
	{
		second = num<60 && num>0 ? num : second;
	}
	public String PrintTime() {
		String str="";
		str += hour<10 ? "0"+hour+":" : hour+":";
		str += minute<10 ? "0"+minute+":" : minute+":";
		str += second<10 ? "0"+second : second;
		return str;
	}
	public boolean Equals(Time other) {
		return hour == other.hour && minute == other.minute && second == other.second;
	}
	public int Difference(Time other) {
		return (hour*3600 + minute *60 + second) - (other.hour*3600 + other.minute*60 + other.second);
	}
}
