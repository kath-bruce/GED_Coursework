
public class DeadState implements State{
    Character character;
    
    public DeadState(Character character) {
        this.character = character;
    }
    
    @Override
    public void attack(Character enemy) {
        System.out.println("~~~~~~~~~~~~~~~\n" + this.character.getName() + " is dead. " + "\n~~~~~~~~~~~~~~~\n");
    }
}
