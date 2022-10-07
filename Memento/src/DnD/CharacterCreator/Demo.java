package DnD.CharacterCreator;

import DnD.CharacterCreator.MementoCareTaker.CareTaker;


public class Demo {
    public static void main(String[] args){
    Character player=new Character("Ramirez de Salt","bard","half-elf");
    player.setAtributes(Stats.generate());
    player.printSheet();
    
}
}
