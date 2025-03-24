
/**
 * Write a description of class Diamond here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Diamond extends Gem
{
    public Diamond(String Name, String Value, String Color, String Carat,
                    int Hardness, int Quantity, String Quality){
        super(Name, Value, Color, Carat, Hardness, Quantity, Quality);
    }
    
    public Diamond(){
    super("Diamond", "10k", "Blue", "24k", 10, 3, "High Quality");
    }
}
