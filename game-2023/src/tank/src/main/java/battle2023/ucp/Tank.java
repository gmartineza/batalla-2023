package battle2023.ucp;

public class Tank extends MilitaryAsset{
    public Tank(){
        super();
    }

    private Soldier pilot = null;

    private Soldier getPilot(){
        return pilot;
    }

    public void setPilot(Soldier value){
        pilot = value;
    }
    
    public boolean hasPilot(){
        if (getPilot() == null){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public void attack(MilitaryAsset target){
        target.damage(3.0);
    }
}
