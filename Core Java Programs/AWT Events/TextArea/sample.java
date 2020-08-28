import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class sample extends Applet 
{
 String msg = "HELLO EVREYONE";
 public void init()
 {
  TextArea ta = new TextArea(msg,10,20);
   add(ta);
 } 
}