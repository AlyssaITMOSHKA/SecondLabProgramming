package attacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    public Confide(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    public void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    public String describe(){
        return "понижает special attack противника на 1 ступень";
    }
}
