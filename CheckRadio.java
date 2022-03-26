import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="CheckRadio" height=400 width=400></applet>

public class CheckRadio extends Applet implements ItemListener{

    Checkbox ch1,ch2,ch3;
    Label lb1,lb2;
    public void init(){
        lb1=new Label("Vehicle's you use:");
        lb2=new Label("Selected checkbox is: none");
        ch1= new Checkbox("Bike",true);
        ch2= new Checkbox("Car");
        ch3= new Checkbox("Cycle");
        add(lb1);
        add(ch1);
        add(ch2);
        add(ch3);
        add(lb2);
        ch1.addItemListener(this);
        ch2.addItemListener(this);
        ch3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        String sel1="",sel2="",sel3="";
        
        if(ch1.getState()==true)
            sel1=ch1.getLabel();
        if(ch2.getState()==true)
            sel2=ch2.getLabel();
        if(ch3.getState()==true)
            sel3=ch3.getLabel();
        lb2.setText("Selected radio button is: "+sel1+" "+sel2+" "+sel3);
    }
}