import java.applet.*;
import java.awt.*;

//<Applet code="Apptry" height=600 width=600></Applet>

public class Apptry extends Applet{
int i=0;
public void init(){
i++;
System.out.println("init");
}

public void start(){
i++;
System.out.println("start");
}

public void stop(){
i++;
System.out.println("stop");
}

public void paint(Graphics g){
i++;
String s=String.valueOf(i);
g.drawString(s,250,250);
}

public void destroy(){
i++;
System.out.println("destroy");
}
}
