import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class sample extends Applet implements ActionListener
{
   String msg,mg;
   int c1,c2,c;
   Label l1,l2;
   TextField f1,f2;
   public void init()
   {
   	Button b1 = new Button("+");
	Button b2 = new Button("-");
	Button b3 = new Button("*");
	Button b4 = new Button("/");
	f1 = new TextField(5);
	f2 = new TextField(5);
	l1 = new Label("Enter a number:");
	l2 = new Label("Enter another number:");
	add(l1);
    add(f1);
	add(l2);
	add(f2);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	f1.addActionListener(this);	
	f2.addActionListener(this);		
	b1.addActionListener(this);	
	b2.addActionListener(this);	
	b3.addActionListener(this);	
	b4.addActionListener(this);	
   }
   public void actionPerformed(ActionEvent e)	
   {
   	msg = e.getActionCommand();
	c1 = Integer.parseInt(f1.getText());
	c2 = Integer.parseInt(f2.getText());
	if(msg=="+") 
	{
	  c = c1+c2;
	  mg = "Addition = "+c;
	}
	if(msg=="-") 
	{
		c = c1-c2;
		mg = "Subtraction = "+c;
	}
	if(msg=="*") 
	{
	    c = c1*c2;
		mg = "Multiplication = "+c;
	}
	if(msg=="/") 
	{
	    c = c1/c2;
		mg = "Divsion = "+c;
	}
	repaint();	
   }
   public void paint(Graphics g)
   {
   	g.drawString(mg,60,80);
   }
}