import java.awt.*;
import java.applet.*;
//<applet code="BdrLayout" height=400 width=400></applet>
public class BdrLayout extends Applet {
	public void init()
	{
		setLayout(new BorderLayout());
		add(new Button("North"), BorderLayout.NORTH);
		add(new Button("South"), BorderLayout.SOUTH);
		add(new Button("East"), BorderLayout.EAST);
		add(new Button("West"), BorderLayout.WEST);
		add(new TextArea("Center"), BorderLayout.CENTER);
	}
	
	public void paint(Graphics g)
	{
	}

}
