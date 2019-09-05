import java.awt.*;
import java.applet.*;

public class ellips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 100, 200, 90, 360);
    }
}

