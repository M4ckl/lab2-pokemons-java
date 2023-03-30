package Pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Hippopotas extends Pokemon{
    public Hippopotas(String name, int level){
        super(name, level);
        setStats(68, 72,78,38,42,32);
        setType(Type.GROUND);
        setMove(new Bulldoze(), new RockTomb(), new DoubleEdge());
    }
}
