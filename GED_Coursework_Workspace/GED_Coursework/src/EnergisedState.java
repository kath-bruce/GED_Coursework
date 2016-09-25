
public class EnergisedState implements State {

    Character character;

    public EnergisedState(Character character) {
        this.character = character;
    }

    @Override
    public void attack(Character enemy) {
        
        System.out.println("~~~~~~~~~~~~~~~\n" + this.character.getName() + " counterattacks! ");

        this.character.displayCurrentStats();

        Integer healthDifference = this.character.getHealth();

        if (this.character.getHealth() < (int) (this.character.getMaxHealth() * 0.5)) {
            this.character.regenerateHealth();

            healthDifference = this.character.getHealth() - healthDifference;

            System.out.println(this.character.getName() + " has regenerated "
                    + healthDifference + " health to " + this.character.getHealth() + ". ");
        }

        this.character.setEnergy(this.character.getEnergy() - this.character.getEnergyUsage());

        if (this.character.getEnergy() < 0) {
            this.character.setState(this.character.getNoEnergyState());
            this.character.setEnergy(0);
            System.out.println(this.character.getName() + " has run out of energy! " + "\n~~~~~~~~~~~~~~~\n");

        } else {
            enemy.setHealth(enemy.getHealth() - this.character.getDamage());

            if (enemy.getHealth() <= 0) {
                enemy.setState(enemy.getDeadState());

                System.out.println(this.character.getName() + " has killed "
                        + enemy.getName()
                        + ", dealing " + this.character.getDamage() + " damage. " + "\n~~~~~~~~~~~~~~~\n");

            } else {

                System.out.println(this.character.getName() + " attacks "
                        + enemy.getName() + ", dealing " + this.character.getDamage()
                        + " damage.\n" + enemy.getName() + " health: "
                        + enemy.getHealth() + "\n" + this.character.getName()
                        + " energy: " + this.character.getEnergy() + "\n~~~~~~~~~~~~~~~\n");
            }
        }
    }
}
