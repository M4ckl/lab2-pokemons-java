package attacks;

import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam(){
        super(Type.FAIRY,80,100);
    }
    @Override
    protected String describe() {
        return "Наносит урон";
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int) damage);
    }
}
