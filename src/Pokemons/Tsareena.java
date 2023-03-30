package Pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Tsareena extends Steenee {
    public Tsareena(String name, int level){
        super(name, level);
        setStats(72, 120, 98, 50, 98, 72);
        setType(Type.GRASS);
        setMove(new RazorLeaf(), new DazzlingGleam(), new PlayNice(),new EnergyBall());
    }
}
