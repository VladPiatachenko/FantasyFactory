package DnD.CharacterCreator.DnDClass.Classes;

import DnD.DataVisitor.DataElement;
import DnD.DataVisitor.DataElementsVisitor;
import java.util.TreeMap;
import org.json.simple.JSONObject;

public abstract class CharacterClass implements DataElement {
    protected String name;
    protected int dice;//to roll health
    
    public abstract void printMagica();
    
    public int getDice(){
    return dice;
    }
    
    public String toString(){ 
        return name;
    }

    @Override
    public TreeMap access(DataElementsVisitor vis) {
        return vis.visit(this);
    }
    
    
}
