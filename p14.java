import java.lang.String;

public class Book{

    private int quantity;
    private char color;
    private String quality;

    public Book(int qt, char c){

        quantity = qt;
        color = c;
        quality = "GOOD";

    }

    public int getQuantity(){
        return quantity;
    }

    public char getColor(){
        return color;
    }

    public String getQuality(){
        return quality;
    }

}
