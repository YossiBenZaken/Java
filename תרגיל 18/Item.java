package yossi;

public class Item {
	private int catalogueNumber,quantity;
	private String name;
	public Item(int id,String Name,int count)
	{
		catalogueNumber = id;
		quantity = count;
		name = Name;
	}
	public Item(Item item)
	{
		catalogueNumber = item.catalogueNumber;
		quantity = item.quantity;
		name = item.name;
	}
	public void SetItemID(int id)
	{
		catalogueNumber = id;
	}
	public void SetItemName(String Name)
	{
		name = Name;
	}
	public void SetItemCount(int count)
	{
		quantity = count;
	}
	public int GetItemID()
	{
		return catalogueNumber;
	}
	public String GetItemName()
	{
		return name;
	}
	public int GetItemCount()
	{
		return quantity;
	}
	@Override
	public String toString() {
		return "Code:"+catalogueNumber+" Name Product:"+name+" Quantity:"+quantity;
	}
}
