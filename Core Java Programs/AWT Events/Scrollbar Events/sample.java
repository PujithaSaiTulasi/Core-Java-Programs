import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class sample extends Applet implements AdjustmentListener
{
	int a;
	Scrollbar b1,b2;
	public void init()
	{
		b1 = new Scrollbar(Scrollbar.HORIZONTAL);
		b2 = new Scrollbar(Scrollbar.VERTICAL);
		add(b1);
		add(b2);
		b1.addAdjustmentListener(this);
		b2.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		a = b1.getValue();
		g.drawString("X-axis Value is "+a,70,170);
		a = b2.getValue();
		g.drawString("Y-axis value is "+a,70,30);
	}
}