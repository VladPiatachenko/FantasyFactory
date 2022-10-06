package memento.viainnerclass;


public class Demo {
    public static void main(String[] args){
    Character player=new Character("Ramirez de Salt","bard","half-elf");
    
    Stats temp=Stats.generate();
    player.setAtributes(temp);
    player.printSheet();
    
    CareTaker caretaker= new CareTaker();
    
    temp=Stats.generate();
    temp.printStats();
    caretaker.add(temp.save());
    
    temp=Stats.generate();
    temp.printStats();
    caretaker.add(temp.save());
    
    temp.undoToLastSave(caretaker.get(0));
    temp.printStats();
    
    temp.undoToLastSave(caretaker.get(1));
    temp.printStats();
    
}
}
