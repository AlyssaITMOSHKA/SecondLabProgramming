package attacks;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Effect;

public class Swagger extends StatusMove {

    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }

    @Override
    public void applyOppEffects(Pokemon p){
        if (p.getStat(Stat.ATTACK) < 5){
            Effect.confuse(p);
        }
        p.addEffect(new Effect().stat(Stat.ATTACK, + 2).turns(2));
    }

    @Override
    public String describe(){
        return "повышает атаку соперника на 2 ступени";
    }
}
