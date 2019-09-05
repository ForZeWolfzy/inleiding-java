import java.awt.*;
import java.applet.*;

public class javadraw extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.green);
        g.drawLine(40,160,140,160);
        g.drawLine(40,160,90,40);
        g.drawLine(90,40,140,160);

    }
}