
/**
 * Write a description of class Topaz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Topaz extends Item
{
    public Topaz(String Name, String Value, String Color, String Carat,
                    int Hardness, int Quantity, String Quality){
        super(Name, Value, Color, Carat, Hardness, Quantity, Quality);
    }
    
    public Topaz(){
    super("Topaz", "1k", "Orange", "1.55k", 8, 12, "Average Quality");
    }
}
