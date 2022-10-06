/*it is our originator class*/
public class Stats {
    private Stats state;//backup of roll
    
    private int str;
    private int dex;
    private int con;
    private int inte;
    private int wis;
    private int cha;
    
    Stats(int s, int d,int c, int i, int w, int ch){
    this.str=s;
    this.dex=d;
    this.con=c;
    this.inte=i;
    this.wis=w;
    this.cha=ch;
    }
    
    public Stats(Stats state){
      this.state = state;
   }

   public Stats getState(){
      return state;
   }
    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
    }

    public int getCon() {
        return con;
    }

    public int getInte() {
        return inte;
    }

    public int getWis() {
        return wis;
    }

    public int getCha() {
        return cha;
    }
    
    public static Stats generate(){
    return new Stats(Dice.rollstat(),Dice.rollstat(),Dice.rollstat(),Dice.rollstat(),Dice.rollstat(),Dice.rollstat());
    }
    public void printStats(){
    System.out.println("~~~~~Attributes Sheet~~~~\nStrength:"+str+
            "\nDexterity:"+dex+"\nConstitution:"+con+
            "\nIntelligence:"+inte+"\nWisdom:"+wis+"\nCharisma:"+cha);
    } 
}

