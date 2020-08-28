import java.awt.*;
import java.awt.event.*;
public class sample extends Frame implements ActionListener
{
    sample()
	{
		FlowLayout f = new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		Button b1 = new Button("Login");
		Button b2 = new Button("Logout");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String msg = e.getActionCommand();
		System.out.println("Button pressed is:"+msg);
	}
	public static void main(String ap[])
	{
		sample f = new sample();
		f.setTitle("***My first Frame***");
		f.setSize(500,500);
		f.setVisible(true);
	}
}