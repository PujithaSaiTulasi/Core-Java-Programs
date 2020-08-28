import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class sample extends JFrame implements ActionListener
{
        Container c;
        JComboBox jcb;
        JLabel l1;
        String msg;
	sample()
	{
             c=getContentPane();
             FlowLayout f=new FlowLayout();
             c.setLayout(f);
             String a[]={"c","c++","Java","Python","Perl","JS","JSP"};
             jcb= new JComboBox(a);
             l1=new JLabel();
             c.add(jcb);
             c.add(l1);
	     jcb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		msg="the selected item is:"+jcb.getItemAt(jcb.getSelectedIndex());
                l1.setText(msg);
	}
	public static void main(String ap[])
	{
		sample s = new sample();
		s.setSize(400,400);
		s.setVisible(true);
	}
}