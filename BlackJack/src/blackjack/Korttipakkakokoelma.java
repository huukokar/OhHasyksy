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
public class Korttipakkakokoelma  {
    private ArrayList<Korttipakka> korttipakat;
    private String nimi;
    
    public Korttipakkakokoelma(){
        this.nimi = nimi;
        this.korttipakat = new ArrayList<Korttipakka>();
        Korttipakka ekakorttipaikka = new Korttipaikka(this);
        this.korttipakat.add(ekakorttipaikka);
        
    }
    
}
