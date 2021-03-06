
public class Champion extends Decorator {

    Character character;

    public Champion(Character character) {
        this.character = character;
        this.resetDefaults();
    }

    @Override
    public void resetDefaults() {
        // if the character being decorated is a hero
        // (which is known if the character has a non null level)
        // character shouldn't be given extra xp
        if (this.character.getLevel() == null) {
            this.character.setXP(this.character.getXP() + 3);
        } else {   //if character being decorated is a hero, set level to current level         
            this.character.levelUpTo(this.character.getLevel());
        }
        
        this.character.setName("Champion " + this.character.getName());
        this.character.setMaxHealth(this.character.getMaxHealth() + 100);
        this.character.setHealth(this.character.getMaxHealth());
        this.character.setMaxEnergy(this.character.getMaxEnergy() + 50);
        this.character.setEnergy(this.character.getMaxEnergy());
        this.character.setStrength(this.character.getStrength() + 2);
        this.character.setEnergyUsage(this.character.getEnergyUsage() - 2);

        this.character.setHealthRegenBehaviour(this.character.getHealthRegenBehaviour());
        this.character.setEnergyRegenBehaviour(this.character.getEnergyRegenBehaviour());

        this.character.setState(this.character.getState());
    }

    @Override
    public Integer getLevel() {
        return (this.character.getLevel());
    }

    @Override
    public String getName() {
        return this.character.getName();
    }

    @Override
    public void setName(String name) {
        this.character.setName(name);
    }

    @Override
    public Integer getHealth() {
        return (this.character.getHealth());
    }

    @Override
    public void setHealth(Integer health) {
        this.character.setHealth(health);
    }

    @Override
    public Integer getMaxHealth() {
        return (this.character.getMaxHealth());
    }

    @Override
    public void setMaxHealth(Integer maxHealth) {
        this.character.setMaxHealth(maxHealth);
    }

    @Override
    public boolean isDead() {
        return this.character.isDead();
    }

    @Override
    public boolean isAlive() {
        return this.character.isAlive();
    }

    @Override
    public Integer getEnergy() {
        return (this.character.getEnergy());
    }

    @Override
    public void setEnergy(Integer energy) {
        this.character.setEnergy(energy);
    }

    @Override
    public Integer getMaxEnergy() {
        return (this.character.getMaxEnergy());
    }

    @Override
    public void setMaxEnergy(Integer maxEnergy) {
        this.character.setMaxEnergy(maxEnergy);
    }

    @Override
    public Integer getStrength() {
        return (this.character.getStrength());
    }

    @Override
    public void setStrength(Integer strength) {
        this.character.setStrength(strength);
    }

    @Override
    public Integer getXP() {
        return (this.character.getXP());
    }

    @Override
    public void setXP(Integer XP) {
        this.character.setXP(XP);
    }

    @Override
    public Integer getEnergyUsage() {
        return (this.character.getEnergyUsage());
    }

    @Override
    public void setEnergyUsage(Integer energyUsage) {
        this.character.setEnergyUsage(energyUsage);
    }

    @Override
    public HealthRegenBehaviour getHealthRegenBehaviour() {
        return (this.character.getHealthRegenBehaviour());
    }

    @Override
    public void setHealthRegenBehaviour(HealthRegenBehaviour hrb) {
        this.character.setHealthRegenBehaviour(hrb);
    }

    @Override
    public EnergyRegenBehaviour getEnergyRegenBehaviour() {
        return (this.character.getEnergyRegenBehaviour());
    }

    @Override
    public void setEnergyRegenBehaviour(EnergyRegenBehaviour erb) {
        this.character.setEnergyRegenBehaviour(erb);
    }

    @Override
    public Integer getDamage() {
        return this.character.getDamage();
    }

    @Override
    public State getState() {
        return (this.character.getState());
    }

    @Override
    public void setState(State state) {
        this.character.setState(state);
    }

    @Override
    public State getDeadState() {
        return (this.character.getDeadState());
    }

    @Override
    public State getEnergisedHeroState() {
        return (this.character.getEnergisedHeroState());
    }

    @Override
    public State getNoEnergyHeroState() {
        return (this.character.getEnergisedHeroState());
    }
}
