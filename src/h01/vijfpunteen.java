import java.awt.*;
import java.applet.*;

public class vijfpunteen extends Applet {

        Color opvulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte;

        public void init() {
            //initialisatie.
            opvulkleur = Color.MAGENTA;
            lijnkleur = Color.BLACK;
            breedte = 200;
            hoogte = 100;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(lijnkleur);
        g.drawLine(10,20,260,20);
        g.drawString("Lijn",125,40);
        g.setColor(lijnkleur);
        g.drawRect(10,50,breedte, hoogte);
        g.drawString("rechthoek",105,200);
        g.setColor(opvulkleur);
        g.fillRect(300,50,breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawArc(300,50,breedte, hoogte,90,360);
        g.drawString("gevulde rechthoek met ovaal",350,200);
        g.drawOval(590,50,breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(590,50,breedte, hoogte,360,45);
        g.setColor(lijnkleur);
        g.drawString("taartpunt met ovaal",670,200);
        g.drawRoundRect(10,210,breedte, hoogte,10,10);
        g.drawString("afgeronde rechthoek",70,360);
        g.setColor(opvulkleur);
        g.fillOval(300,210,breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("gevuld ovaal",400,360);
        g.drawOval(675,230,breedte, hoogte);
        g.drawString("cirkel",710,350);

    }
}