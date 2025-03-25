
/**
 * Write a description of class Corundum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Corundum extends Gem
{
    public Corundum(String Name, String Value, String Color, String Carat,
                    int Hardness, int Quantity, String Quality){
        super(Name, Value, Color, Carat, Hardness, Quantity, Quality);
    }
    
    public Corundum(){
    super("Corundum", "5k", "Pink", "5k", 9, 7, "Industrial Quality");
    }
}
