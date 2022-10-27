package DnD.CharacterCreator;

import DnD.CharacterCreator.DnDClass.Classes.CharacterClass;
import DnD.CharacterCreator.DnDRace.CharacterRace;
import DnD.DataVisitor.DataElement;
import DnD.DataVisitor.DataElementsVisitor;
import java.util.Set;
import java.util.TreeMap;
import org.json.simple.JSONObject;

public class Character implements DataElement{
    private String name;
    private CharacterClass dndclass;
    private CharacterRace race;
    private Stats chStats;
    private int health;

    public Character(String name, CharacterClass dndclass, CharacterRace race) {
        this.name = name;
        this.dndclass = dndclass;
        this.health=dndclass.getDice();
        this.race = race;
    }
    public int getHealth() {
        return health;
    }

    public CharacterRace getRace() {
        return race;
    }

    public void setRace(CharacterRace race) {
        this.race = race;
    }

    public CharacterClass getDndclass() {
        return dndclass;
    }

    public Stats getChStats() {
        return chStats;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Stats getAtributes() {
        return chStats;
    }
    public void addRaceBonuses() {
        Set<String> key=this.chStats.getAttrib().keySet();
        for(String title:key){
            int val=this.chStats.getAttrib().get(title)+this.race.getRaceBonuses().getAttrib().get(title);
            this.chStats.getAttrib().put(title, val);
        }
        this.health+=Math.floor(this.chStats.getAttrib().get("Constitution")/2)-5;
    }
    
    public void setAtributes(Stats attributes) {
        this.chStats = attributes;
    }
    public void printSheet(){
        System.out.println("Name: "+name+"\n"+dndclass.toString()+"\nHealth points:"+health);
        dndclass.printMagica();
        race.print();
        chStats.printStats();
    }
    
    public void battleCry(){
        race.shout();
    }

    
    @Override
    public TreeMap access(DataElementsVisitor vis) {
        return vis.visit(this);
    }
}
