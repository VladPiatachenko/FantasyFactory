package DnD.CharacterCreator.DnDClass.Classes;

public class Barbarian extends CharacterClass{
    private String perk;
    
    public Barbarian(){
    this.name="Barbarian";
    this.dice=12;
    this.perk="Battle rage";
    }
    
    @Override
    public void printMagica(){
        System.out.println("Class "+name+" can:"+perk);
    }
}
