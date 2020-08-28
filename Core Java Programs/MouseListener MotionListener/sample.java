import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class sample extends Applet implements MouseListener,MouseMotionListener
{
 String msg;
 int x,y;
 public void init()
 {
  addMouseListener(this);
  addMouseMotionListener(this);
 }
 public void mouseClicked(MouseEvent e)
 {
  msg = "Mouse Clicked:";
  x = e.getX();
  y = e.getY();
  repaint();
 }
 public void mouseEntered(MouseEvent e)
 {
  msg = "Mouse Entered";
  x = e.getX();
  y = e.getY();
  repaint();
 }
 public void mouseExited(MouseEvent e)
 {
  msg = "Mouse Exited";
  x = e.getX();
  y = e.getY();
  repaint();
 }
 public void mousePressed(MouseEvent e)
 {
  msg = "Mouse Pressed";
  x = e.getX();
  y = e.getY();
  repaint();
 }
 public void mouseReleased(MouseEvent e)
 {
  msg = "Mouse Released";
  x = e.getX();
  y = e.getY();
  repaint();
 }
 public void mouseDragged(MouseEvent e)
 {
  msg = "Mouse Dragged";
  x = e.getX();
  y = e.getY();
  showStatus("Mouse Dragged Positions:"+x+" "+y);
  repaint();
 }
 public void mouseMoved(MouseEvent e)
 {
  msg = "Mouse Moved";
  x = e.getX();
  y = e.getY();
  showStatus("Mouse Moved Positions:"+x+" "+y);
  repaint();
 }
 public void paint(Graphics g)
 {
  g.drawString(msg,x,y);
 } 
}