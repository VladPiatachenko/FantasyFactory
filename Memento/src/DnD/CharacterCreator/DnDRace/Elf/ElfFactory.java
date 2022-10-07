package DnD.CharacterCreator.DnDRace.Elf;

import DnD.CharacterCreator.DnDRace.RaceAbstractFactory;
import DnD.CharacterCreator.Stats;
import java.util.HashMap;

    
public class ElfFactory implements RaceAbstractFactory{
    HashMap<String,Stats> elfTypes=new HashMap<>();
    
    @Override
    public Elf create(String type) {
        if(elfTypes.isEmpty()){
            elfTypes.put("High Elf", new Stats(0,2,0,1,0,0));
            elfTypes.put("Wood Elf", new Stats(0,2,0,0,1,0));
            elfTypes.put("Drow Elf", new Stats(0,2,0,0,0,1));
        }
        return new Elf(type,elfTypes.get(type));
    }
}
