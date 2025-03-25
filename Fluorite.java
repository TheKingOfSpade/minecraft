
/**
 * Write a description of class Fluorite here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fluorite extends Gem
{
    public Fluorite(String Name, String Value, String Color, String Carat,
                    int Hardness, int Quantity, String Quality){
        super(Name, Value, Color, Carat, Hardness, Quantity, Quality);
    }
    
    public Fluorite(){
    super("Fluorite", "440$", "Green and Purple", "20k", 4, 14, "Below Average Quality");
    }
}

