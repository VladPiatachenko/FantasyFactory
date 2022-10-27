package DnD.CharacterCreator.DnDRace.Dwarf;

import DnD.CharacterCreator.DnDRace.CharacterRace;
import DnD.CharacterCreator.Stats;
import java.util.Set;

public class Dwarf extends CharacterRace{

    Dwarf(String name,Stats stat){
        this.name=name;
        this.bonuses=stat;
    }
    
    @Override
    public void shout() {
        System.out.println("Baruk Khazâd! Khazâd ai-mênu!");
    }
        
}
