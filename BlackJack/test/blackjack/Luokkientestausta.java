package blackjack;

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
//    import blackjack.BlackJack;
//    import blackjack.Kortti;
//    import blackjack.Korttipakka;
//    import blackjack.Korttipakkakokoelma;
    
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
         assertEquals("Kortti on Herttavitonen, ja sen omistaja on tuPakka", testikortti.toString());
         Kortti toinenKortti = new Kortti(testipakka, 3, 12);
         assertEquals("Kortti on Patakuningatar, ja sen omistaja on tuPakka", toinenKortti.toString());
         Kortti kolmasKortti = new Kortti(testipakka, 2, 1);
         assertEquals("Kortti on Ristiässä, ja sen omistaja on tuPakka", kolmasKortti.toString());
         
         Kortti herttakuningas = testikokoelma.getKortti(26);
         assertEquals("Kortti on Herttakuningas, ja sen omistaja on Eka Korttipakka", herttakuningas.toString());
         Kortti patakuningas = testikokoelma.getKortti(416);
         assertEquals("Kortti on Patakuningas, ja sen omistaja on Kahdeksas Korttipakka", patakuningas.toString());
         Kortti herttaassa = testikokoelma.getKortti(53);
         assertEquals("Kortti on Herttaassa, ja sen omistaja on Toka Korttipakka", herttaassa.toString0
                 
     }
}
