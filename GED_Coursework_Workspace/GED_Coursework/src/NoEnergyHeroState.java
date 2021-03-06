
public class NoEnergyHeroState implements State {

    Character character;

    public NoEnergyHeroState(Character character) {
        this.character = character;
    }

    @Override
    public void attack(Character enemy) {

        System.out.println("~~~~~~~~~~~~~~~\n" + this.character.getName() + " health: " + this.character.getHealth()
                + "\n" + this.character.getName() + " energy: " + this.character.getEnergy());

        Integer resourceDifference = this.character.getHealth();

        if (this.character.getHealth() < (int) (this.character.getMaxHealth() * 0.5)) {
            this.character.regenerateHealth();

            resourceDifference = this.character.getHealth() - resourceDifference;

            System.out.println(this.character.getName() + " has regenerated "
                    + resourceDifference + " health to " + this.character.getHealth() + ". ");
        }

        resourceDifference = this.character.getEnergy();

        this.character.regenerateEnergy();

        resourceDifference = this.character.getEnergy() - resourceDifference;

        System.out.println(this.character.getName() + " has regenerated "
                + resourceDifference + " energy. ");

        if (this.character.getEnergy() > (int) (this.character.getMaxEnergy() * 0.5)) {
            this.character.setState(this.character.getEnergisedHeroState());

            System.out.println(this.character.getName() + " has re-energised. ");
        }

        System.out.println(this.character.getName() + " health: " + this.character.getHealth()
                + "\n" + this.character.getName() + " energy: " + this.character.getEnergy() + "\n~~~~~~~~~~~~~~~\n");

    }
}
