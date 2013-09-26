/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;


import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Huksi
 */
public class Korttipakkakokoelma  {
    private HashMap<Integer, Korttipakka> korttipakat;
    private String nimi;
    
    public Korttipakkakokoelma(String nimi){
        this.nimi = nimi;
        this.korttipakat = new HashMap<Integer, Korttipakka>();
        Korttipakka ekaKorttipakka = new Korttipakka(this, "Eka Korttipakka");
        this.korttipakat.put(1, ekaKorttipakka);
        Korttipakka tokaKorttipakka = new Korttipakka(this, "Toka Korttipakka");
        this.korttipakat.put(2, tokaKorttipakka);
        Korttipakka kolmasKorttipakka = new Korttipakka(this, "Kolmas Korttipakka");
        this.korttipakat.put(3, kolmasKorttipakka);
        Korttipakka neljasKorttipakka = new Korttipakka(this, "Neljäs Korttipakka");
        this.korttipakat.put(4, neljasKorttipakka);
        Korttipakka viidesKorttipakka = new Korttipakka(this, "Viides Korttipakka");
        this.korttipakat.put(5, viidesKorttipakka);
        Korttipakka kuudesKorttipakka = new Korttipakka(this, "Kuudes Korttipakka");
        this.korttipakat.put(6, kuudesKorttipakka);
        Korttipakka seitsemasKorttipakka = new Korttipakka(this, "Seitsemas Korttipakka");
        this.korttipakat.put(7, seitsemasKorttipakka);
        Korttipakka kahdeksasKorttipakka = new Korttipakka(this, "Kahdeksas Korttipakka");
        this.korttipakat.put(8, kahdeksasKorttipakka);
        
    }
    
    public Kortti getKortti(int arvo){
        public Kortti getKortti(int arvo){
          // löydä oikea kortti, 0-52 eka pakka, 53-104 toka pakka... jokaisessa jaettu maan mukaan palautus.
            if(arvo > 0 && arvo <= 52){
            if (arvo > 0 && arvo <= 13){
                return this.korttipakat.get(1).getKortti("Ruutu", arvo);
            } else if (arvo > 13 && arvo <= 26){
                return this.korttipakat.get(1).getKortti("Hertta", arvo - 13);
            } else if (arvo > 26 &&  arvo <= 39){
                return this.korttipakat.get(1).getKortti("Risti", arvo - 26);
            } else if (arvo > 39 && arvo <= 52 ){
                return this.korttipakat.get(1).getKortti("Pata", arvo - 39);
            }
       } else if (arvo > 52 && arvo <= 104){
           if (arvo > 52 && arvo <= 65){
                return this.korttipakat.get(2).getKortti("Ruutu", arvo - 52);
            } else if (arvo > 65 && arvo <= 78){
                return this.korttipakat.get(2).getKortti("Hertta", arvo - 52 - 13);
            } else if (arvo > 78 &&  arvo <= 91){
                return this.korttipakat.get(2).getKortti("Risti", arvo - 52 - 26);
            } else if (arvo > 91 && arvo <= 104 ){
                return this.korttipakat.get(2).getKortti("Pata", arvo - 52 - 39);
            }
       } else if (arvo > 104 && arvo <= 156){
           if (arvo > 104 && arvo <= 117){
                return this.korttipakat.get(3).getKortti("Ruutu", arvo - 104);
            } else if (arvo > 117 && arvo <= 130){
                return this.korttipakat.get(3).getKortti("Hertta", arvo - 104 - 13);
            } else if (arvo > 130 &&  arvo <= 143){
                return this.korttipakat.get(3).getKortti("Risti", arvo - 104 - 26);
            } else if (arvo > 143 && arvo <= 156 ){
                return this.korttipakat.get(3).getKortti("Pata", arvo - 104 - 39);
            }
       } else if (arvo > 156 && arvo <= 208){
           if (arvo > 156 && arvo <= 169){
                return this.korttipakat.get(4).getKortti("Ruutu", arvo - 156);
            } else if (arvo > 169 && arvo <= 182){
                return this.korttipakat.get(4).getKortti("Hertta", arvo - 156 - 13);
            } else if (arvo > 182 &&  arvo <= 195){
                return this.korttipakat.get(4).getKortti("Risti", arvo - 156 - 26);
            } else if (arvo > 195 && arvo <= 208 ){
                return this.korttipakat.get(4).getKortti("Pata", arvo - 156 - 39);
            } 
       } else if (arvo > 208 && arvo <= 260){
           if (arvo > 208 && arvo <= 221){
                return this.korttipakat.get(5).getKortti("Ruutu", arvo - 208);
            } else if (arvo > 221 && arvo <= 234){
                return this.korttipakat.get(5).getKortti("Hertta", arvo - 208 - 13);
            } else if (arvo > 234 &&  arvo <= 247){
                return this.korttipakat.get(5).getKortti("Risti", arvo - 208 - 26);
            } else if (arvo > 247 && arvo <= 260 ){
                return this.korttipakat.get(5).getKortti("Pata", arvo - 208 - 39);
            }    
       } else if (arvo > 260 && arvo <= 312){
           if (arvo > 260 && arvo <= 273){
                return this.korttipakat.get(6).getKortti("Ruutu", arvo - 260);
            } else if (arvo > 273 && arvo <= 286){
                return this.korttipakat.get(6).getKortti("Hertta", arvo - 260 - 13);
            } else if (arvo > 286 &&  arvo <= 299){
                return this.korttipakat.get(6).getKortti("Risti", arvo - 260 - 26);
            } else if (arvo > 299 && arvo <= 312 ){
                return this.korttipakat.get(6).getKortti("Pata", arvo - 260 - 39);
            }    
       } else if (arvo > 312 && arvo <= 364){
           if (arvo > 312 && arvo <= 325){
                return this.korttipakat.get(7).getKortti("Ruutu", arvo - 312);
            } else if (arvo > 325 && arvo <= 338){
                return this.korttipakat.get(7).getKortti("Hertta", arvo - 312 - 13);
            } else if (arvo > 338 &&  arvo <= 351){
                return this.korttipakat.get(7).getKortti("Risti", arvo - 312 - 26);
            } else if (arvo > 351 && arvo <= 364 ){
                return this.korttipakat.get(7).getKortti("Pata", arvo - 312 - 39);
            }    
       } else if (arvo > 364 && arvo <= 416) {
           if (arvo > 364 && arvo <= 377){
                return this.korttipakat.get(8).getKortti("Ruutu", arvo - 364);
            } else if (arvo > 377 && arvo <= 390){
                return this.korttipakat.get(8).getKortti("Hertta", arvo - 364 - 13);
            } else if (arvo > 390 &&  arvo <= 403){
                return this.korttipakat.get(8).getKortti("Risti", arvo - 364 - 26);
            } else if (arvo > 403 && arvo <= 416 ){
                return this.korttipakat.get(8).getKortti("Pata", arvo - 364 - 39);
            }    
       }
        return null;
    }
    }
}
