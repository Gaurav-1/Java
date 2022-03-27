import java.awt.event.*;
import java.applet.*;
//<applet code="MListener" height=400 width=400></applet>

public class MListener extends Applet implements MouseListener,MouseMotionListener{

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseEntered(MouseEvent e) {
        showStatus("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        showStatus("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        showStatus("Mouse Pressed at axis x:"+e.getX()+" y:"+e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        showStatus("Mouse Released at axis x:"+e.getX()+" y:"+e.getY());
    }

    public void mouseClicked(MouseEvent e) {
        showStatus("Mouse Clicked at axis x:"+e.getX()+" y:"+e.getY());
    }

    
    public void mouseDragged(MouseEvent e) {
        showStatus("Mouse Drragged at axis x:"+e.getX()+" y:"+e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        showStatus("Mouse Moved at axis x:"+e.getX()+" y:"+e.getY()); 
    }
}