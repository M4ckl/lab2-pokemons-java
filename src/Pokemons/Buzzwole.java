package Pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Buzzwole extends Pokemon{
    public Buzzwole(String name, int level){
        super(name, level);
        setStats(107, 139, 139, 53, 53,79);
        setType(Type.FIGHTING, Type.BUG);
        setMove(new AcidSpray(),new SludgeWave(),new Venoshock(),new Facade());
    }
}
