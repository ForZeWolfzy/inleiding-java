import java.awt.*;
import java.applet.*;

public class zespunttwee extends Applet {

    int seconde,uur,dag,jaar;
    int uitkomst1, uitkomst2,uitkomst3;

    public void init() {
        seconde = 60;
        uur = 60;
        dag = 1440;
        jaar = 525600;
        uitkomst1 = seconde * uur;
        uitkomst2 = seconde * dag;
        uitkomst3 = seconde * jaar;
    }

    public void paint(Graphics g) {
        g.drawString("uur: " + uitkomst1,20,20 );
        g.drawString("dag: " + uitkomst2,20,40);
        g.drawString("jaar: " + uitkomst3,20,60);
    }
}