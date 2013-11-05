/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;


/**
 *
 * @author Huksi
 */
public class Paikka {
    // private Pelaaja pelaaja;
    private Pelaaja pelaaja;
    private int panos;
    private int korttienSumma;
    private int vaihtoehtoSumma;
    private int paikanNumero;
    private ArrayList<Kortti> paikanKortit;
    private boolean voittaakoPelaaja;
    private boolean onkoVakuutettu;
    
    
    public Paikka(int paikanNumero){
        this.pelaaja = null;
        this.paikanNumero = paikanNumero;
        this.panos = 0;
        this.korttienSumma = 0;
        this.vaihtoehtoSumma = 0;
        this.paikanKortit = new ArrayList<Kortti>();
        this.onkoVakuutettu = false;
        
        
    }
    
    public void liitaPelaajaPaikalle(Pelaaja pelaaja){
        this.pelaaja = pelaaja;
    }
    
    public void poistaPelaaja(){
        this.pelaaja = null;
    }
    public Pelaaja getPelaaja(){
        if (this.pelaaja == null){
            return null;
        }
        return this.pelaaja;
    }
    
    public void panosta(int maara){
        this.panos = this.panos + maara;
        
    }
    
    public void pelaajaVoitti(){
        
        //voittaako pelaaja kierroksen
        this.voittaakoPelaaja = true;
        
    }
    
    public void pelaajaHavisi(){
        // häviääkö pelaaja kierroksen
        this.voittaakoPelaaja = false;
    }
    
    public boolean voittikoPelaaja(){
    if (this.voittaakoPelaaja = true){
           return true;
        } else {
            return false;
        }
}
    
    public void tyhjennaPanos(){
        this.panos = 0;
        this.korttienSumma = 0;
        this.vaihtoehtoSumma = 0;
        tyhjennaKortit();
    }
    
    public void tuplaaPanos(){
        this.panos = this.panos * 2;
    }
    
    
    public void ensimmaisetKortit(Kortti kortti, Kortti toinenKortti){
        
        //käytännössä turhaa koodia, ei käytetä
        
        if (kortti.getArvo() <= 10){
            this.korttienSumma = this.korttienSumma + 10;
        } else if (kortti.getArvo() > 1){
            this.korttienSumma = this.korttienSumma + kortti.getArvo();
        } else if (kortti.getArvo() == 1) {
                if (this.korttienSumma + 11 > 21){
                    this.korttienSumma = this.korttienSumma + 1;
                } else {
                    this.vaihtoehtoSumma = this.korttienSumma + 1;
                    this.korttienSumma = this.korttienSumma + 11;
                }
        }
        
        if (toinenKortti.getArvo() <= 10){
            this.korttienSumma = this.korttienSumma + 10;
        } else if (toinenKortti.getArvo() > 1){
            this.korttienSumma = this.korttienSumma + toinenKortti.getArvo();
        } else if (toinenKortti.getArvo() == 1) {
                if (this.korttienSumma + 11 > 21){
                    this.korttienSumma = this.korttienSumma + 1;
                } else {
                    this.vaihtoehtoSumma = this.korttienSumma + 1;
                    this.korttienSumma = this.korttienSumma + 11;
                }
               }
    }     
    public void nostaKortti(Kortti kortti){
        
        this.paikanKortit.add(kortti);
        
        
        if (kortti.getArvo() <= 10){
            this.korttienSumma = this.korttienSumma + 10;
        } else if (kortti.getArvo() > 1){
            this.korttienSumma = this.korttienSumma + kortti.getArvo();
        } else if (kortti.getArvo() == 1) {
                if (this.korttienSumma + 11 > 21){
                    this.korttienSumma = this.korttienSumma + 1;
                } else {
                    this.vaihtoehtoSumma = this.korttienSumma + 1;
                    this.korttienSumma = this.korttienSumma + 11;
                }
        }
        if (this.korttienSumma > 21 && ( this.vaihtoehtoSumma == 0 || this.vaihtoehtoSumma > 21)){
            
        }
        // arvo uusi kortti
        // String nostetunArvo = nostettu.getArvo();
        // this.korttienSumma = this.korttienSumma + nostetunArvo;
        // if(this.korttienSumma > 21){
        // foldaa kortit ja nosta panos jakajalle 
        // plus kaikki ässän kanssa kikkailut
    }
    
    public void tyhjennaKortit(){
        ArrayList<Kortti> uudetKortit = new ArrayList<Kortti>();
        this.paikanKortit = uudetKortit;
        
    }
    
    public boolean onkoPelaajaVakuutettu(){
        return this.onkoVakuutettu;
    }
    
    public void lopetaNostaminen(){
        //itsensä selittävä
    }
    
    public int getKorttienSumma(){
        return this.korttienSumma;
    }
    public int getVaihtoehtoSumma(){
        return this.vaihtoehtoSumma;
    }
    
    public int getPanos(){
        return this.panos;
    }
    
    public int getKorttienMaara(){
        int kortteja = this.paikanKortit.size();
        return kortteja;
    }
    
    public boolean ekaKorttiOnAssa(){
        // Jakajan paikkaa varten, käytetään silloin kun halutaan tietää onko näkyvä kortti ässä (vakuutusta varten
        if (this.paikanKortit.get(1).getArvo() == 1){
            return true;
        } 
        return false;
    }
    
        
}
