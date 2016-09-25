
public class Fairy extends Character{
    
    public Fairy() {
        super();
        this.setDefaults();
    }
    
    public void setDefaults() {
        this.setMaxHealth(150);
        this.setHealth(this.getMaxHealth());
        this.setMaxEnergy(150);
        this.setEnergy(this.getMaxEnergy());
        this.setStrength(2);
        this.setEnergyUsage(10);
        this.setXP(2);
        this.setState(this.getEnergisedState());
        this.setHealthRegenBehaviour(new FairyHealthRegen());
        this.setEnergyRegenBehaviour(new FairyEnergyRegen());
        this.setName("Fairy");
    }
    
    @Override
    public Integer getDamage() {
        return (2 * this.getStrength());
    }
}
