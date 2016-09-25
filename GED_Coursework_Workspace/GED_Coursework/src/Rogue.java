
public class Rogue extends Hero{
    
    public Rogue() {
        super();
        this.setRogueDefaults();
    }
    
    public final void setRogueDefaults() {
        this.setEnergy(this.getEnergy() + 5);
        this.setMaxEnergy(this.getMaxEnergy() + 5);
        this.setUppXPLimit(this.getUppXPLimit() + 10);
        this.setName("Rogue");
    }
    
}
