package project;
public class MyMain {
    public static void main(String[] args) {
       Item cd1 = new CD("Shnot 80","Sarit Hadad",4,30.5);
       Item cd2 = new CD("Shnot 90","Sarit Hadad",3,31.5);
       Item cd3 = new CD("Shnot 70","Sarit Hadad",2,32.5);
       Item cd4 = new CD("Shnot 60","Sarit Hadad",1,33.5);
       Item dvd1 = new DVD("Abba","not name",61.64,"age 18+");
       DataBase d=new DataBase(5);
       d.AddItem(cd1);
       d.AddItem(cd2);
       d.AddItem(cd3);
       d.AddItem(cd4);
       d.AddItem(dvd1);
       //System.out.println(d.toString());
       d.PrintCDs();
    }
    
}
