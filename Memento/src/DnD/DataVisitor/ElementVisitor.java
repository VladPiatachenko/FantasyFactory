package DnD.DataVisitor;

import DnD.CharacterCreator.DnDClass.Classes.CharacterClass;
import DnD.CharacterCreator.DnDRace.CharacterRace;
import DnD.CharacterCreator.Stats;
import DnD.CharacterCreator.Character;
import java.util.TreeMap;

import org.json.simple.JSONObject;

public class ElementVisitor implements DataElementsVisitor{

    @Override
    public TreeMap visit(Character ch) {
        TreeMap jobj = new TreeMap();
        jobj.put("Name", ch.getName());
        jobj.put("HP",ch.getHealth());
        return jobj;
    }

    @Override
    public TreeMap visit(CharacterClass cl) {
        TreeMap jobj = new TreeMap();
        jobj.put("Class", cl.toString());
        return jobj;
    }

    @Override
    public TreeMap visit(CharacterRace cr) {
         TreeMap jobj = new TreeMap();
         jobj.put("Race", cr.toString());
         return jobj;
    }

    @Override
    public TreeMap visit(Stats st) {
        TreeMap jobj = new TreeMap();
        jobj.put("Attributes", st.getAttrib());
        return jobj;
    }

    
}
