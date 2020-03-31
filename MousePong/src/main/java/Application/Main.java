package Application;

import GameLogic.Match;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO: Handle args to dispatch chosen functionality.
        
        // Temp output
        // TODO: Get rid of this obviously.
        Match m = new Match();
        
        while (true ) {
            m.tick();
            m.print();
            try {
                Thread.sleep(350);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
