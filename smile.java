import java.applet.Applet;
import java.awt.*;

//<Applet code="smile" height=800 width=800></Applet>

public class smile extends Applet {
	
	public void paint(Graphics g)
	{
		//face
		g.drawOval(70, 50, 250, 250);
		//left eye
		g.drawOval(130, 100, 25, 30);
		g.fillOval(133, 110, 20, 20);
		//right eye
		g.drawOval(222, 100, 25, 30);
		g.fillOval(225, 110, 20, 20);
		//smile
		g.drawArc(140, 180, 110, 60, 180, 180);
		//left ear
		g.drawArc(50, 130, 50, 50, 85, 175);
		//right ear
		g.drawArc(290, 130, 50, 50, 281, 177);
		//hairs
		g.drawLine(190, 51, 170, 25);
		g.drawLine(190, 51, 190, 25);
		g.drawLine(190, 51, 210, 25);
	}
}
