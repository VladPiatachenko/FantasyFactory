package DnD.CharacterCreator;

import DnD.CharacterCreator.DnDRace.CharacterRace;
import DnD.CharacterCreator.DnDRace.Dwarf.DwarfFactory;
import DnD.CharacterCreator.DnDRace.Elf.ElfFactory;
import DnD.CharacterCreator.DnDRace.RaceFactory;
import DnD.CharacterCreator.MementoCareTaker.CareTaker;


public class Demo {
    public static void main(String[] args){
    Character player=new Character("Thorin II \"Oakenshield\"","warrior",
            RaceFactory.getRace(new DwarfFactory(), "Mountain Dwarf"));
    player.setAtributes(Stats.generate());
    player.addRaceBonuses();
    player.printSheet();
    player.battleCry();
    
    Character player2=new Character("Fëanor, first King of the Noldor","enchanter",
            RaceFactory.getRace(new ElfFactory(), "High Elf"));
    player2.setAtributes(Stats.generate());
    player2.addRaceBonuses();
    player2.printSheet();
    player2.battleCry();
    
    
}
}
