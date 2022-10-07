package DnD.CharacterCreator.DnDRace;

import DnD.CharacterCreator.Stats;
import java.util.List;

public abstract class CharacterRace {
    protected String name;
    protected Stats bonuses;
    protected int maxage;
    
    public abstract Stats addRaceBonuses(Stats st);
    
    public abstract void shout();
    
    public void print(){
        System.out.println("Class: "+name);
    }
}