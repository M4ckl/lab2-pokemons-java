package attacks;

import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove {
    public PlayNice(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected String describe() {
        return "Lowers the attack of the enemy Pokemon";
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ATTACK, -1);
    }
}
