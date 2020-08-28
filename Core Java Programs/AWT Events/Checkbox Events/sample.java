import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class sample extends Applet implements ItemListener
{
 String msg;
 Checkbox c1,c2,c3;
 public void init()
 {
   c1 = new Checkbox("ONE",true);
   c2 = new Checkbox("TWO",false);
   c3 = new Checkbox("THREE",false);
   add(c1);
   add(c2);
   add(c3);
   c1.addItemListener(this);
   c2.addItemListener(this);
   c3.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent e)
 {
  if(c1.getState())
  {
   msg = "Checkbox ONE is selected";
   setBackground(Color.red);
   repaint();
  }
  if(c2.getState())
  {
   msg = "Checkbox ONE is selected";
   setBackground(Color.blue);
   repaint();
  }
  if(c3.getState())
  {
   msg = "Checkbox ONE is selected";
   setBackground(Color.yellow);
   repaint();
  }
 }
 public void paint(Graphics g)
 {
  g.drawString(msg,50,50);
 }
}
  
