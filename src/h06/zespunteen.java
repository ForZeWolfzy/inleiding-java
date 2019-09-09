import java.awt.*;
        import java.applet.*;


public class zespunteen extends Applet {
    int a;
    int b;
    int uitkomst;




    public void init() {
        a = 113;
        b = 4;
        uitkomst = a/b;

    }

    public void paint(Graphics g) {
        g.drawString("ali: " + uitkomst,20,40);
        g.drawString("jan: " + uitkomst,20,60);
        g.drawString("Jeannette: " + uitkomst, 20,80);
        g.drawString("gino: " + uitkomst,20,100);
    }
}