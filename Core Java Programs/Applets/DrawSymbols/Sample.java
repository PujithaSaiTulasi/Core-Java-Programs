import java.applet.*;
import java.awt.*;
public class Sample extends Applet
{
   public void init()
  {
    setBackground(Color.yellow);
  }
  public void paint(Graphics g)
  {
    g.setColor(Color.red);
    g.drawLine(10,20,40,60);
    g.setColor(Color.green);
    g.drawRect(70,80,90,100);
    g.setColor(Color.blue);
    g.drawOval(70,80,90,100);
  }
} 
  
 