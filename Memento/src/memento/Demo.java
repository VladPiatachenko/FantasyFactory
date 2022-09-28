package memento;


public class Demo {
    public static void main(String[] args){
    Character player=new Character("Ramirez de Salt","bard","half-elf");
    
    Stats temp=Stats.generate();
    player.setAtributes(temp);
    player.printSheet();
    
    CareTaker caretaker= new CareTaker();
    Originator originator = new Originator();
    
    temp=Stats.generate();
    temp.printStats();
    originator.setState(temp);
    caretaker.add(originator.saveStateToMemento());
    
    temp=Stats.generate();
    temp.printStats();
    originator.setState(temp);
    caretaker.add(originator.saveStateToMemento());
    
    originator.getStateFromMemento(caretaker.get(0));
    temp=originator.getState();
    temp.printStats();
    
    originator.getStateFromMemento(caretaker.get(1));
    temp=originator.getState();
    temp.printStats();
    
}
}
