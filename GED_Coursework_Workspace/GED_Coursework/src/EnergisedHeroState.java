
public class EnergisedHeroState implements State {

    Character character;

    public EnergisedHeroState(Character character) {
        this.character = character;
    }

    @Override
    public void attack(Character enemy) {

        Hero hero = (Hero) this.character;

        System.out.println("~~~~~~~~~~~~~~~");

        hero.displayCurrentStats();

        Integer healthDifference = hero.getHealth();

        if (hero.getHealth() < (int) (hero.getMaxHealth() * 0.5)) {
            hero.regenerateHealth();

            healthDifference = hero.getHealth() - healthDifference;

            System.out.println(hero.getName() + " has regenerated "
                    + healthDifference + " health to " + hero.getHealth() + ". ");
        }

        hero.setEnergy(hero.getEnergy() - hero.getEnergyUsage());

        if (hero.getEnergy() < 0) {
            hero.setState(hero.getNoEnergyHeroState());
            hero.setEnergy(0);
            System.out.println(hero.getName() + " has run out of energy! " + "\n~~~~~~~~~~~~~~~\n");

        } else {

            enemy.setHealth(enemy.getHealth() - hero.getDamage());

            if (enemy.getHealth() <= 0) {
                enemy.setState(enemy.getDeadState());

                System.out.println(hero.getName() + " killed " + enemy.getName()
                        + ". ");

                hero.setXP(hero.getXP() + enemy.getXP());

                if (hero.getXP() >= hero.getUppXPLimit()) {
                    Integer leftoverXP = hero.getXP() - hero.getUppXPLimit();

                    hero.levelUp();

                    hero.setXP(leftoverXP);

                    System.out.println(hero.getName() + " leveled up! "
                            + hero.getName() + " is now Level " + hero.getLevel()
                            + " with " + hero.getXP() + "XP. " + "\n~~~~~~~~~~~~~~~\n");

                } else {
                    System.out.println(hero.getName() + " gained " + enemy.getXP()
                            + "XP. " + hero.getName() + " now has " + hero.getXP()
                            + "XP. " + "\n~~~~~~~~~~~~~~~\n");
                }
            } else {

                System.out.println(hero.getName() + " attacks " + enemy.getName()
                        + ", dealing " + hero.getDamage() + " damage.\n"
                        + enemy.getName() + " health: " + enemy.getHealth()
                        + "\n" + hero.getName() + " energy: " + hero.getEnergy()
                        + "\n~~~~~~~~~~~~~~~\n");

            }
        }

    }
}
