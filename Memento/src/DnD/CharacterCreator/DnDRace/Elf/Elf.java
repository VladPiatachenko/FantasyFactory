package DnD.CharacterCreator.DnDRace.Elf;

import DnD.CharacterCreator.DnDRace.CharacterRace;
import DnD.CharacterCreator.Stats;
import java.util.Set;

public class Elf extends CharacterRace{

    Elf(String name,Stats stat){
        this.name=name;     
        this.bonuses=stat;
    }

    @Override
    public void shout() {
        System.out.println("A Elbereth Gilthoniel!");
    }
    
}
