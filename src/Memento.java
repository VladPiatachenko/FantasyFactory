public class Memento {
   private Stats state;

   public void setState(Stats state){
      this.state = state;
   }

   public Stats getState(){
      return state;
   }

   public Stats saveStateToMemento(){
      System.out.println("State ready to save");
      return new Stats(state);
   }

   public void getStateFromMemento(Stats Memento){
      state = Memento.getState();
   }
}

