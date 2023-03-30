import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Battleground{
    public static void main(String[] args){
        Battle field = new Battle();
        field.addAlly(new Buzzwole("Jarami", 3));
        field.addAlly(new Hippopotas("Kunami", 2));
        field.addAlly(new Bounsweet("Helium", 2));
        field.addFoe(new Steenee("Gudom", 3));
        field.addFoe(new Hippowdon("Tsakan", 3));
        field.addFoe(new Tsareena("Luzzy", 2));
        field.go();
    }
}
