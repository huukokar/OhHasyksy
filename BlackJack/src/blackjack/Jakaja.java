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
    // private int maksimiPaikat;
    private String nimi;
    private final Korttipakkakokoelma korttipakat;
    private final HashMap<Integer, Paikka> paikat;
    private ArrayList<Integer> kaytetytKortit;
    private final Paikka jakajanPaikka;
    private final HashMap<Integer, Pelaaja> pelaajat;
    // Jakajan toinen kortti on piilotettu, ensimmmäisessä paikassa oleva näkyy
    
    public Jakaja(String nimi){
       // this.maksimiPaikat = maksimiPaikat;
        this.nimi = nimi;
        this.korttipakat = new Korttipakkakokoelma("Jakajan kortit");
        this.paikat = new HashMap<Integer, Paikka>();
        luoPaikat();
        this.jakajanPaikka = new Paikka(0);
        this.pelaajat = new HashMap<Integer, Pelaaja>();
        
        
    }
    
    public final void luoPelaaja(String nimi){
        
        if (this.pelaajat.isEmpty()){
            Pelaaja pelaaja =  new Pelaaja(2500, nimi);
            this.pelaajat.put(1, pelaaja);
            } 
        }
    
    public final void luoPelaajat(String ekaNimi, String tokaNimi){
        
        if (this.pelaajat.isEmpty()){
            Pelaaja ekaPelaaja = new Pelaaja(2500, ekaNimi);
            this.pelaajat.put(1, ekaPelaaja);
            Pelaaja tokaPelaaja = new Pelaaja(2500, tokaNimi);
            this.pelaajat.put(2, tokaPelaaja);
        }
    }
    
    public final void luoPelaajat(String ekaNimi, String tokaNimi, String kolmasNimi){
        
        if (this.pelaajat.isEmpty()){
            Pelaaja ekaPelaaja = new Pelaaja(2500, ekaNimi);
            this.pelaajat.put(1, ekaPelaaja);
            Pelaaja tokaPelaaja = new Pelaaja(2500, tokaNimi);
            this.pelaajat.put(2, tokaPelaaja);
            Pelaaja kolmasPelaaja = new Pelaaja(2500, kolmasNimi);
            this.pelaajat.put(3, kolmasPelaaja);
        }
    }
    
    public final void luoPelaajat(String ekaNimi, String tokaNimi, String kolmasNimi, String neljasNimi){
        
        if (this.pelaajat.isEmpty()){
        Pelaaja ekaPelaaja = new Pelaaja(2500, ekaNimi);
        this.pelaajat.put(1, ekaPelaaja);
        Pelaaja tokaPelaaja = new Pelaaja(2500, tokaNimi);
        this.pelaajat.put(2, tokaPelaaja);
        Pelaaja kolmasPelaaja = new Pelaaja(2500, kolmasNimi);
        this.pelaajat.put(3, kolmasPelaaja);
        Pelaaja neljasPelaaja = new Pelaaja(2500, neljasNimi);
        this.pelaajat.put(4, neljasPelaaja);
        }
    }
    
    
    
    public final void luoPaikat(){
         
        Paikka ekaPaikka = new Paikka(1);
        this.paikat.put(1, ekaPaikka);
        Paikka tokaPaikka = new Paikka(2);
        this.paikat.put(2, tokaPaikka);
        Paikka kolmasPaikka = new Paikka(3);
        this.paikat.put(3, kolmasPaikka);
        Paikka neljasPaikka = new Paikka(4);
        this.paikat.put(4, neljasPaikka);
        Paikka viidesPaikka = new Paikka(5);
        this.paikat.put(5, viidesPaikka);
        Paikka kuudesPaikka = new Paikka(6);
        this.paikat.put(6, kuudesPaikka);
    }
    
    
    public Kortti arvoKortti(){
        Random arpoja = new Random();
        int luku = arpoja.nextInt(416);
        luku++;
        
        while (true){
            
            
            if (!this.kaytetytKortit.contains(luku)){
                this.kaytetytKortit.add(luku);
                Kortti arvottuKortti = korttipakat.getKortti(luku);
                return arvottuKortti;
            } 
                luku = arpoja.nextInt(416);
                luku++;
            }
         
        
        }
        
    
    
    public void jaaEnsimmaisetKortit(){
        //jakaa ensimmäiset 2 korttia jokaiselle paikalle, missä on pelaaja
        int i = 1;
        while(i <= 6){
                if (this.paikat.get(i).getPelaaja() == null) {
                    
                } else {
            Kortti ekaKortti = arvoKortti();
            this.paikat.get(i).nostaKortti(ekaKortti);
            Kortti tokaKortti = arvoKortti();
            this.paikat.get(i).nostaKortti(tokaKortti);
            while (this.paikat.get(i).getKorttienSumma() <= 9){
                    Kortti ekstraKortti = arvoKortti();
                    this.paikat.get(i).nostaKortti(ekstraKortti);
                }
            i++;
                }
            
        }
    }
    
    public void pelaajaHaviaa(int paikanNumero){
        
        if(this.paikat.get(paikanNumero).onkoPelaajaVakuutettu() == false){
            this.paikat.get(paikanNumero).tyhjennaPanos();
            this.paikat.get(paikanNumero).pelaajaHavisi();
        } else {
            Pelaaja pelaaja = this.paikat.get(paikanNumero).getPelaaja();
            Paikka pelaajanPaikka = this.paikat.get(paikanNumero);
            pelaajanPaikka.pelaajaHavisi();
            vakuutettuPelaajaHaviaa(pelaaja, pelaajanPaikka);
        }
    }
    
    public void pelaajaVoittaa(int paikanNumero){
        int paikanPanos = this.paikat.get(paikanNumero).getPanos();
        Pelaaja paikanPelaaja = this.paikat.get(paikanNumero).getPelaaja();
        paikanPelaaja.lisaaRahaa(paikanPanos);
        this.paikat.get(paikanNumero).tyhjennaPanos();
        this.paikat.get(paikanNumero).pelaajaVoitti();
    }
    
    public void uusiKierros(){
        int n = 1;
        while (n <= 6){
            
            this.paikat.get(n).tyhjennaPanos();
            
        }
        
    }
    
    public void pelaajaTuplaa(Pelaaja pelaaja, Paikka paikka){
        
        if((paikka.getKorttienSumma() <= 9 || paikka.getKorttienSumma() >= 11) && paikka.getKorttienMaara() == 2){
            int nykyinenPanos = paikka.getPanos();
            pelaaja.vahennaRahaa(nykyinenPanos);
            paikka.tuplaaPanos();
            // tuplauksessa pelaajalle annetaan vain 1 kortti, jonka jälkeen hän ei voi nostaa lisää
            Kortti vikaKortti = arvoKortti();
            paikka.nostaKortti(vikaKortti);
        }
              
    }
    
   public void pelaajaLuovuttaa(Pelaaja pelaaja, Paikka paikka){
       // ns. Surrender, eli 2 ensimmäisen kortin jälkeen pelaaja luovuttaa, ja saa puolet panoksesta takaisin
       if(paikka.getKorttienMaara() == 2){
           int nykyinenPanos = paikka.getPanos();
           pelaaja.lisaaRahaa(nykyinenPanos / 2);
           paikka.tyhjennaPanos();
           paikka.pelaajaHavisi();
           
       }
       
   }
    
    
    
    public void vakuutaPelaaja(Pelaaja pelaaja, Paikka paikka){
            // vakuutetaan pelaaja, jos jakajalla on ässä
        
        // tarkistaa, onko Jakajalla ässä näkyvässä paikassa (toinen kortti on piilotettu)
        if (this.jakajanPaikka.ekaKorttiOnAssa() == true){
            int nykyinenPanos = paikka.getPanos();
            pelaaja.vahennaRahaa(nykyinenPanos / 2);
            
        }
    }
        
    public void vakuutettuPelaajaHaviaa(Pelaaja pelaaja, Paikka paikka){
            
        int lopullinenPanos = paikka.getPanos();
        pelaaja.lisaaRahaa(lopullinenPanos);
            
        }
        
    }
            
    
    // tehtävää: Kierroksen vaihtuminen kokonaan! 
    

