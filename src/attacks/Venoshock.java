package attacks;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    public Venoshock(){
        super(Type.POISON,65,100);
    }
    @Override
    protected String describe() {
        return "Deals double damage to poisoned Pokemon";
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        Status PokCon = pokemon.getCondition();
        if (PokCon.equals(Status.POISON)){
            pokemon.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
        else{
            super.applySelfDamage(pokemon, damage);
        }
    }
}
