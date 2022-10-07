package DnD.CharacterCreator.DnDRace;

import DnD.CharacterCreator.Stats;
import java.util.List;
import java.util.Set;

public abstract class CharacterRace {
    protected String name;
    protected Stats bonuses;
    protected int maxage;
    
    public Stats getRaceBonuses(){
        return bonuses;
    }
    
    public abstract void shout();
    public String toString(){
    return name;
    }
    public void print(){
        System.out.println("Race: "+name);
        Set<String> key=bonuses.getAttrib().keySet();
        for(String title:key){
        if(bonuses.getAttrib().get(title)!=0){
            System.out.println("Race bonus: "+title+" +"+bonuses.getAttrib().get(title));
        }
        }
    }
}