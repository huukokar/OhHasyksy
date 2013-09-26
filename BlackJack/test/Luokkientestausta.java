/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Huksi
 */
public class Luokkientestausta {
    import blackjack.BlackJack;
    import blackjack.Kortti;
    import blackjack.Korttipakka;
    import blackjack.Korttipakkakokoelma;
    
    public Luokkientestausta() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void kortinTestausta() {
         Korttipakkakokoelma testikokoelma = new Korttipakkakokoelma("Testaan vain");
         Korttipakka testipakka = new Korttipakka(testikokoelma, "tuPakka");
         Kortti testikortti = new Kortti(testipakka, 1, 5);
         assertEquals("Kortti on patavitonen, ja sen omistaja on tuPakka", testikortti.toString());
                 
     }
}
