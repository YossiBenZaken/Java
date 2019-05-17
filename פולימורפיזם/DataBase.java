package project;
public class DataBase {
    private Item[] item;
    private int count,number;
    public DataBase(int num){
        count =0;
        number=num;
        item = new Item[num];
    }
    public void AddItem(Item i){
        if(count<number)
            this.item[count++] = i;
        else
            System.out.println("Reach limit");
    }
    public void RemoveItem(Item i){
        int j;
        for(j =0;j<count;j++){
            if(i.GetName() == item[j].GetName() && i.GetTitle()==item[j].GetTitle())
            {
                for(;j<count-1;j++)
                {
                    item[j]=item[j+1];
                }
                count--;
            }
        }
    }
    @Override
    public String toString(){
        String str="";
        for(int i=0;i<count;i++)
        {
            str+=item[i].toString()+"\n\n";
        }
        return str;
    }
    public void PrintDVDs(){
        for(int i=0;i<count;i++)
            if(item[i] instanceof DVD)
                System.out.println(item[i].GetTitle());
    }
    public void PrintCDs(){
        for(int i=0;i<count;i++)
            if(item[i] instanceof CD)
                System.out.println(item[i].GetTitle());
    }
    public int HowManyArtist(String artist){
        int c=0;
        for(int i=0;i<count;i++)
            if(item[i].GetName() == artist)
                c++;
        return c;
    }
}
