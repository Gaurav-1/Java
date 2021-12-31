import java.applet.*;
import java.awt.*;

//<applet code="swap" height=100 width=100></applet>

public class swap extends Applet{

	TextField t1,t2;
	
	public void init(){
		t1=new TextField(8);
		t2=new TextField(8);
		add(t1);
		add(t2);
	}
	
	public void paint(Graphics g){
		String s1,s2;
		s1=t1.getText();
		s2=t2.getText();
		t1.setText(s2);
		t2.setText(s1);
	}
}
