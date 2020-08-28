import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class sample extends Applet implements ItemListener
{
	String msg;
	Choice c1,c2;
	public void init()
	{
		c1 = new Choice();
	    c1.add("car");
		c1.add("car1");
		c1.add("car2");
		c1.add("car3");
		c2 = new Choice();
		c2.add("benz");
		c2.add("benz1");
		c2.add("benz2");
		c2.add("benz3");
		add(c1);
		add(c2);
		c1.addItemListener(this);
		c2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg = c1.getSelectedItem();
		g.drawString("Selected item in choice 1 is "+msg,70,150);
		msg = c2.getSelectedItem();
		g.drawString("Selected item in choice 2 is "+msg,70,100);
	}
}