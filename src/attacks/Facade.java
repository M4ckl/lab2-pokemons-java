package attacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected String describe() {
        return "использует Facade";
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        Status Pok = pokemon.getCondition();
        if (Pok.equals(Status.BURN) || Pok.equals(Status.POISON) || Pok.equals(Status.PARALYZE)) {
            pokemon.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
        else{
            pokemon.setMod(Stat.HP, (int) damage);
        }
    }
}