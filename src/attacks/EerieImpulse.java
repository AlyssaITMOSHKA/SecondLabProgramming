package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class EerieImpulse extends StatusMove {

    public EerieImpulse(){
        super(Type.ELECTRIC, 0, 100);
    }

    @Override
    public void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    public String describe(){
        return "уменьшает special attack соперника на 2 ступени";
    }
}
