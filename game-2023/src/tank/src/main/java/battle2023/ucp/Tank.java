package battle2023.ucp;

public class Tank extends MilitaryAsset{
    public Tank(){
        super();
    }

    private Soldier pilot = null;

    public void setPilot(Soldier value){
        pilot = value;
    }
    
    public boolean hasPilot(){
        return pilot != null;
    }

    public void reinforce(double amount){
        if(getHealth() > 0){
            setHealth(getHealth() + amount);
        }
    }

    @Override
    public void attack(MilitaryAsset target){
        target.damage(3.0);
    }
}
