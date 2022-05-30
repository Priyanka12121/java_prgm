import java.applet.*;
import java.awt.*;
class graph extends Applet
{
	public void main(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawOval(200,150,100,80);
		g.fillOval(200,150,100,80);
		g.setColor(Color.white);
		g.drawOval(150,100,50,30);
		g.fillOval(150,100,50,30);
		g.drawRect(20,20,10,10);
		g.fillRect(20,20,10,10);
	}
}

			
		