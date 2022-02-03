import java.applet.*;
import java.awt.*;

//<Applet code="AppLife" height=300 width=300></Applet>

public class AppLife extends Applet{
int i=0;
public void init(){
i++;
System.out.println("init function");
System.out.println("value of i="+i);
}

public void start(){
i++;
System.out.println("start function");
System.out.println("value of i="+i);
}

public void stop(){
i++;
System.out.println("stop function");
System.out.println("value of i="+i);
}

public void paint(Graphics g){
i++;
String s=String.valueOf(i);
g.drawString("paint function",150,150);
g.drawString("value of i="+s,150,160);
}

public void destroy(){
i++;
System.out.println("destroy function");
System.out.println("value of i="+i);
}
}
