/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Huksi
 */

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class KayttoLiittyma implements Runnable {

    private JFrame frame;

    public Kayttoliittyma() {
            
    }

    @Override
    public void run() {
        frame = new JFrame("Otsikko");
        frame.setPreferredSize(new Dimension(200, 100));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
    }

    public JFrame getFrame() {
        return frame;
    }
}
    
