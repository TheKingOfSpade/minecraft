
/**
 * Write a description of class MetalBeam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MetalBeam extends Defense
{
    public MetalBeam(String SupportBeam, String Material, String Strength){
        super(SupportBeam, Material, Strength);
    }
    
    public MetalBeam(){
    super("Metal Support Beam", "Metal", "Awsome");
    }
}
