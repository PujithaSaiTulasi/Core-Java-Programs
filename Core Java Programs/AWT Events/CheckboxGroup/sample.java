import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class sample extends Applet implements ItemListener
{
 String msg;
 Checkbox c1,c2;
 CheckboxGroup cbg = new CheckboxGroup();
 public void init()
 {
  c1 = new Checkbox("one",cbg,true);
  c2 = new Checkbox("two",cbg,false);
  add(c1);
  add(c2);
  c1.addItemListener(this);
  c2.addItemListener(this);
 }
 public void itemStateChanged(ItemEvent e)
 {
  if(c1.getState())
  {
   msg = "Checkbox 1 is selected";
   setBackground(Color.red);
   repaint();
  }
  if(c2.getState())
  {
   msg = "Checkbox 2 is selected";
   setBackground(Color.blue);
   repaint();
  }
 }
 public void paint(Graphics g)
 {
  g.drawString(msg,40,40);
 }
}
