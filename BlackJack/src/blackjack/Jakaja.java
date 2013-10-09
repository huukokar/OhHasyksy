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
    private Korttipakkakokoelma korttipakat;
    private HashMap<Integer, Paikka> paikat;
    private ArrayList<Integer> kaytetytKortit;
    private Paikka jakajanPaikka;
    
    public Jakaja(String nimi){
       // this.maksimiPaikat = maksimiPaikat;
        this.nimi = nimi;
        this.korttipakat = new Korttipakkakokoelma("Jakajan kortit");
        this.paikat = new HashMap<Integer, Paikka>();
        luoPaikat();
        this.jakajanPaikka = new Paikka(0);
        
        
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
        this.paikat.get(paikanNumero).tyhjennaPanos();
        this.paikat.get(paikanNumero).pelaajaHavisi();
      
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
        
        public void vakuutaPelaaja(Pelaaja pelaaja){
            // vakuutetaan pelaaja, jos jakajalla on ässä
        }
        
        public void vakuutettuPelaajaHaviaa(Pelaaja pelaaja){
            // vakuutettu pelaaja saa osan panoksestaan takaisin, vaikka häviääkin
            
        }
        
    }
            
    
    // tehtävää: Kierroksen vaihtuminen kokonaan! 
    

