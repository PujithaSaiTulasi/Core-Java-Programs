import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class sample extends Applet
{
  static final int n = 4;
  public void init()
  {
   GridLayout g = new GridLayout(n,n);
   setLayout(g);
   for(int i=0;i<n;i++)
   {
   	for(int j=0;j<n;j++)
	{
		int k = n*i + j;
		Button b = new Button(""+k);
		add(b);
	}
   }
 }
}