package DnD.CharacterCreator.DnDRace;

import DnD.CharacterCreator.Stats;
import java.util.Set;

public class Dwarf extends CharacterRace{
private int height;
    private String size;
    private int speed;
    
    Dwarf(){
    this.name="Mountain Dwarf";
    this.height=145;
    this.maxage=350;
    this.size="Middle";
    this.speed=25;
    this.bonuses=new Stats(2,0,2,0,0,0);
    }
    
    @Override
    public Stats addRaceBonuses(Stats base) {
        System.out.println("Recalculating attributes for Mountain Dwarf");
        Set<String> key=base.getAttrib().keySet();
        for(String title:key){
            int val=base.getAttrib().get(title)+this.bonuses.getAttrib().get(title);
            base.getAttrib().put(title, val);
        }
        return base;
    }

    @Override
    public void shout() {
        System.out.println("Baruk Khazâd! Khazâd ai-mênu!");
    }
        
}
