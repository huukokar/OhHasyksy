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
    private Pelaaja pelaaja;
    private int panos;
    
    public Paikka(Pelaaja pelaaja, int panos){
        this.pelaaja = pelaaja;
        this.panos = panos;
        
    }
    
    public void maaritaPanos(int maara){
        this.panos = this.panos + maara;
    }
}
