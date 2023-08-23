package battle2023.ucp;

public class Tank extends MilitaryAsset{
    private String pilot;

    private String getPilot(){
        return pilot;
    }

    public boolean hasPilot(){
        if (getPilot() == null || getPilot() == ""){
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
