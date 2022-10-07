package DnD.CharacterCreator.DnDRace.Elf;

import DnD.CharacterCreator.DnDRace.CharacterRace;
import DnD.CharacterCreator.Stats;
import java.util.Set;

public class Elf extends CharacterRace{
    private int height;
    private String size;
    private int speed;
    
    Elf(String name,Stats stat){
        this.name=name;     
        this.bonuses=stat;
        this.size="Middle";
        this.height=180;
        this.maxage=800;
        this.speed=30;
    }

    @Override
    public void shout() {
        System.out.println("A Elbereth Gilthoniel!");
    }
    
}
