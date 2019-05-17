package project;
public class DVD extends Item{
    private String Note;
    public DVD(String Title,String Name,double price,String Note){
        super(Title,Name,price);
        this.Note = Note;
    }
    public String GetNote(){
        return Note;
    }
    @Override
    public String toString(){
        return super.toString() +" Note: "+GetNote();
    }
}
