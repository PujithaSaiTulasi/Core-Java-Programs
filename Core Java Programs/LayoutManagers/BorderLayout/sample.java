import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class sample extends Applet 
{
  public void init()
  {
   BorderLayout b = new BorderLayout();
   setLayout(b);
   Button b1 = new Button("North");
   Button b2 = new Button("East");
   Button b3 = new Button("West");
   Button b4 = new Button("South");
   Button b5 = new Button("Center");
   add(b1,BorderLayout.NORTH);
   add(b2,BorderLayout.EAST);
   add(b3,BorderLayout.WEST);
   add(b4,BorderLayout.SOUTH);
   add(b5,BorderLayout.CENTER);
  }
}