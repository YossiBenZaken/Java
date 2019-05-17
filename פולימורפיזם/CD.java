package project;
public class CD extends Item{
    private int number_song;
    public CD(String Title,String Name,int number_song,double price){
        super(Title,Name,price);
        this.number_song = number_song;
    }
    public int GetSong(){
        return number_song;
    }
    @Override
    public String toString(){
        return super.toString() + " Song: "+GetSong();
    }
}
