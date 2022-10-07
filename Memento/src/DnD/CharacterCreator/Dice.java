package DnD.CharacterCreator;

import java.util.ArrayList;
import java.util.Collections;

public class Dice {
    
public static int roll(){
    return 1+(int)(Math.random()*((6-1)+1));
    }    
public static int rollstat(){
  ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 6; i++) {
            list.add(roll());
        }

        Collections.sort(list, Collections.reverseOrder());

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += list.get(i);
        }

        return sum;    }
}
