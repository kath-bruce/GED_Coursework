
public class WerewolfEnergyRegen implements EnergyRegenBehaviour{
    
    @Override
    public void energyRegen(Object object) {
        Character character = (Character) object;
        character.setEnergy(character.getEnergy() + 50);
    }
}
