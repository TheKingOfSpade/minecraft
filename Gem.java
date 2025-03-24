
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Gem implements GemstoneInterface{
    //Implemented in your own way
    String Name;
    String Value;
    String Color;
    String Carat;
    int Hardness;
    int Quantity;
    String Quality;
    public Gem(String name, String value, String color,String caratValue,
            int hardness, int quantity, String quality){
        this.Name = name;
        Value = value;
        Color = color;
        Carat = caratValue;
        Hardness = hardness;
        Quantity = quantity;
        Quality = quality;
        
    }
    
    public Gem(){
        this("Generic Gemstone", "50 dollars"
        , "Brown", "1 Carat", 5, 1, "Meh Quality");
    }
    
    public String getName(){
    return Name;
    }
}
