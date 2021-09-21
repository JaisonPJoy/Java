import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class C4Q3 extends Applet implements ActionListener
{
	JButton bcolor;
	String color;
	public void init()
	{
		bcolor = new JButton("Red");
		bcolor.setBounds(400,400,100,50);
		add(bcolor);
		bcolor.addActionListener(this);
		setLayout(null);
	}
	public void actionPerformed(ActionEvent a)
	{
		color = a.getActionCommand();
		repaint();
	}
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

		if(color.equals("Red"))
		{
			g.setColor(Color.pink);
			g.fillRect(150,150,150,200); //house
			g.setColor(Color.red);
			g.fillRect(200,275,50,75); //door
			g.setColor(Color.red); 
			g.fillPolygon(x,y,3); //roof
		}
	}
}
/*
<applet code = "C4Q3.java" width = "800" height = "800"></applet>
*/