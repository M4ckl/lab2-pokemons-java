package attacks;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(){
        super(Type.GROUND,60,100);
    }
    @Override
    protected String describe() {
        return "Снижает скорость вражеского покемона";
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.addEffect(new Effect().stat(Stat.SPEED, -1));
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }
}
