package yossi;

public class myMain {

	public static void main(String[] args) {
		Date pCola = new Date(24, 6, 2019);
		Date eCola = new Date(25, 6, 2019);
		Item Cola = new RefrigeratedItem(0, "Coca Cola", 5, pCola, eCola, 5, 10);
		Stock s = new Stock();
		s.AddItem(Cola);
		//s.RemoveAfterDate(new Date(26,6,2019));
		System.out.println(s.toString());
	}

}
