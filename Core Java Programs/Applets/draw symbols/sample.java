import java.applet.*;
import java.awt.*;
public class sample extends Applet{
 public void init(){
 }
 public void paint(Graphics g){
 g.setColor(Color.red);
 g.drawLine(10,20,30,40);
 g.setColor(Color.blue);
 g.drawOval(50,50,100,100);
 g.setColor(Color.yellow);
 g.drawRect(60,60,400,400);
 }
}