import java.applet.*;
import java.awt.*;

public class PbaPunto extends Applet {
   Punto p1,p2;
   public void init ( ) {
      p1 = new Punto ( );
      p2 = new Punto (10,10);
   }
   public void paint (Graphics g){
      p1. dibuja (g);
      p2. dibuja (g);
   }
}

