
/**
 * Write a description of class Defense here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Defense implements DefenseCommands{
    String SupportBeam;
    String Material;
    String Strength;
    public Defense(String SupportBeam, String Material, String Strength){
        this.SupportBeam = SupportBeam;
        this.Material = Material;
        this.Strength = Strength;
    }
    public Defense(){
        this("Wooden Support Beam", "Wood", "Average Strength");
    }
    
    public boolean blocked(){
    return true;
    }
}
