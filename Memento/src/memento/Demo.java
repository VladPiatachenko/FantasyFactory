package memento;


public class Demo {
    public static void main(String[] args){
    Character player=new Character("Ramirez de Salt","bard","half-elf");
    
    Stats temp=Stats.generate();
    player.setAtributes(temp);
    player.printSheet();
    
    CareTaker caretaker= new CareTaker();
    Memento mem = new Memento();
    
    temp=Stats.generate();
    temp.printStats();
    mem.setState(temp);
    caretaker.add(mem.saveStateToMemento());
    
    temp=Stats.generate();
    temp.printStats();
    
    mem.setState(temp);
    caretaker.add(mem.saveStateToMemento());
    
    mem.getStateFromMemento(caretaker.get(0).getState());
    temp=mem.getState();
    temp.printStats();
    
    mem.getStateFromMemento( caretaker.get(1).getState());
    temp=mem.getState();
    temp.printStats();
    
}
}
