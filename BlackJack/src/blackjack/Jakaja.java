/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Random;

/**
 *
 * @author Huksi
 */
public class Jakaja {
    private int maksimiPaikat;
    private String nimi;
    private Korttipakkakokoelma korttipakat;
    
    public Jakaja(int maksimiPaikat, String nimi){
        this.maksimiPaikat = maksimiPaikat;
        this.nimi = nimi;
        this.korttipakat = new Korttipakkakokoelma("Jakajan kortit");
        
    }
    
    public Kortti arvoKortti(){
        Random arpoja = new Random();
        int luku = arpoja.nextInt(416);
        luku++;
        Kortti arvottuKortti = korttipakat.getKortti(luku);
        return arvottuKortti;
    }
    
}
