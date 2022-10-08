package memento;

public class Memento {
   private Stats state;
   private int str,dex,con,inte,wis, cha;
    

   Memento(Stats state){
        this.state=state;
        this.str=state.getStr();
        this.dex=state.getDex();
        this.con=state.getCon();
        this.inte=state.getInte();
        this.wis=state.getWis();
        this.cha=state.getCha();
    
   }

    Memento() {
    }
   
   public void setState(Stats state){
      this.state = state;
        this.str=state.getStr();
        this.dex=state.getDex();
        this.con=state.getCon();
        this.inte=state.getInte();
        this.wis=state.getWis();
        this.cha=state.getCha();
   }

   public Stats getState(){
      return state;
   }

   public Memento saveStateToMemento(){
      System.out.println("State ready to save");
      return new Memento(state);
   }

   public void getStateFromMemento(Stats state){
      this.state = state;
   }
}

