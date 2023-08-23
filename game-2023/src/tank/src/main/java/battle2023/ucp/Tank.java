package battle2023.ucp;

public class Tank extends MilitaryAsset{
    private String pilot;

    private String getPilot(){
        return pilot;
    }

    public boolean hasPilot(){
        if (getPilot() != null){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void attack(MilitaryAsset target){
        target.damage(3.0);
    }
}
