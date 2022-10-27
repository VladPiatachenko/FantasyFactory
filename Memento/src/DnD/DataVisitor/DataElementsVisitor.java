package DnD.DataVisitor;

import DnD.CharacterCreator.DnDClass.Classes.CharacterClass;
import DnD.CharacterCreator.DnDRace.CharacterRace;
import DnD.CharacterCreator.Stats;
import DnD.CharacterCreator.Character;
import java.util.TreeMap;
import org.json.simple.JSONObject;

public interface DataElementsVisitor {
    public TreeMap visit(Character ch);
    public TreeMap visit(CharacterClass cl);
    public TreeMap visit(CharacterRace cr);
    public TreeMap visit(Stats st);

}
