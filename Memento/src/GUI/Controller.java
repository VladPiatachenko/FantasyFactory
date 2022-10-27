package GUI;

import DnD.CharacterCreator.DnDClass.Factory.ClassFactory;
import DnD.CharacterCreator.DnDRace.Dwarf.DwarfFactory;
import DnD.CharacterCreator.DnDRace.Elf.ElfFactory;
import DnD.CharacterCreator.DnDRace.RaceAbstractFactory;
import DnD.CharacterCreator.DnDRace.RaceFactory;
import DnD.CharacterCreator.MementoCareTaker.CareTaker;
import DnD.CharacterCreator.Stats;
import DnD.CharacterCreator.Character;
import DnD.DataVisitor.DataElement;
import DnD.DataVisitor.ElementVisitor;
import java.awt.Component;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;

public class Controller {
    private static Model mode=Model.getInst();
    private static int it=0;
    private static String[] listData=new String[5];//only 5 characters alowed
    
    public static void generateStats(){
        mode.setStat(Stats.generate());
        DnDFrame.jTextField2.setText(mode.getStat().getAttrib().get("Strength").toString());
        DnDFrame.jTextField3.setText(mode.getStat().getAttrib().get("Dexterity").toString());
        DnDFrame.jTextField4.setText(mode.getStat().getAttrib().get("Constitution").toString());
        DnDFrame.jTextField5.setText(mode.getStat().getAttrib().get("Intelligence").toString());
        DnDFrame.jTextField6.setText(mode.getStat().getAttrib().get("Wisdom").toString());
        DnDFrame.jTextField7.setText(mode.getStat().getAttrib().get("Charisma").toString());
    }
    
    public static void runMemento(){
        if(!mode.getStat().equals(null)){
            mode.setCaretaker(new CareTaker());
            mode.getCaretaker().add(mode.getStat().save());
            DnDFrame.jTextArea1.setText("Attributes saved");
        }
    }
    
    public static void returnMemento(){
        try{
            mode.getStat().undoToLastSave(mode.getCaretaker().getLast());
            DnDFrame.jTextField2.setText(mode.getStat().getAttrib().get("Strength").toString());
            DnDFrame.jTextField3.setText(mode.getStat().getAttrib().get("Dexterity").toString());
            DnDFrame.jTextField4.setText(mode.getStat().getAttrib().get("Constitution").toString());
            DnDFrame.jTextField5.setText(mode.getStat().getAttrib().get("Intelligence").toString());
            DnDFrame.jTextField6.setText(mode.getStat().getAttrib().get("Wisdom").toString());
            DnDFrame.jTextField7.setText(mode.getStat().getAttrib().get("Charisma").toString());
        }
        catch(NullPointerException ex){DnDFrame.jTextArea1.setText("No saved attributes found");
        }
    }
    
    public static void createCharacter(){
        if(mode.getStat()!=null){
        if(it<5) {
            String name=DnDFrame.jTextField1.getText().toString();
            String cla=DnDFrame.jComboBox2.getSelectedItem().toString();
            String race=DnDFrame.jComboBox1.getSelectedItem().toString();
            System.out.println(name+" "+cla+" "+race);
            mode.setCha(name,cla,race);
            mode.getCha().setAtributes(mode.getStat());
            mode.getCha().addRaceBonuses();
            mode.addItem(mode.getCha());
            System.out.println(mode.getCha().getDndclass().toString());
            mode.getVisitor().visit(mode.getCha());
            DnDFrame.jTextArea1.setText("Character "+name+" created!");
            listData[it]=race+"-"+cla+" "+name;
            DnDFrame.jList1.setListData(listData);
            it++;
            }
        else{    DnDFrame.jTextArea1.setText("Only 5 characters allowed");}
    }else{    DnDFrame.jTextArea1.setText("Generate attributes before creating character");}}
    
    public static void saveJSON() throws IOException{
        String str="[\n";
            
        for(Character ch:mode.getItems()){
            mode.getJsonObject().clear();
            List<DataElement> list = new ArrayList<>();
            list.add(ch);
            list.add(ch.getDndclass());
            list.add(ch.getRace());
            list.add(ch.getAtributes());
            
            
                for(DataElement elem:list){
                mode.setJsonObject(elem.access(mode.getVisitor()));
            }
                str+=mode.getJsonObject().toJSONString();
                str+="\n";
            
        if(mode.getItems().indexOf(ch)!=mode.getItems().size()-1){str+=",";}                
        }
        
        str+="\n]";
        DnDFrame.jTextPane1.setText(str);
        FileWriter file = new FileWriter("output.json");
        file.write(str);
        file.close();    
    }

    static void printSelected() {
            DnDFrame.jTextArea1.setText("");
            mode.getJsonObject().clear();
            List<DataElement> list = new ArrayList<>();
            list.add(mode.getCha());
            list.add(mode.getCha().getDndclass());
            list.add(mode.getCha().getRace());
            list.add(mode.getCha().getAtributes());
            
            String str="";
                for(DataElement elem:list){
                mode.setJsonObject(elem.access(mode.getVisitor()));
            }
                str=mode.getJsonObject().toJSONString();
                
            DnDFrame.jTextArea1.setText(str);
                        
    }

    
}
