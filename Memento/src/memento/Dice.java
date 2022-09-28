package memento;

public class Dice {
    
public static int roll(){
    //min + (int)(Math.random() * ((Max - Min) + 1))
    return 1+(int)(Math.random()*((6-1)+1));
    }    
public static int rollstat(){
        int value[]=new int[6];//6 rolls of dice
        int stat,first, second, third;
        for(int i=0;i<6;i++){
          value[i]=roll();
        //  System.out.println(value[i]);
        }
        third = first = second = -1;
        for(int i = 0; i < 6; i++){
         
        // If current element is
        // greater than first
        if (value[i] > first)
        {
            third = second;
            second = first;
            first = value[i];
        }
 
        // If arr[i] is in between first
        // and second then update second
        else if (value[i] > second && value[i] != first)
        {
            third = second;
            second = value[i];
        }
 
        else if (value[i] > third && value[i] != second)
            third = value[i];
        }
        //System.out.println(first+" "+second+" "+third);
        return first+second+third;
    }
}
