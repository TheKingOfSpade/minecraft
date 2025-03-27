
/**
 * Write a description of class Quartz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quartz extends Item
{
    public Quartz(String Name, String Value, String Color, String Carat,
                    int Hardness, int Quantity, String Quality){
        super(Name, Value, Color, Carat, Hardness, Quantity, Quality);
    }
    
    public Quartz(){
    super("Quartz", "70$", "Cloudy White", "1.2k", 7, 30, "Commercial-grade Quality");
    }
}
