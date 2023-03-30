package attacks;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove{
    public StoneEdge(){
        super(Type.ROCK,100,80);
    }
    @Override
    protected String describe(){
        return "Повышает шанс критического удара.";
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPEED,1);
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }
}

