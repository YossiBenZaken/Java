package yossi;

public class RefrigeratedItem extends FoodItem {
	private int minTemperature,maxTemperature;
	public RefrigeratedItem(int id,String NameProduct,int count,Date pDate,Date eDate,int min,int max) {
		super(id, NameProduct, count,pDate,eDate);
		minTemperature=min;
		maxTemperature=max;
	}
	public RefrigeratedItem(RefrigeratedItem Ritem)
	{
		super(Ritem.GetItemID(),Ritem.GetItemName(),Ritem.GetItemCount(),Ritem.GetProduction(),Ritem.GetExpiry());
		minTemperature=Ritem.minTemperature;
		maxTemperature=Ritem.maxTemperature;
	}
	public int GetMin() {
		return minTemperature;
	}
	public int GetMax() {
		return maxTemperature;
	}
	@Override
	public String toString() {
		return super.toString()+" Min Temperature:"+minTemperature+" Max Temperature:"+maxTemperature;
	}
}
