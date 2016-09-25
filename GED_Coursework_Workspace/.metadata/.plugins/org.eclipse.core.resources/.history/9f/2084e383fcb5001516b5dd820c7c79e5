
public class Werewolf extends Character{
        
    public Werewolf() {
        super();
        setDefaults();
    }
    
    public void setDefaults() {
        this.setMaxHealth(75);
        this.setHealth(this.getMaxHealth());
        this.setMaxEnergy(200);
        this.setEnergy(this.getMaxEnergy());
        this.setStrength(7);
        this.setEnergyUsage(20);
        this.setXP(3);
        this.setState(this.getEnergisedState());
        this.setHealthRegenBehaviour(new WerewolfHealthRegen());
        this.setEnergyRegenBehaviour(new WerewolfEnergyRegen());
        this.setName("Werewolf");
    }
    
    @Override
    public Integer getDamage() {
        return ((int) (0.8 * this.getStrength()));
    }
}
