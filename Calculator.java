import java.awt.*;
import java.awt.event.*;
import java.applet.*;
// <applet code ="Calculator" width=500 height=500></applet>

public class Calculator extends Applet implements ActionListener {
	String msg=" ";
	String v1,v2;
	int result;
	double result1;
	TextField t1;
	Button b[]= new Button[10];
	Button add, sub, mul, div, mod, EQ, sqr, sqrt, cube, clear;
	char OP;
	public void init() {
		t1=new TextField(50);
		GridLayout g1= new GridLayout(5,4);
		setLayout(g1);
		for(int i=0;i<10;i++){
			b[i]=new Button("" +i);
		}
		add = new Button("+");
		sub = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		mod = new Button("%");
		clear = new Button("Clear");
		sqr = new Button("SQR");
		sqrt = new Button("SQRT");
		cube = new Button("Cube");
		EQ = new Button("=");
		t1.addActionListener(this);
		add(t1);
		add(clear);
		add(mod);
		add(div);
		for(int i=7;i<10;i++){
			add(b[i]);
		}
		add(add);
		for(int i=4;i<7;i++){
			add(b[i]);
		}
		add(sub);
		for (int i=1;i<4;i++) {
			add(b[i]);
		}
		add(mul);
		add(sqr);
		add(sqrt);
		add(cube);
		add(EQ);
		for(int i=9; i>0; i--){
			b[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
		sqrt.addActionListener(this);
		sqr.addActionListener(this);
		cube.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();
		char ch=str.charAt(0);

		if(Character.isDigit(ch))
			t1.setText(t1.getText()+str);
		else if(str.equals("+")){
				v1=t1.getText();
				OP='+';
				t1.setText("");
			}
			else if(str.equals("-")){
				v1=t1.getText();
				OP='-';
				t1.setText("");
			}
			else if(str.equals("/")){
				v1=t1.getText();
				OP='/';
				t1.setText("");
			}
			else if(str.equals("*")){
				v1=t1.getText();
				OP='*';
				t1.setText("");
			}
			else if(str.equals("%")){
				v1=t1.getText();
				OP='%';
				t1.setText("");
			}
			if(str.equals("=")){
				v2= t1.getText();
					if (OP == '+')
						result = Integer.parseInt(v1)+Integer.parseInt(v2);
					else if (OP == '-')
						result = Integer.parseInt(v1)-Integer.parseInt(v2);
					else if (OP == '*')
						result = Integer.parseInt(v1)*Integer.parseInt(v2);
					else if (OP == '/')
						result = Integer.parseInt(v1)/Integer.parseInt(v2);
					else if (OP == '%')
						result = Integer.parseInt(v1)%Integer.parseInt(v2);
				t1.setText(""+String.valueOf(result));
			}
			if (str.equals("Clear")) {
				t1.setText("");
			}
			if(str.equals("SQRT")){
				v1=t1.getText();
				result1= Math.sqrt(Integer.parseInt(v1));
				t1.setText(""+result1);
			}
			if(str.equals("Cube")) {
				v1= t1.getText();
				result=Integer.parseInt(v1)*Integer.parseInt(v1)*Integer.parseInt(v1);
				t1.setText(""+result);
			}
			if(str.equals("SQR")){
				v1=t1.getText();
				result=Integer.parseInt(v1)*Integer.parseInt(v1);
				t1.setText(""+result);
			}
	}

}