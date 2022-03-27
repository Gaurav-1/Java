import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="ActItm" height=400 width=300></applet>

public class ActItm extends Applet implements ItemListener,ActionListener{

    CheckboxGroup cbg1;
    Checkbox ch1,ch2,ch3;
    Label lb1,lb2;
    Button b1;
    String sel=null;
    public void init(){
        lb1=new Label("Transport you use");
        lb2=new Label("");
        b1=new Button("Print");
        cbg1=new CheckboxGroup();
        ch1= new Checkbox("Bike",cbg1,false);
        ch2= new Checkbox("Car",cbg1,false);
        ch3= new Checkbox("Bus",cbg1,false);
        add(lb1);
        add(ch1);
        add(ch2);
        add(ch3);
        add(b1);
        add(lb2);
        lb2.setPreferredSize(new Dimension(200,50));
        ch1.addItemListener(this);
        ch2.addItemListener(this);
        ch3.addItemListener(this);
        b1.addActionListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if(cbg1.getSelectedCheckbox()==ch1)
            sel=ch1.getLabel();
        else if(cbg1.getSelectedCheckbox()==ch2)
                sel=ch2.getLabel();
        else if(cbg1.getSelectedCheckbox()==ch3)
                sel=ch3.getLabel();
    }

    public void actionPerformed(ActionEvent e) {
        lb2.setText("Transport used is: "+sel);
    }
}