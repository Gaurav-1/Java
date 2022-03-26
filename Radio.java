import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="Radio" height=400 width=300></applet>

public class Radio extends Applet implements ItemListener{

    CheckboxGroup cbg1;
    Checkbox ch1,ch2,ch3;
    Label lb1,lb2;
    public void init(){
        lb1=new Label("Transports you use");
        lb2=new Label("Selected radio button is: None");
        cbg1=new CheckboxGroup();
        ch1= new Checkbox("Bike",cbg1,true);
        ch2= new Checkbox("Car",cbg1,false);
        ch3= new Checkbox("Bus",cbg1,false);
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
        String sel=null;
        if(cbg1.getSelectedCheckbox()==ch1)
            sel=ch1.getLabel();
        else if(cbg1.getSelectedCheckbox()==ch2)
                sel=ch2.getLabel();
        else if(cbg1.getSelectedCheckbox()==ch3)
                sel=ch3.getLabel();
        
        lb2.setText("Selected radio button is: "+sel);
    }
}