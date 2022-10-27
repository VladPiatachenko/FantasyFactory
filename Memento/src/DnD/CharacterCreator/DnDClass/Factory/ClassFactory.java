package DnD.CharacterCreator.DnDClass.Factory;

import DnD.CharacterCreator.DnDClass.Classes.Barbarian;
import DnD.CharacterCreator.DnDClass.Classes.CharacterClass;
import DnD.CharacterCreator.DnDClass.Classes.Wizard;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("Barbarian".equalsIgnoreCase(type)) return new Barbarian();
        else if("Wizard".equalsIgnoreCase(type)) return new Wizard(); 
        return null;
 }

}
