import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class C3Q5 extends Applet implements MouseListener, MouseMotionListener
{
    String msg = "";
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        msg = "MOUSE CLICKED";
        repaint();
    }
    public void mouseEntered(MouseEvent e)
    {
        msg = "MOUSE ENTERED";
        repaint();
    }
    public void mouseExited(MouseEvent e)
    {
        msg = "MOUSE EXITED";
        repaint();
    }
    public void mousePressed(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        showStatus("MOUSE PRESSED AT COORDINATES (" + x + "," + y + ")");
        repaint();
    }
    public void mouseReleased(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        showStatus("MOUSE RELEASED AT COORDINATES (" + x + "," + y + ")");
        repaint();
    }
    public void mouseMoved(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        showStatus("CURRENTY MOUSE IS AT COORDINATES (" + x + "," + y + ")");
        repaint();
    }
    public void mouseDragged(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        showStatus("MOUSE DRAGGED AT COORDINATES (" + x + "," + y + ")");
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,100,100);
    }
}
/*
<applet code = "C3Q5.java" height ="400" width = "400"></applet>
 */