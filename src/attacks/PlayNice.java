package attacks;

import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove {
    public PlayNice(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected String describe() {
        return "Понижает атаку вражеского покемона";
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ATTACK, -1);
    }
}
