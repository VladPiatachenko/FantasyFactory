package memento.viainnerclass;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
   private List<Object> mementoList = new ArrayList<Object>();
   static int saveID=0;
   public void add(Object obj){
      mementoList.add(obj);
      System.out.println("State save "+saveID+"\n");
      saveID++;
   }

   public Object get(int index){
      System.out.println("Loading stats from save "+index);
      return mementoList.get(index);
   }
}
