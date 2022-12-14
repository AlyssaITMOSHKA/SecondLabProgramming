package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {

    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, +1);
    }

    @Override
    public String describe(){
        return "увеличивает evasion на одну ступень";
    }
}
