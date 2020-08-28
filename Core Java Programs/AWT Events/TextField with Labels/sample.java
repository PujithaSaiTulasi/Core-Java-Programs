import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class sample extends Applet implements ActionListener
{
 String msg;
 TextField tf1,tf2;
 public void init()
 {
  tf1 = new TextField(10);
  tf2 = new TextField(10);
  tf2.setEchoChar('*');
  Label l1 = new Label("Enter User ID:");
  Label l2 = new Label("Enter Password:");
  add(l1);
  add(tf1);
  add(l2);
  add(tf2);
  tf1.addActionListener(this);
  tf2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
  repaint();
 }
 public void paint(Graphics g)
 {
  msg = tf1.getText();
  g.drawString("Entered User ID is:"+msg,60,60);
  msg = tf2.getText();
  g.drawString("Entered Password is:"+msg,60,90);
 } 
}