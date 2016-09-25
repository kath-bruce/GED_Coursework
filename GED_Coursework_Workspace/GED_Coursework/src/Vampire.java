
public class Vampire extends Character {
    
    public Vampire() {
        super();
        setDefaults();
    }
    
    public void setDefaults() {
        this.setMaxHealth(100);
        this.setHealth(this.getMaxHealth());
        this.setMaxEnergy(100);
        this.setEnergy(this.getMaxEnergy());
        this.setStrength(9);
        this.setEnergyUsage(5);
        this.setXP(5);
        this.setState(this.getEnergisedState());
        this.setHealthRegenBehaviour(new VampireHealthRegen());
        this.setEnergyRegenBehaviour(new VampireEnergyRegen());
        this.setName("Vampire");
    }
    
    @Override
    public Integer getDamage() {
        return ((int) (0.5 * this.getStrength()));
    }
}
