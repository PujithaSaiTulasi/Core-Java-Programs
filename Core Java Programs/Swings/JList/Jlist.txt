import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class sample extends JFrame implements ListSelectionListener
{
        Container c;
        JList jl;
        JScrollPane jsp;
        JLabel l1;
        String msg;
	sample()
	{
             c=getContentPane();
             FlowLayout f=new FlowLayout();
             c.setLayout(f);
             String a[]={"c","c++","Java","Python","Perl","JS","JSP"};
             jl= new JList(a);
             jl.setVisibleRowCount(4);
             jsp=new JScrollPane(jl);
             l1=new JLabel();
             c.add(jsp);
             c.add(l1);
	     jl.addListSelectionListener(this);
	}
	public void valueChanged(ListSelectionEvent e)
	{
		msg="the selected item is:"+jl.getSelectedValue();
                l1.setText(msg);
	}
	public static void main(String ap[])
	{
		sample s = new sample();
		s.setSize(400,400);
		s.setVisible(true);
	}
}