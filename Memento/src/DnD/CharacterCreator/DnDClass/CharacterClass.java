package DnD.CharacterCreator.DnDClass;

import java.util.List;

public abstract class CharacterClass {
    private String name;
    private List<String> perks;
    
    
    public void print(){
        System.out.println("Class: "+name);
        for(String perk: perks){
            System.out.println("\t"+perk);
        }
    }
}
