package attacks;

import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove {
    public RazorLeaf(){
        super(Type.GRASS,55,95);
    }
    @Override
    protected String describe() {
        return "Gets an increased chance of a critical hit";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED,1);
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }
}
