
public abstract class Decorator extends Character {
        
    //any methods called by a decorated enemy in a hero state attack method
    //should be overriden by the decorators
    
    @Override
    public abstract String getName();
    
    @Override
    public abstract void setName(String name);
    
    @Override
    public abstract Integer getHealth();
    
    @Override
    public abstract void setHealth(Integer health);
    
    @Override
    public abstract Integer getMaxHealth();
    
    @Override
    public abstract void setMaxHealth(Integer maxHealth);
    
    @Override
    public abstract boolean isDead();
    
    @Override
    public abstract boolean isAlive();
    
    @Override
    public abstract Integer getEnergy();
    
    @Override
    public abstract void setEnergy(Integer energy);
    
    @Override
    public abstract Integer getMaxEnergy();
    
    @Override
    public abstract void setMaxEnergy(Integer maxEnergy);
    
    @Override
    public abstract Integer getStrength();
    
    @Override
    public abstract void setStrength(Integer strength);
    
    @Override
    public abstract Integer getXP();
    
    @Override
    public abstract void setXP(Integer XP);
    
    @Override
    public abstract Integer getDamage();
    
    @Override
    public abstract Integer getEnergyUsage();
    
    @Override
    public abstract void setEnergyUsage(Integer energyUsage);
    
    @Override
    public abstract State getState();
    
    @Override
    public abstract void setState(State state);
    
    @Override
    public abstract State getDeadState();
    
    // the 2 below methods are to be overriden by decorators
    // as the character being decorated may be a hero
    // this means that the state of the hero needs to be correctly set
    // during the hero's state attack methods
    @Override
    public abstract State getEnergisedHeroState();
    
    @Override
    public abstract State getNoEnergyHeroState();
    
    // this method is only set to be overriden by decorators
    // so if the character being decorated is a hero
    // the program won't crash
    @Override
    public abstract HealthRegenBehaviour getHealthRegenBehaviour();
    
    @Override
    public abstract void setHealthRegenBehaviour(HealthRegenBehaviour hrb);
    
    // this method is also only set to be overriden by decorators
    // so if the character being decorated is a hero
    // the program won't crash
    @Override
    public abstract EnergyRegenBehaviour getEnergyRegenBehaviour();
    
    @Override
    public abstract void setEnergyRegenBehaviour(EnergyRegenBehaviour erb);
    
    // this method is also only set to be overriden by decorators
    // so if the character being decorated is a hero and the hero's level
    // needs to be retrieved
    // the program won't crash
    @Override
    public abstract Integer getLevel();
    
    public abstract void resetDefaults();
}
