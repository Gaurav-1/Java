import java.applet.Applet;
import java.awt.*;
//<Applet code="tablee" height=300 width=300></Applet

public class tablee extends Applet{
	
	String s1,s2,s3;
	int a,b,c,count=1;
	boolean flag=true;
	
	TextField t1,t2,t3,t4;

	public void init(){
		
		t1=new TextField(100);
		t2=new TextField(100);
		t3=new TextField(100);
		
		add(t1);
		add(t2);
		add(t3);
	}
	
	public void take(){
	
		s1=t1.getText();
		a=Integer.parseInt(s1);
		
		s2=t2.getText();
		b=Integer.parseInt(s2);
		
		s3=t3.getText();
		c=Integer.parseInt(s3);
		
		t1.setText("");
		t2.setText("");
		t3.setText("");
}

public void paint(Graphics g){

	int temp1,temp2,temp3;

	if(flag==true){
	take();
	flag=false;
	}

	temp1=a*count;
	temp2=b*count;
	temp3=c*count;
	
	s1=String.valueOf(temp1);
	s2=String.valueOf(temp2);
	s3=String.valueOf(temp3);

	t1.setText(t1.getText()+" | "+a+" x "+String.valueOf(count)+" = "+s1);
	t2.setText(t2.getText()+" | "+b+" x "+String.valueOf(count)+" = "+s2);
	t3.setText(t3.getText()+" | "+c+" x "+String.valueOf(count)+" = "+s3);
	count++;
}}
