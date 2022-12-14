package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class IceShard extends PhysicalMove {

    public IceShard(){
        super(Type.ICE, 40, 100);
        this.priority = 1;
    }

    @Override
    public String describe(){
        return "использует ice shard";
    }
}
