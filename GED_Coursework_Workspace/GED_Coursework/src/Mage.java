
public class Mage extends Hero {
    
    public Mage() {
        super();
        this.setMageDefaults();
    }
    
    public final void setMageDefaults() {
        this.setEnergyUsage(getEnergyUsage() - 1);
        this.setStrength(getStrength() - 1);
        this.setName("Mage");
    }
    
}
