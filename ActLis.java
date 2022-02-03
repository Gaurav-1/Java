import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="ActLis" height=300 width=500></applet>
public class ActLis extends Applet implements ActionListener{
    Label l1;
    Button b1,b2,b3;
    public void init(){
        l1=new Label("Click Button to change the Text");
        b1=new Button("Button 1");
        b2=new Button("Button 2");
        b3=new Button("Button 3");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(l1);
        add(b1);
        add(b2);
        add(b3);
    }
    
    public void paint(Graphics g) {
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
            l1.setText("Button 1 pressed");
        else if(e.getSource()==b2)
            l1.setText("Button 2 pressed");
        else if(e.getSource()==b3)
            l1.setText("Button 3 pressed");
    }

    
}