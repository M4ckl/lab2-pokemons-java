package attacks;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove{
    public RockTomb(){
        super(Type.ROCK,65,95);
    }
    @Override
    protected String describe() {
        return "Понижает скорость вражеского покемона";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.SPEED, -1));
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }
}
