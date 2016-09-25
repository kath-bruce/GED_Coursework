
public class HeroCreator extends CharacterCreator {

    @Override
    protected Character spawnCharacter(String type) {
        if (type.equalsIgnoreCase("rogue")) {
            return new Rogue();
        } else if (type.equalsIgnoreCase("warrior")) {
            return new Warrior();
        } else if (type.equalsIgnoreCase("mage")) {
            return new Mage();
        } else {
            return null;
        }

    }

}
