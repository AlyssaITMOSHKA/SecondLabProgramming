package pokemons;

import attacks.Confide;
import attacks.FrostBreath;
import attacks.IceShard;
import attacks.SteelWing;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Articuno extends Pokemon {

    public Articuno(String name, int level) {
        super(name, level);
        setType(Type.FLYING, Type.ICE);
        setStats(90, 85, 100, 95, 125, 85);
        setMove(new FrostBreath(), new IceShard(), new Confide(), new SteelWing());
    }
}
