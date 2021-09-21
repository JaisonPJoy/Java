import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//import javax.swing.*;
public class C4Q3tst extends Applet implements MouseListener
{
	//JButton bcolor;
	String color = "";
	String msg = "";
	public void init()
	{
		/*bcolor = new JButton("Red");
		bcolor.setBounds(400,400,100,50);
		add(bcolor);
		bcolor.addActionListener(this);
		setLayout(null);*/
		addMouseListener(this);

	}
    public void mouseClicked(MouseEvent e)
    {
        color = "red";
        msg = "MOUSE CLICKED";
        repaint();
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}

	public void paint(Graphics g)
	{

		int x[] = {150,300,225};
		int y[] = {150,150,25};

		g.setColor(Color.pink);
		g.fillRect(150,150,150,200); //house
		g.setColor(Color.blue);
		g.fillRect(200,275,50,75); //door
		g.setColor(Color.red); 
		g.fillPolygon(x,y,3); //roof

		if(color.equals("red")) //REPAINTING THE HOUSE ON MOUSE CLICK
		{
			g.setColor(Color.pink);
			g.fillRect(150,150,150,200); //house
			g.setColor(Color.red);
			g.fillRect(200,275,50,75); //door
			g.setColor(Color.red); 
			g.fillPolygon(x,y,3); //roof
			g.drawString(msg,400,400);
		}
	}
}
/*
<applet code = "C4Q3tst.java" width = "800" height = "800"></applet>
*/
