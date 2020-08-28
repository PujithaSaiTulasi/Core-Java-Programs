import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class sample extends Applet implements KeyListener
{
 String msg;
 public void init()
 {
  addKeyListener(this);
 }
 public void keyPressed(KeyEvent e)
 {
  showStatus("Key Pressed");
 }
 public void keyReleased(KeyEvent e)
 {
  showStatus("Key Released");  
 }
 public void keyTyped(KeyEvent e)
 {
  msg+=e.getKeyChar();
  repaint(); 
 }
 public void paint(Graphics g)
 {
  g.drawString("Entered characters are:"+msg,10,20);
 } 
}