package memento.viainnerclass;
/*it is our originator class*/
public class Stats {
    
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
    public Memento save(){
    
        return new Memento(this.str,this.dex,this.con,this.inte,this.wis,this.cha);
    
    }
    public void undoToLastSave(Object obj){
        Memento memento = (Memento) obj;
        this.str=memento.str;
        this.dex=memento.dex;
        this.con=memento.con;
        this.inte=memento.inte;
        this.wis=memento.wis;
        this.cha=memento.cha;
    
 }
private class Memento {
    
   private int str,dex,con,inte,wis, cha;
    
   
    Memento(int s, int d,int c, int i, int w, int ch){
    this.str=s;
    this.dex=d;
    this.con=c;
    this.inte=i;
    this.wis=w;
    this.cha=ch;
    }
   
}


}

