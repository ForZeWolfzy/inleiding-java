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

    }
}