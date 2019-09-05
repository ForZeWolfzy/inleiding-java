import java.awt.*;
import java.applet.*;

public class stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRoundRect(20, 20, 50, 100, 90, 360);
        g.fillArc(32,32,25,25,10,10);
    }
}