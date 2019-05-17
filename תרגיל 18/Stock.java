package yossi;

public class Stock {
	private Item [] items;
	private int count;
	public Stock() {
		count=0;
		items=new Item[25];
	}
	public void AddItem(Item item)
	{
		if(count<25)
			items[count++] = item;
		else
			System.out.println("Error:You reach the limit!");
	}
	public void RemoveItem(Item item)
	{
		for(int i=0;i<count;i++)
		{
			if(item.GetItemID() == items[i].GetItemID())
			{
				for(;i<count-1;i++)
				{
					items[i] = items[i+1];
				}
				count--;
				break;
			}
		}
	}
	public String toString() {
		String str="";
		for(int i=0;i<count;i++)
			str+=items[i].toString();
		return str;
	}
	public void RemoveAfterDate(Date date) {
		for(int i=0;i<count;i++)
		{
			if(items[i] instanceof FoodItem)
			{
				if(((FoodItem) items[i]).GetExpiryDate().GetDay() < date.GetDay() && ((FoodItem) items[i]).GetExpiryDate().GetMonth() <= date.GetMonth() && ((FoodItem) items[i]).GetExpiryDate().GetYear()<=date.GetYear())
					RemoveItem(items[i]);
			}
		}
	}
	public int HowMany(int temp)
	{
		int j=0;
		for(int i=0;i<count;i++)
		{
			if(items[i] instanceof RefrigeratedItem)
			{
				if(((RefrigeratedItem) items[i]).GetMin() < temp && ((RefrigeratedItem) items[i]).GetMax() > temp)
					j++;
			}
		}
		return j;
	}
	public void Order(int k)
	{
		for(int i=0;i<count;i++)
		{
			if(items[i].GetItemCount() < k)
				System.out.println(items[i].toString());
		}
	}
}
