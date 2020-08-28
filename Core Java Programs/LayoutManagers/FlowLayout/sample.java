import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class sample extends Applet implements ActionListener
{
  String msg;
  public void init()
  {
   FlowLayout f = new FlowLayout(FlowLayout.RIGHT);
   setLayout(f);
   Button b1 = new Button("one");
   Button b2 = new Button("two");
   Button b3 = new Button("three");
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
  if(msg=="one")
  	setBackground(Color.red);
  else if(msg=="two")
  	setBackground(Color.blue);
  else if(msg=="three")
  	setBackground(Color.white);
 }
}