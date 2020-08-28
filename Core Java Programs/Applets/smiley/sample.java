import java.applet.*;
import java.awt.*;
public class sample extends Applet{
 public void init(){
 setBackground(Color.yellow);
 }
 public void paint(Graphics g){
 int a[]={150,160,170};
 int b[]={250,140,250};
 g.setColor(Color.blue);
 g.fillOval(10,20,300,400);
 g.setColor(Color.cyan);
 g.fillOval(70,80,70,70);
 g.setColor(Color.cyan);
 g.fillOval(200,80,70,70); 
 g.setColor(Color.green);
 g.fillPolygon(a,b,3);
 g.setColor(Color.red);
 g.fillRect(110,300,100,50);
 }
}