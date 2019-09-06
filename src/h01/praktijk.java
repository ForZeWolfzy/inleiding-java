import java.awt.*;
import java.applet.*;

public class praktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(10,20,260,20);
        g.drawString("Lijn",125,40);
        g.drawRect(10,50,260,130);
        g.drawString("rechthoek",105,200);
        g.setColor(Color.magenta);
        g.fillRect(300,50,260,130);
        g.setColor(Color.black);
        g.drawArc(300,50,260,130,90,360);
        g.drawString("gevulde rechthoek met ovaal",350,200);
        g.drawOval(590,50,260,130);
        g.setColor(Color.magenta);
        g.fillArc(590,50,260,130,360,45);
        g.setColor(Color.black);
        g.drawString("taartpunt met ovaal",670,200);
        g.drawRoundRect(10,210,260,130,10,10);
        g.drawString("afgeronde rechthoek",70,360);
        g.setColor(Color.magenta);
        g.fillOval(300,210,260,130);
        g.setColor(Color.black);
        g.drawString("gevuld ovaal",400,360);
        g.drawOval(675,230,100,100);
        g.drawString("cirkel",710,350);

    }
}