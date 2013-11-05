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
public class KorttiTest {
//    import blackjack.BlackJack;
//    import blackjack.Kortti;
//    import blackjack.Korttipakka;
//    import blackjack.Korttipakkakokoelma;
    
    // tällä testaankin vain Kortti-luokkaa, nimi jäänyt a
    
    public KorttiTest() {
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
         assertEquals("Kortti on Herttaässä, ja sen omistaja on Toka Korttipakka", herttaassa.toString());
         Kortti ristiseiska = testikokoelma.getKortti(33);
         assertEquals("Kortti on Ristiseiska, ja sen omistaja on Eka Korttipakka", ristiseiska.toString());
                 
     }
     
     public void korttiPalauttaaOikeatArvot(){
         Korttipakkakokoelma testikokoelma = new Korttipakkakokoelma("Testikokoelma");
         Korttipakka testipakka = new Korttipakka(testikokoelma, "Testipakka 1");
         Kortti herttakutonen = new Kortti(testipakka, 1, 6);
         assertEquals("Kortti on Herttakutonen, ja sen omistaja on Testipakka 1", herttakutonen.toString());
         assertEquals(1, herttakutonen.getMaa());
         assertEquals(6, herttakutonen.getArvo());
         
         Kortti ristikolmonen = new Kortti(testipakka, 2, 3);
         assertEquals("Kortti on Ristikolmonen, ja sen omistaja on Testipakka 1", ristikolmonen.toString());
         assertEquals(2, ristikolmonen.getMaa());
         assertEquals(3, ristikolmonen.getArvo());
         
         Kortti pataassa = new Kortti(testipakka, 3, 1);
         assertEquals("Kortti on Pataässä, ja sen omistaja on Testipakka 1", pataassa.toString());
         assertEquals(2, pataassa.getMaa());
         assertEquals(1, pataassa.getArvo());
         
         Kortti ruutukymppi = new Kortti(testipakka, 0, 10);
         assertEquals("Kortti on Ruutukymppi, ja sen omistaja on Testipakka 1", ruutukymppi.toString());
         assertEquals(0, ruutukymppi.getMaa());
         assertEquals(10, ruutukymppi.getArvo());
     }
}
