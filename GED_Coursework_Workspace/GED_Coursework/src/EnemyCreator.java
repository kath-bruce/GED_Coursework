
public class EnemyCreator extends CharacterCreator{
    
    @Override
    protected Character spawnCharacter(String type) {
        if (type.equalsIgnoreCase("vampire")) {
            return new Vampire();
        } else if (type.equalsIgnoreCase("werewolf")) {
            return new Werewolf();
        } else if (type.equalsIgnoreCase("fairy")) {
            return new Fairy();
        } else {
            return null;
        }
    }
    
}
