package attacks;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FrostBreath extends SpecialMove {

    public FrostBreath() {
        super(Type.ICE, 60, 95);
    }

    @Override
    public String describe(){
        return "использует frost breath";
    }
}
