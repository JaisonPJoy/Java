import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class C4Q2 extends Applet implements MouseListener
{
	String color = "";
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e)
	{
		color = "red";
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.pink);
		g.fillRect(150,150,150,200); //house
		g.setColor(Color.blue);
		g.fillRect(200,275,50,75); //door
		g.setColor(Color.red); 
		int x[] = {150,300,225};
		int y[] = {150,150,25};
		g.fillPolygon(x,y,3); //roof
		if(color.equals("red"))
		{
			g.setColor(c);
			g.fillRect(200,275,50,75); // repainting door on mouse click
		}
	}
}
/*
<applet code = "C4Q2.java" width = "800" height = "800"></applet>
*/