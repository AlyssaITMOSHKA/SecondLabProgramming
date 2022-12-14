package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RazorLeaf extends PhysicalMove {

    public RazorLeaf(){
        super(Type.GRASS, 55, 95);
    }

    @Override
    public double calcCriticalHit(Pokemon att, Pokemon def){
        return super.calcCriticalHit(att, def) + 1;
    }

    @Override
    public String describe(){
        return "использует razor leaf";
    }
}
