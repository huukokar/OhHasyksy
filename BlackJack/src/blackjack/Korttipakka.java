/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.HashMap;

/**
 *
 * @author Huksi
 */
public class Korttipakka {
    private Korttipakkakokoelma omistaja;
    private String nimi;
    private HashMap<String, HashMap> kortit;
    private HashMap<Integer, Kortti> ruutukortit;
    private HashMap<Integer, Kortti> herttakortit;
    private HashMap<Integer, Kortti> ristikortit;
    private HashMap<Integer, Kortti> patakortit;
    
    public Korttipakka(Korttipakkakokoelma omistaja, String nimi){
        this.omistaja = omistaja;
        this.nimi = nimi;
        this.ruutukortit = new HashMap<Integer, Kortti>();
        luoRuutukortit();
        this.herttakortit = new HashMap<Integer, Kortti>();
        luoHerttakortit();
        this.ristikortit = new HashMap<Integer, Kortti>();
        luoRistikortit();
        this.patakortit = new HashMap<Integer, Kortti>();
        luoPatakortit();
        
        this.kortit = new HashMap<String, HashMap>();
        this.kortit.put("Ruutu", this.ruutukortit);
        this.kortit.put("Hertta", this.herttakortit);
        this.kortit.put("Risti", this.ristikortit);
        this.kortit.put("Pata", this.patakortit);
        
    }
    
    public final void luoRuutukortit(){
        
        Kortti ruutuassa = new Kortti(this, 0, 1);
        this.ruutukortit.put(1, ruutuassa);
        Kortti ruutukakkonen = new Kortti(this, 0, 2);
        this.ruutukortit.put(2, ruutukakkonen);
        Kortti ruutukolmonen = new Kortti(this, 0, 3);
        this.ruutukortit.put(3, ruutukolmonen);
        Kortti ruutunelonen = new Kortti(this, 0, 4);
        this.ruutukortit.put(4, ruutunelonen);
        Kortti ruutuvitonen = new Kortti(this, 0, 5);
        this.ruutukortit.put(5, ruutuvitonen);
        Kortti ruutukutonen = new Kortti(this, 0, 6);
        this.ruutukortit.put(6, ruutukutonen);
        Kortti ruutuseiska = new Kortti(this, 0, 7);
        this.ruutukortit.put(7, ruutuseiska);
        Kortti ruutukasi = new Kortti(this, 0, 8);
        this.ruutukortit.put(8, ruutukasi);
        Kortti ruutuysi = new Kortti(this, 0, 9);
        this.ruutukortit.put(9, ruutuysi);
        Kortti ruutukymppi = new Kortti(this, 0, 10);
        this.ruutukortit.put(10, ruutukymppi);
        Kortti ruutujatka = new Kortti(this, 0, 11);
        this.ruutukortit.put(11, ruutujatka);
        Kortti ruutukuningatar = new Kortti(this, 0, 12);
        this.ruutukortit.put(12, ruutukuningatar);
        Kortti ruutukuningas = new Kortti(this, 0, 13);
        this.ruutukortit.put(13, ruutukuningas);
    }
    
    public final void luoHerttakortit(){
        
        Kortti herttaassa = new Kortti(this, 1, 1);
        this.herttakortit.put(1, herttaassa);
        Kortti herttakakkonen = new Kortti(this, 1, 2);
        this.herttakortit.put(2, herttakakkonen);
        Kortti herttakolmonen = new Kortti(this, 1, 3);
        this.herttakortit.put(3, herttakolmonen);
        Kortti herttanelonen = new Kortti(this, 1, 4);
        this.herttakortit.put(4, herttanelonen);
        Kortti herttavitonen = new Kortti(this, 1, 5);
        this.herttakortit.put(5, herttavitonen);
        Kortti herttakutonen = new Kortti(this, 1, 6);
        this.herttakortit.put(6, herttakutonen);
        Kortti herttaseiska = new Kortti(this, 1, 7);
        this.herttakortit.put(7, herttaseiska);
        Kortti herttakasi = new Kortti(this, 1, 8);
        this.herttakortit.put(8, herttakasi);
        Kortti herttaysi = new Kortti(this, 1, 9);
        this.herttakortit.put(9, herttaysi);
        Kortti herttakymppi = new Kortti(this, 1, 10);
        this.herttakortit.put(10, herttakymppi);
        Kortti herttajatka = new Kortti(this, 1, 11);
        this.herttakortit.put(11, herttajatka);
        Kortti herttakuningatar = new Kortti(this, 1, 12);
        this.herttakortit.put(12, herttakuningatar);
        Kortti herttakuningas = new Kortti(this, 1, 13);
        this.herttakortit.put(13, herttakuningas);
        
    }
    
    public final void luoRistikortit(){
        
        Kortti ristiassa = new Kortti(this, 2, 1);
        this.ristikortit.put(1, ristiassa);
        Kortti ristikakkonen = new Kortti(this, 2, 2);
        this.ristikortit.put(2, ristikakkonen);
        Kortti ristikolmonen = new Kortti(this, 2, 3);
        this.ristikortit.put(3, ristikolmonen);
        Kortti ristinelonen = new Kortti(this, 2, 4);
        this.ristikortit.put(4, ristinelonen);
        Kortti ristivitonen = new Kortti(this, 2, 5);
        this.ristikortit.put(5, ristivitonen);
        Kortti ristikutonen = new Kortti(this, 2, 6);
        this.ristikortit.put(6, ristikutonen);
        Kortti ristiseiska = new Kortti(this, 2, 7);
        this.ristikortit.put(7, ristiseiska);
        Kortti ristikasi = new Kortti(this, 2, 8);
        this.ristikortit.put(8, ristikasi);
        Kortti ristiysi = new Kortti(this, 2, 9);
        this.ristikortit.put(9, ristiysi);
        Kortti ristikymppi = new Kortti(this, 2, 10);
        this.ristikortit.put(10, ristikymppi);
        Kortti ristijatka = new Kortti(this, 2, 11);
        this.ristikortit.put(11, ristijatka);
        Kortti ristikuningatar = new Kortti(this, 2, 12);
        this.ristikortit.put(12, ristikuningatar);
        Kortti ristikuningas = new Kortti(this, 2, 13);
        this.ristikortit.put(13, ristikuningas);
        
    }
    
    public final void luoPatakortit(){
        
        Kortti pataassa = new Kortti(this, 3, 1);
        this.patakortit.put(1, pataassa);
        Kortti patakakkonen = new Kortti(this, 3, 2);
        this.patakortit.put(2, patakakkonen);
        Kortti patakolmonen = new Kortti(this, 3, 3);
        this.patakortit.put(3, patakolmonen);
        Kortti patanelonen = new Kortti(this, 3, 4);
        this.patakortit.put(4, patanelonen);
        Kortti patavitonen = new Kortti(this, 3, 5);
        this.patakortit.put(5, patavitonen);
        Kortti patakutonen = new Kortti(this, 3, 6);
        this.patakortit.put(6, patakutonen);
        Kortti pataseiska = new Kortti(this, 3, 7);
        this.patakortit.put(7, pataseiska);
        Kortti patakasi = new Kortti(this, 3, 8);
        this.patakortit.put(8, patakasi);
        Kortti pataysi = new Kortti(this, 3, 9);
        this.patakortit.put(9, pataysi);
        Kortti patakymppi = new Kortti(this, 3, 10);
        this.patakortit.put(10, patakymppi);
        Kortti patajatka = new Kortti(this, 3, 11);
        this.patakortit.put(11, patajatka);
        Kortti patakuningatar = new Kortti(this, 3, 12);
        this.patakortit.put(12, patakuningatar);
        Kortti patakuningas = new Kortti(this, 3, 13);
        this.ruutukortit.put(13, patakuningas);
        
    }
    
    public Kortti getKortti(String maa, int arvo){
        if ((maa.equals("risti") || maa.equals("Risti")) && arvo < 14 && arvo > 0){
            Kortti palautettavaKortti = (Kortti) this.kortit.get("Risti").get(arvo);
            return palautettavaKortti;
        } else if ((maa.equals("pata") || maa.equals("Pata")) && arvo < 14 && arvo > 0){
            Kortti palautettavaKortti = (Kortti) this.kortit.get("Pata").get(arvo);
            return palautettavaKortti;
        } else if ((maa.equals("ruutu") || maa.equals("Ruutu")) && arvo < 14 && arvo > 0){
        Kortti palautettavaKortti = (Kortti) this.kortit.get("Ruutu").get(arvo);
        return palautettavaKortti;
        } else if ((maa.equals("hertta") || maa.equals("Hertta")) && arvo < 14 && arvo > 0){
            Kortti palautettavaKortti = (Kortti) this.kortit.get("Hertta").get(arvo);
            return palautettavaKortti;
        } 
        return null;
    
    }
    
   
        
    public String getNimi(){
        return this.nimi;
    }
    
    
}    
