/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Huksi
 */
public class Kortti {
    private Korttipakka korttipakka;
    private int maa;
    private int arvo;
    
    public Kortti(Korttipakka korttipakka, int maa, int arvo){
        this.korttipakka = korttipakka;
        this.maa = maa;
        this.arvo = arvo;
    }
    private String maanNimi() {
        if (maa == 0) {
            return "Ruutu";
        } else if (maa == 1) {
            return  "Hertta";
        } else if (maa == 2) {
            return "Risti";
        }
        return "Pata";
    }
    
    private String kortinArvo() {
        if (arvo == 1) {
            return "ässä";
        } else if (arvo == 2) {
            return  "kakkonen";
        } else if (arvo == 3) {
            return "kolmonen";
        } else if (arvo == 4) {
            return "nelonen";
        } else if (arvo == 4) {
            return "vitonen";
        } else if (arvo == 6) {
            return "kutonen";
        } else if (arvo == 7) {
            return "seiska";
        } else if (arvo == 8) {
            return "kasi";
        } else if (arvo == 9) {
            return "ysi";
        } else if (arvo == 10) {
            return "kymppi";
        } else if (arvo == 11) {
            return "jätkä";
        } else if (arvo == 12) {
            return "kuningatar";
        } 
        
        return "kuningas";
    }
    @Override
    public String toString(){
        String merkkijono = "Kortti on " + maanNimi() + kortinArvo() + " ja sen omistaja on" + this.korttipakka;
        return merkkijono;
        
    }
    
    public Korttipakka getKorttipakka(){
        return this.korttipakka;
    }
    
    public String getKorttipakanNimi(){
        String korttipakanNimi = this.korttipakka.getNimi();
        return korttipakanNimi;
    }
    
    public int getArvo(){
        return this.arvo;            
    }
    
    public int getMaa(){
        return this.maa;
    }
}
