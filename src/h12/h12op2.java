package h012;

import java.applet.Applet;
import java.awt.*;

public class h12op2 extends Applet {
    Button knoppen[];


    public void init() {
        knoppen = new Button[25];
        for (int teller = 0; teller < knoppen.length; teller++) {

            knoppen[teller] = new Button("" + teller);
            add(knoppen[teller]);


        }


    }
}