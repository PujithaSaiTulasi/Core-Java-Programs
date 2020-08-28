import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class sample extends JFrame implements ActionListener
{
    Container c;
    JLabel l1,l2;
    sample()
	{
                c=getContentPane();
                FlowLayout f=new FlowLayout();
                c.setLayout(f); 
		JMenuBar mb = new JMenuBar();
                setJMenuBar(mb);
		JMenu m1 = new JMenu("BATSMEN");
		JMenu m2 = new JMenu("BOWLERS");
		mb.add(m1);
		mb.add(m2);
		JMenuItem mi1 = new JMenuItem("Sachin");
		JMenuItem mi2 = new JMenuItem("Sehwag");
		JMenuItem mi3 = new JMenuItem("Gambhir");
		JMenuItem mi4 = new JMenuItem("Dhoni");
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		JMenuItem mi5 = new JMenuItem("Zaheer");
		JMenuItem mi6 = new JMenuItem("Harbhajan");
		JMenuItem mi7 = new JMenuItem("Ashwin");
		JMenuItem mi8 = new JMenuItem("Bhuvneswar");
		m2.add(mi5);
		m2.add(mi6);
		m2.add(mi7);
		m2.add(mi8);
		m1.addActionListener(this);
		m2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String msg ="The selected menu item is:"+ e.getActionCommand();
		l1.setText(msg);
	}
	public static void main(String ap[])
	{
		sample s = new sample();
		s.setTitle("***CRICKETERS***");
		s.setSize(400,400);
		s.setVisible(true);
	}
}