package yossi;

public class FoodItem extends Item {
	private Date productionDate,expiryDate;
	public FoodItem(int id,String NameProduct,int count,Date pDate,Date eDate)
	{
		super(id,NameProduct,count);
		productionDate = pDate;
		expiryDate = eDate;
	}
	public FoodItem(FoodItem Fitem)
	{
		super(Fitem.GetItemID(),Fitem.GetItemName(),Fitem.GetItemCount());
		productionDate = Fitem.productionDate;
		expiryDate = Fitem.expiryDate;
	}
	public Date GetProduction() {
		return productionDate;
	}
	public Date GetExpiry() {
		return expiryDate;
	}
	@Override
	public String toString() {
		return super.toString()+" Production Date:"+productionDate.toString()+" Expiry Date:"+expiryDate.toString();
	}
	public Date GetExpiryDate()
	{
		return expiryDate;
	}
}
