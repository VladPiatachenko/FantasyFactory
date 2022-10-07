package DnD.CharacterCreator;

import java.util.HashMap;
import java.util.Map;

/*it is our originator class*/
public class Stats {
    private Map<String,Integer> attrib;
    
    public Stats(int s, int d,int c, int i, int w, int ch){
        this.attrib=new HashMap<String,Integer>();
        this.attrib.put("Strength", s);
        this.attrib.put("Dexterity", d);
        this.attrib.put("Constitution", c);
        this.attrib.put("Intelligence", i);
        this.attrib.put("Wisdom", w);
        this.attrib.put("Charisma", ch);
        
        
    }

    public Map<String, Integer> getAttrib() {
        return attrib;
    }

    public void setAttrib(Map<String, Integer> attrib) {
        this.attrib = attrib;
    }
    
public static Stats generate(){
    return new Stats(Dice.rollstat(),Dice.rollstat(),Dice.rollstat(),Dice.rollstat(),Dice.rollstat(),Dice.rollstat());
    }
    public void printStats(){
    System.out.println("~~~~~Attributes Sheet~~~~\nStrength:"+this.attrib.get("Strength")+
            "\nDexterity:"+this.attrib.get("Dexterity")+"\nConstitution:"+this.attrib.get("Constitution")+
            "\nIntelligence:"+this.attrib.get("Intelligence")+"\nWisdom:"+this.attrib.get("Wisdom")+"\nCharisma:"+this.attrib.get("Charisma"));
    } 
    
    public Memento save(){
    
        return new Memento(attrib);
    
    }
    public void undoToLastSave(Object obj){
        Memento memento = (Memento) obj;
        this.attrib=memento.attrib;
 }
    private class Memento {

       private Map<String,Integer> attrib;


        Memento(Map<String,Integer> attrib){
            this.attrib=attrib;
        }

    }


}

