/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;


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
    
    public Paikka(int panos){
        this.pelaaja = null;
        
        this.panos = panos;
        this.korttienSumma = 0;
        this.vaihtoehtoSumma = 0;
        
    }
    
    public void liitaPelaajaPaikalle(Pelaaja pelaaja){
        this.pelaaja = pelaaja;
    }
    
    public void panosta(int maara){
        this.panos = this.panos + maara;
        
    }
    
    public void ensimmaisetKortit(Kortti kortti, Kortti toinenKortti){
        
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
    
    public void lopetaNostaminen(){
        //itsensä selittävä
    }
}
