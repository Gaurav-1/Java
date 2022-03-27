import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="SMA" height=300 width=400></applet>
public class SMA extends Applet implements ActionListener{
    TextField t1,t2,t3,t4;
    Button sum,mult,aveg;
    public void init(){
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);
        sum=new Button("Sum");
        mult=new Button("Multiply");
        aveg=new Button("Average");
        sum.addActionListener(this);
        mult.addActionListener(this);
        aveg.addActionListener(this);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(sum);
        add(mult);
        add(aveg);
    }

    public void paint() {
    }

    public void actionPerformed(ActionEvent e) {
        int num1,num2,num3;
        if(e.getSource()==sum){
            num1=Integer.parseInt(t1.getText());
            num2=Integer.parseInt(t2.getText());
            num3=Integer.parseInt(t3.getText());
            t4.setText(String.valueOf(num1+num2+num3));
        }
        else if(e.getSource()==mult){
            num1=Integer.parseInt(t1.getText());
            num2=Integer.parseInt(t2.getText());
            num3=Integer.parseInt(t3.getText());
            t4.setText(String.valueOf(num1*num2*num3));
        }
        else if(e.getSource()==aveg){
            num1=Integer.parseInt(t1.getText());
            num2=Integer.parseInt(t2.getText());
            num3=Integer.parseInt(t3.getText());
            t4.setText(String.valueOf((num1+num2+num3)/2));
        }
    }
}