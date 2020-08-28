import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class sample extends Applet implements ActionListener
{
 String msg,mg;
 public void init()
 {
  Button b1 = new Button("ONE");
  Button b2 = new Button("TWO");
  Button b3 = new Button("THREE");
  add(b1);
  add(b2);
  add(b3);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
  msg = e.getActionCommand();
  if(msg=="ONE")
  {
   mg = "Button ONE is Pressed";
   setBackground(Color.red);
   repaint();
  }
  else if(msg=="TWO")
  {
   mg = "Button TWO is Pressed";
   setBackground(Color.blue);
   repaint();
  }
  else if(msg=="THREE")
  {
   mg = "Button THREE is Pressed";
   setBackground(Color.yellow);
   repaint();
  }
 }
 public void paint(Graphics g)
 {
  g.drawString(mg,50,50);
 }
}
  
