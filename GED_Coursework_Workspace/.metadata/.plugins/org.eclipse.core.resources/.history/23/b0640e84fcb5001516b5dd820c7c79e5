
public abstract class Character {

    private String name;

    private Integer health;
    private Integer maxHealth;
    private Integer energy;
    private Integer maxEnergy;
    private Integer strength;
    private Integer energyUsage;
    private Integer XP;

    private HealthRegenBehaviour healthRegenBehaviour;
    private EnergyRegenBehaviour energyRegenBehaviour;

    private final State energisedState;
    private final State noEnergyState;
    private final State deadState;

    private final State energisedHeroState;
    private final State noEnergyHeroState;

    private State state;

    public Character() {
        this.energisedState = new EnergisedState(this);
        this.noEnergyState = new NoEnergyState(this);
        this.deadState = new DeadState(this);

        this.energisedHeroState = new EnergisedHeroState(this);
        this.noEnergyHeroState = new NoEnergyHeroState(this);

    }

    public void displayCurrentStats() {
        System.out.println(this.getName() + " health: " + this.getHealth()
                + "\n" + this.getName() + " energy: " + this.getEnergy());
    }

    public boolean isAlive() {
        if (this.getState().equals(this.getDeadState())) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isDead() {
        if (this.getState().equals(this.getDeadState())) {
            return true;
        } else {
            return false;
        }
    }

    public void attack(Character enemy) {
        this.getState().attack(enemy);
    }

    public void restoreToFull() {
        this.setHealth(this.getMaxHealth());
        this.setEnergy(this.getMaxEnergy());
    }

    public void regenerateHealth() {
        this.getHealthRegenBehaviour().healthRegen(this);
    }

    public HealthRegenBehaviour getHealthRegenBehaviour() {
        return this.healthRegenBehaviour;
    }

    public void setHealthRegenBehaviour(HealthRegenBehaviour hrb) {
        this.healthRegenBehaviour = hrb;
    }

    public void regenerateEnergy() {
        this.getEnergyRegenBehaviour().energyRegen(this);
    }

    public EnergyRegenBehaviour getEnergyRegenBehaviour() {
        return this.energyRegenBehaviour;
    }

    public void setEnergyRegenBehaviour(EnergyRegenBehaviour erb) {
        this.energyRegenBehaviour = erb;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return this.health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getMaxHealth() {
        return this.maxHealth;
    }

    public void setMaxHealth(Integer maxHealth) {
        this.maxHealth = maxHealth;

        // if enough lower decorators are added, max health could
        // drop below 1
        // this sets the max health to at least 1
        if (this.maxHealth < 1) {
            this.maxHealth = 1;
        }
    }

    public Integer getEnergy() {
        return this.energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Integer getMaxEnergy() {
        return this.maxEnergy;
    }

    public void setMaxEnergy(Integer maxEnergy) {
        this.maxEnergy = maxEnergy;

        // if enough lower decorators are added, max energy could
        // drop below 1
        // this sets the max energy to at least 1
        if (this.maxEnergy < 1) {
            this.maxEnergy = 1;
        }
    }

    public Integer getStrength() {
        return this.strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;

        // if enough lower decorators are added, strength could
        // drop below 1
        // this sets the strength to at least 1
        if (this.strength < 1) {
            this.strength = 1;
        }
    }

    public Integer getEnergyUsage() {
        return this.energyUsage;
    }

    public void setEnergyUsage(Integer energyUsage) {
        this.energyUsage = energyUsage;

        // if enough decorators are added, energy usage could
        // drop below 1
        // this sets the energy usage to at least 1
        if (this.energyUsage < 1) {
            this.energyUsage = 1;
        }
    }

    public Integer getXP() {
        return this.XP;
    }

    public void setXP(Integer XP) {
        this.XP = XP;

        // if enough lower decorators are added, xp could
        // drop below 0
        // this sets the xp to at least 0
        if (this.XP < 0) {
            this.XP = 0;
        }
    }

    public abstract Integer getDamage();

    public State getEnergisedState() {
        return this.energisedState;
    }

    public State getEnergisedHeroState() {
        return this.energisedHeroState;
    }

    public State getNoEnergyState() {
        return this.noEnergyState;
    }

    public State getNoEnergyHeroState() {
        return this.noEnergyHeroState;
    }

    public State getDeadState() {
        return this.deadState;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State newState) {
        this.state = newState;
    }

    public Integer getLevel() {
        return null;
    }
    
    public void levelUpTo(Integer level) {
        
    }
}
