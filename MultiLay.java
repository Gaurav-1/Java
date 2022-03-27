import java.awt.*;
import java.applet.*;
//<applet code="MultiLay" height=400 width=400></applet>
public class MultiLay extends Applet {
    Panel p1,p2,p3;

	public void init()
	{
        setLayout(new GridLayout(2,1));
            add(new Button("GridLayout Button"));
        
        p2=new Panel();
            p2.setLayout(new FlowLayout());
                add(new Button("FlowLayout Button"));
        
        p1= new Panel();
            p1.setLayout(new BorderLayout());
                add(p1);
                p1.add(new Button("BorderLayout Button"), BorderLayout.SOUTH);

	}
}