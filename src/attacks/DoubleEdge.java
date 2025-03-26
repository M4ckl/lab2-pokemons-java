package attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleEdge extends PhysicalMove {
    public DoubleEdge() {
        super(Type.NORMAL, 120, 100);
    }
    @Override
    protected String describe() {
        return "Takes a third of the damage done when recoiling";
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }
    @Override
    protected void applySelfDamage(Pokemon pokemon, double v){
        super.applySelfDamage(pokemon, v/3);
    }
}


