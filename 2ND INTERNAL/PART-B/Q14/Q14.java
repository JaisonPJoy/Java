import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Q14 extends Applet implements ActionListener
{
    String str = "";
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;

    public void init()
    {
        l1 = new Label("First Number: ");
        //l1.setBounds(150,50,100,30);
        add(l1);
        t1 = new TextField(15);
       //t1.setBounds(300,50,100,30);
        add(t1);
        l2 = new Label("Second Number: ");
        add(l2);
        t2 = new TextField(15);
        add(t2);
        l3 = new Label("Result: ");
        add(l3);
        t3 = new TextField(15);
        add(t3);
        // buttons
        b1 = new Button("ADD");
        b1.setBounds(150,50,50,50);
        add(b1);
        b2 = new Button("SUB");
        b2.setBounds(210,50,50,50);
        add(b2);
        b3 = new Button("MUL");
        b3.setBounds(270,50,50,50);
        add(b3);
        b4 = new Button("DIV");
        b4.setBounds(330,50,50,50);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setLayout(null);
        setSize(1100,1100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());
        if(e.getSource() == b1)
        {
            int sum;
            sum = x + y;
            t3.setText(" "+ sum );
        }
        if(e.getSource() == b2)
        {
            int dif;
            dif = x - y;
            t3.setText(" "+ dif );
        }
        if(e.getSource() == b3)
        {
            int pro;
            pro = x * y;
            t3.setText(" "+ pro );
        }
        if(e.getSource() == b4)
        {
            int rem;
            rem = x / y;
            t3.setText(" "+ rem );
        }
        repaint();
    }
}
/*
<applet code = "Q14.java" width = "1000" height = "1000">
</applet>
 */