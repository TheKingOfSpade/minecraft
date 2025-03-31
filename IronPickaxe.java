
/**
 * Write a description of class IronPickaxe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IronPickaxe extends Weapon
{
    public IronPickaxe(String name, String Material, int Damage){
        super(name, Material, Damage);
    }
    
    public IronPickaxe(){
    super("Iron Pickaxe", "Iron", 40);
    }
}
