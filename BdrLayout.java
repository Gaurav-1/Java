import java.awt.*;

public class BdrLayout extends Frame {
	BdrLayout()
	{
		setLayout(new BorderLayout());
		add(new Button("North"), BorderLayout.NORTH);
		add(new Button("South"), BorderLayout.SOUTH);
		add(new Button("East"), BorderLayout.EAST);
		add(new Button("West"), BorderLayout.WEST);
		add(new Button("Center"), BorderLayout.CENTER);
	}
	
	public static void main(String arg[])
	{
		BdrLayout frame=new BdrLayout();
		frame.setTitle("Boder Layout Demo");
		frame.setSize(700,600);
		frame.setVisible(true);
	}

}
