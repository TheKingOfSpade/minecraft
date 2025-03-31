
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapon implements WeaponInterface{
    String Name;
    String Material;
    int Damage;
    public Weapon(String name, String Material, int Damage){
        this.Name = name;
        this.Material = Material;
        this.Damage = Damage;
    }
    public Weapon(){
        this("Stone Pickaxe", "Stone", 25);
    }
    public boolean parry(){
    return true;
    }
    
    public int attack(){
    return Damage;
    }
}
