package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class PlayNice extends StatusMove {

    public PlayNice(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    public void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }

    @Override
    public String describe(){
        return "снижает attack соперника на 1 ступень";
    }
}
