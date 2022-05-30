import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class app2 extends Applet implements ActionListener
{
	Button b;
	TextField tf,tf1;
	Label j,j1,j2;
	public void init()
	{
		j=new Label("enter your name");
		j.setBounds(10,40,120,20);
		tf=new TextField(" ");
		tf.setBounds(130,40,150,20);
		j1=new Label("enter yob");
		j1.setBounds(10,80,120,20);
		tf1=new TextField(" ");
		tf1.setBounds(130,80,150,20);
		b=new Button("calculate");
		b.setBounds(110,120,70,30); 
		j2=new Label("");
		j2.setBounds(45,170,200,20);
		add(j);
		add(j1);
		add(tf);
		add(tf1);
		add(b);
		add(j2);
		b.addActionListener(this);
		setLayout(null);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s,s1;
		int a,b;
		s=tf.getText();
		s1=tf1.getText();
		a=Integer.parseInt(s1);
		b=2019-a;
		j2.setText("welcome"+s+"your age is"+b);
	}
}
