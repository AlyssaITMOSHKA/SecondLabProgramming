package pokemons;

import attacks.PlayNice;

public class Steenee extends Bounsweet{

    public Steenee(String name, int level){
        super(name, level);
        setStats(52, 40, 48, 40, 48, 62);
        addMove(new PlayNice());
    }
}
