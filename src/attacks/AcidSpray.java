package attacks;

import ru.ifmo.se.pokemon.*;

public class AcidSpray extends SpecialMove {
    public AcidSpray(){
        super(Type.POISON,40,100);
    }
    @Override
    protected String describe() {
        return "Reduces the target's special protection";
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, -2));
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }
}
