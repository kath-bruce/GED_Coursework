
public class Warrior extends Hero {
    
    public Warrior() {
        super();
        this.setWarriorDefaults();
    }
    
    public final void setWarriorDefaults() {
        this.setStrength(this.getStrength() + 1);
        this.setEnergy(this.getEnergy() - 5);
        this.setMaxEnergy(this.getMaxEnergy() - 5);
        this.setName("Warrior");
    }
}
