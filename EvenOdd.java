import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.applet.*;

//<applet code="EvenOdd" height=400 width=300></applet>
public class EvenOdd extends Applet implements ActionListener{
    TextField t1,t2;
    Button b1,b2;
    public void init(){
        Label l=new Label("Click the respective button to genreate number");
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Even");
        b2=new Button("Odd");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(l);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
    }

    public void paint() {   
    }

    public void actionPerformed(ActionEvent e) {
        Random random=new Random();
        int a;
        String s;
        if(e.getSource()==b1){
                do{
                    a=random.nextInt(100);
                }while(a%2!=0);
            s=String.valueOf(a);
            t1.setText(s);
        }
        else if(e.getSource()==b2){
            do{
                a=random.nextInt(100);
            }while(a%2==0);
            s=String.valueOf(a);
            t2.setText(s);
        }
    }
}