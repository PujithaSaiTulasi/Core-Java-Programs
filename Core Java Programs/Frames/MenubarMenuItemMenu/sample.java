import java.awt.*;
import java.awt.event.*;
public class sample extends Frame implements ActionListener
{
    sample()
	{
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
	    Menu m1 = new Menu("BATSMEN");
		Menu m2 = new Menu("BOWLERS");
		mb.add(m1);
		mb.add(m2);
		MenuItem mi1 = new MenuItem("Sachin");
		MenuItem mi2 = new MenuItem("Sehwag");
		MenuItem mi3 = new MenuItem("Gambhir");
		MenuItem mi4 = new MenuItem("Dhoni");
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		MenuItem mi5 = new MenuItem("Zaheer");
		MenuItem mi6 = new MenuItem("Harbhajan");
		MenuItem mi7 = new MenuItem("Ashwin");
		MenuItem mi8 = new MenuItem("Bhuvneswar");
		m2.add(mi5);
		m2.add(mi6);
		m2.add(mi7);
		m2.add(mi8);
		m1.addActionListener(this);
		m2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String msg = e.getActionCommand();
		System.out.println("MenuItem selected is:"+msg);
	}
	public static void main(String ap[])
	{
		sample f = new sample();
		f.setTitle("***CRICKETERS***");
		f.setSize(400,400);
		f.setVisible(true);
	}
}