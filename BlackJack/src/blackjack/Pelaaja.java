/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Huksi
 */
public class Pelaaja {
    
    private int raha;
    private String nimi;
    private double promillet;
    
    
    public Pelaaja(int raha, String nimi, double promillet, int paikat){
        
        this.raha = raha;
        this.nimi = nimi;
        this.promillet = promillet;
        
    }
    
    public void vahennaRahaa(int maara){
        this.raha = this.raha - maara;
    }
    
    public void lisaaRahaa(int maara){
        this.raha = this.raha + maara;
    }
    
    public String getNimi(){
        String haettuNimi = this.nimi;
        return haettuNimi;
    }
    
    public int getRahamaara(){
        int rahaaTallaHetkella = this.raha;
        return rahaaTallaHetkella;
    }
    
    public double getPromillet(){
        double promilleja = this.promillet;
        return promilleja;
    }
    
    public void asetaPanos(Paikka paikka, int maara){
        this.raha = this.raha - maara;
        paikka.panosta(maara);
    }
    
}
