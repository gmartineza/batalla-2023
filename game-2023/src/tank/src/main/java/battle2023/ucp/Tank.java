package battle2023.ucp;

public class Tank {

    private int health = 5;
    private String name = "";
    private String pilot = "";

    private int getHealth(){
        return health;
    }

    private void setHealth(int value){
        health = value;
    }

    public String getName(){
        return name;
    }

    public void setName(String value){
        name = value;
    }

    private String getPilot() {
        return pilot;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public boolean hasPilot() {
        if (getPilot() == null || getPilot() == "") {
            return false;
        } else{
            return true;
        }
    }

    public void damage(int amount) {
        setHealth(getHealth()  - amount);
    }

    public int health() {
        return getHealth();
    }
}
