import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class app1 extends Applet implements ActionListener
{
		Button b;
		TextField tf;
		Label j1,j2;
		public void init()
		{
		j1=new Label("enter a no");
		j1.setBounds(10,10,100,20);
		tf=new TextField("");
		tf.setBounds(120,10,50,20);
		b=new Button("check");
		b.setBounds(30,40,40,20);
		j2=new Label("");
		j2.setBounds(10,70,150,20);
		add(j1);
		add(tf);
		add(b);
		add(j2);
		b.addActionListener(this);
		setLayout(null);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s;
		int a,b,c,i,j;
		s=tf.getText();	
		j=Integer.parseInt(s);
		a=0;
		b=1;
		c=0;
		for(i=1;i<j;i++)
		{
			c=a+b;
			a=b;
			b=c;
			i=b;
		}
		if(c==j)
		j2.setText("fibo no");
		else
		j2.setText("not fibo no");
	}
}

