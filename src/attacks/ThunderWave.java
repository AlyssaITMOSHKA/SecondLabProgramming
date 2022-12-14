package attacks;

import ru.ifmo.se.pokemon.*;


public class ThunderWave extends StatusMove {

    public ThunderWave(){
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    public void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
    }

    @Override
    public String describe(){
        return "парализует соперника";
    }
}
