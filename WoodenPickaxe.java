
/**
 * Write a description of class WoodenPickaxe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WoodenPickaxe extends Weapon
{
    public WoodenPickaxe(String name, String Material, int Damage){
        super(name, Material, Damage);
    }
    
    public WoodenPickaxe(){
    super("Wooden Pickaxe", "Wood", 10);
    }
}
