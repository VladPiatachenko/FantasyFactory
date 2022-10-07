package DnD.CharacterCreator.DnDRace.Dwarf;

import DnD.CharacterCreator.DnDRace.CharacterRace;
import DnD.CharacterCreator.Stats;
import java.util.Set;

public class Dwarf extends CharacterRace{
private int height;
private String size;
private int speed;
    
    Dwarf(String name,Stats stat){
        this.name=name;
        this.bonuses=stat;
        this.height=145;
        this.maxage=350;
        this.size="Middle";
        this.speed=25;
    }
    
    @Override
    public void shout() {
        System.out.println("Baruk Khazâd! Khazâd ai-mênu!");
    }
        
}
