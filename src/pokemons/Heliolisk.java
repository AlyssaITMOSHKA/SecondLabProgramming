package pokemons;

import attacks.EerieImpulse;

public class Heliolisk extends Helioptile {

    public Heliolisk(String name, int level){
        super(name, level);
        setStats(62, 55, 52, 109, 94, 109);
        addMove(new EerieImpulse());
    }
}
