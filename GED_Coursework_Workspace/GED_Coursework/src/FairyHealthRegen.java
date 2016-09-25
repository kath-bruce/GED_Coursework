
public class FairyHealthRegen implements HealthRegenBehaviour {

    @Override
    public void healthRegen(Object object) {
    	Character character = (Character) object;
        character.setHealth(character.getHealth() + 2);
    }
}
