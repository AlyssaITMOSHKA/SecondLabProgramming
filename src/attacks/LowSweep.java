package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class LowSweep extends PhysicalMove {

    public LowSweep(){
        super(Type.FIGHTING, 65, 100);
    }

    @Override
    public void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }

    @Override
    public String describe(){
        return "использует low sweep";
    }
}
