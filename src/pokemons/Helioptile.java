package pokemons;

import attacks.LowSweep;
import attacks.Swagger;
import attacks.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Helioptile extends Pokemon {

    public Helioptile(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC, Type.NORMAL);
        setStats(44, 38, 33, 61, 43, 70);
        setMove(new ThunderWave(), new LowSweep(), new Swagger());
    }
}
