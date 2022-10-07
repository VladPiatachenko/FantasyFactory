package DnD.CharacterCreator.DnDRace;

import DnD.CharacterCreator.Stats;
import java.util.Set;

public class Elf extends CharacterRace{
    private int height;
    private String size;
    private int speed;
    
    Elf(){
    this.name="High Elf";
    this.height=180;
    this.maxage=800;
    this.size="Middle";
    this.speed=30;
    this.bonuses=new Stats(0,2,0,1,0,0);
    }
    
    @Override
    public Stats addRaceBonuses(Stats base) {
        System.out.println("Recalculating attributes for High Elf");
        Set<String> key=base.getAttrib().keySet();
        for(String title:key){
            int val=base.getAttrib().get(title)+this.bonuses.getAttrib().get(title);
            base.getAttrib().put(title, val);
        }
        return base;
    }

    @Override
    public void shout() {
        System.out.println("A Elbereth Gilthoniel!");
    }
    
}
