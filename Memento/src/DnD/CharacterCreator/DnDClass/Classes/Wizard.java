package DnD.CharacterCreator.DnDClass.Classes;

import DnD.CharacterCreator.DnDClass.Classes.CharacterClass;
import java.util.ArrayList;
import java.util.List;

public class Wizard extends CharacterClass{
    private List<String> spells;
    public Wizard(){
    this.name="Wizard";
    this.dice=6;
    this.spells=new ArrayList();
    this.spells.add("FireBall");
    this.spells.add("Polymorph");
    }
    
    @Override
    public void printMagica(){
        System.out.println("Class "+name+" knows spells:");
        for(String spell:spells){
            System.out.println(spell);
        }
    }
}
