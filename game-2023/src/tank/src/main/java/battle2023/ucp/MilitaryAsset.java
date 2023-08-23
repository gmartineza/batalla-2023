package battle2023.ucp;

public abstract class MilitaryAsset {
    private double health;
    private String name;

    public double getHealth(){
        return health;
    }

    private void setHealth(double value){
        health = value;
    }

    public String getName(){
        return name;
    }

    public void setName(String value){
        name = value;
    }

    public boolean isAlive() {
        return getHealth() > 0;
    }

    public void damage(int amount) {
        setHealth(getHealth()  - amount);
    }

    public void repair(int value){
        setHealth(getHealth() + value);
    }
}