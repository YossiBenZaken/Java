
package project;
public class Item {
    private String Title,Lname;
    private double price;
    public Item(String title,String ln,double pr){
        this.Title = title;
        this.Lname = ln;
        this.price = pr;
    }
    public String GetName(){
        return Lname;
    }
    public String GetTitle(){
        return Title;
    }
    public double GetPrice(){
        return price;
    }
    @Override
    public String toString(){
        return "Title : "+GetTitle()+" Name: "+GetName() + " Price: "+ GetPrice();
    }
}
