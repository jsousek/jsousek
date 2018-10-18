public class Fighter {
    int mAXAmmo;
    int fighterAmmo;
    int dmg;
    String type;
    boolean isPriority;

    public int fight (){
        return fighterAmmo * dmg;
    }
    public int refill (int fromStorage){
        this.fighterAmmo = mAXAmmo;
        return fromStorage - fighterAmmo;
    }

    public String getType (){
        return type;
    }

    public String getStatus () {
        return type + " , Ammo: "+fighterAmmo + " , Base damage: " + dmg + " , Total damage is " + mAXAmmo * dmg;
    }

    public boolean isPriority(){
        return isPriority;
    }






}
