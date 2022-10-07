package DnD.CharacterCreator;

import DnD.CharacterCreator.DnDRace.CharacterRace;
import java.util.Set;

public class Character {
    private String name;
    private String dndclass;
    private CharacterRace race;
    private Stats chStats;

    public CharacterRace getRace() {
        return race;
    }

    public void setRace(CharacterRace race) {
        this.race = race;
    }

    public Character(String name, String dndclass, CharacterRace race) {
        this.name = name;
        this.dndclass = dndclass;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDndclass() {
        return dndclass;
    }

    public void setDndclass(String dndclass) {
        this.dndclass = dndclass;
    }

    public Stats getAtributes() {
        return chStats;
    }
    public void addRaceBonuses() {
        System.out.println("Recalculating attributes for "+this.race.toString());
        Set<String> key=this.chStats.getAttrib().keySet();
        for(String title:key){
            int val=this.chStats.getAttrib().get(title)+this.race.getRaceBonuses().getAttrib().get(title);
            this.chStats.getAttrib().put(title, val);
        }
    }
    
    public void setAtributes(Stats attributes) {
        this.chStats = attributes;
    }
    public void printSheet(){
        System.out.println("Name: "+name+"\nClass: "+dndclass);
        race.print();
        chStats.printStats();
    }
    
    public void battleCry(){
        race.shout();
    }
}
