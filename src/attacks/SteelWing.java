package attacks;
import ru.ifmo.se.pokemon.*;
public class SteelWing extends PhysicalMove {

    public SteelWing(){
        super(Type.STEEL, 42.5, 90);
    }

    @Override
    public String describe(){
        return "использует steel wing";
    }

    @Override
    public void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().chance(0.1).stat(Stat.DEFENSE, +1));
    }
}
