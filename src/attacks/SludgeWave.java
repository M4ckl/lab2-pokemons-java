package attacks;

import ru.ifmo.se.pokemon.*;

public class SludgeWave extends SpecialMove{
    public SludgeWave(){
        super(Type.POISON,95,100);
    }
    @Override
    protected String describe() {
        return "Poisons an enemy Pokemon";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.addEffect(new Effect().chance(0.1).condition(Status.POISON));
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }
}
