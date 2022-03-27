import java.awt.event.*;
import java.awt.*;
import java.applet.*;
//<applet code="Draw" height=400 width=400></applet>

public class Draw extends Applet implements MouseListener,ActionListener{

    int x1=0,y1=0,x2=0,y2=0;
    Button l,r;
    String op;
    public void init() {
        l=new Button("Line");
        r= new Button("Rectangle");
        add(new Label("Chosse shape"));
        add(l);
        add(r);
        addMouseListener(this);
        l.addActionListener(this);
        r.addActionListener(this);
    }

    public void mouseReleased(MouseEvent e) {
        x2=e.getX();
        y2=e.getY();
        repaint();
    }

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {
        x1=e.getX();
        y1=e.getY();}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==l)
            op="Line";
        else if(e.getSource()==r)
                op="Rect";
    }

    public void paint(Graphics g) {
        int width,height;
        if(op=="Line")
            g.drawLine(x1, y1, x2, y2);
        else if(op=="Rect"){
                width=(x2>x1)?x2-x1:x1-x2;
                height=(y2>y1)?y2-y1:y1-y2;
                if(x1<x2&&y1<y2)
                    g.drawRect(x1, y1, width, height);
                else if(y1<y2)
                    g.drawRect(x2, y1, width, height);
                else if(y1>y2&&x1<x2)
                    g.drawRect(x1, y2, width, height);
                else
                    g.drawRect(x2, y2, width, height);
            }
    }
}