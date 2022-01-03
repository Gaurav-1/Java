import java.applet.Applet;
import java.awt.*;
//<Applet code="summ" height=300 width=300></Applet

public class summ extends Applet{
	String s1,s2,s3;

	TextField t1,t2,t3,t4;

	public void init(){
		
		t1=new TextField(5);
		t2=new TextField(5);
		t3=new TextField(5);
		
		add(t1);
		add(t2);
		add(t3);
	}

	public void paint(Graphics g){
		
		s1=t1.getText();
		s2=t2.getText();
		
		s3=String.valueOf(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		t3.setText(s3);
	}
}