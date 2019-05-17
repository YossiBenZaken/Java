package yossi;

public class ElectronicItem extends Item {
	private Date guaranteeDate;
	public ElectronicItem(int id,String NameProduct,int count,Date guaranteeDate)
	{
		super(id,NameProduct,count);
		this.guaranteeDate = guaranteeDate;
	}
	public ElectronicItem(ElectronicItem Eitem)
	{
		super(Eitem.GetItemID(),Eitem.GetItemName(),Eitem.GetItemCount());
		guaranteeDate = Eitem.guaranteeDate;
	}
	@Override
	public String toString() {
		return super.toString()+" Guarantee Date:"+guaranteeDate.toString();
	}
	public Date GetExpiryDate()
	{
		return guaranteeDate;
	}
}
