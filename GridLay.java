import java.awt.*;
import java.applet.*;

//<applet code="GridLay" height=400 width=400></applet>
public class GridLay extends Applet{
	public void init(){
	setLayout(new GridLayout(4,3));
	Button butn[]=new Button[10];
	for(int i=1;i<butn.length;i++)
	{
		butn[i]=new Button("Button"+i);
		add(butn[i]);
	}
	}
	public void paint() {
		
	}

}