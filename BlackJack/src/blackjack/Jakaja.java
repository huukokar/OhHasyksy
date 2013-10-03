/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Huksi
 */
public class Jakaja {
    private int maksimiPaikat;
    private String nimi;
    private Korttipakkakokoelma korttipakat;
    private HashMap<Integer, Paikka> paikat;
    private ArrayList<Integer> kaytetytKortit;
    
    public Jakaja(int maksimiPaikat, String nimi){
        this.maksimiPaikat = maksimiPaikat;
        this.nimi = nimi;
        this.korttipakat = new Korttipakkakokoelma("Jakajan kortit");
        
    }
    
    public void luoPaikat(){
         
        Paikka ekaPaikka = new Paikka(0);
        this.paikat.put(1, ekaPaikka);
        Paikka tokaPaikka = new Paikka(0);
        this.paikat.put(2, tokaPaikka);
        Paikka kolmasPaikka = new Paikka(0);
        this.paikat.put(3, kolmasPaikka);
        Paikka neljasPaikka = new Paikka(0);
        this.paikat.put(4, neljasPaikka);
        Paikka viidesPaikka = new Paikka(0);
        this.paikat.put(5, viidesPaikka);
        Paikka kuudesPaikka = new Paikka(0);
        this.paikat.put(6, kuudesPaikka);
    }
    
    
    public Kortti arvoKortti(){
        Random arpoja = new Random();
        int luku = arpoja.nextInt(416);
        luku++;
        this.kaytetytKortit.add(luku);
        Kortti arvottuKortti = korttipakat.getKortti(luku);
        return arvottuKortti;
    }
    
    public void jaaEnsimmaisetKortit(){
        //jakaa ensimmäiset 2 korttia jokaiselle paikalle, missä on pelaaja
        int i = 0;
        while(i <= 6){
                if (this.paikat.get(i).getPelaaja() == null) {
                    
                } else {
            Kortti ekaKortti = arvoKortti();
            this.paikat.get(i).nostaKortti(ekaKortti);
            Kortti tokaKortti = arvoKortti();
            this.paikat.get(i).nostaKortti(tokaKortti);
                }
            
        }
    }
    
}
