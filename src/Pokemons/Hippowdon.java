package Pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Hippowdon extends Hippopotas {
    public Hippowdon(String name, int level){
        super(name, level);
        setStats(108,112,118,68,72,47);
        setType(Type.GROUND);
        setMove(new Bulldoze(), new RockTomb(), new DoubleEdge(), new StoneEdge());
    }
}
