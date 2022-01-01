import java.applet.Applet;
import java.awt.*;

//<Applet code="boat" height=800 width=800></Applet>

public class boat extends Applet {

	public void paint(Graphics g)
	{
		//boat
		g.drawLine(100, 200, 400, 200);
		g.drawLine(200, 300, 300, 300);
		g.drawLine(100, 200, 200, 300);
		g.drawLine(400, 200, 300, 300);
		//faces
		g.drawOval(160, 100, 50, 50);
		g.drawOval(270, 100, 50, 50);
		//body of person1
		g.drawArc(180, 140, 50, 120, 0, 94);
		g.drawArc(140, 140, 50, 120, 90, 90);
		//body of person2
		g.drawArc(290, 140, 50, 120, 0, 94);
		g.drawArc(250, 140, 50, 120, 90, 90);
	}
}
