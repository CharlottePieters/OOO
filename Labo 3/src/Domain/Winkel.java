package Domain;

import java.util.ArrayList;

public class Winkel {
    private ArrayList<Artikel> artikels;

    public Winkel(){
        this.artikels = new ArrayList<Artikel>();
    }

    public void addArtikel(Artikel artikel){
        this.artikels.add(artikel);
    }

    public Artikel getArtikel(String naam){
        for (Artikel artikel : this.artikels){
            if (artikel.getNaam().equals(naam)){
                return artikel;
            }
        }
        return null;
    }

    public ArrayList<Artikel> getArtikels(){
        return this.artikels;
    }

    public String artikelString(){
        String res = "De artikels van de winkel zijn:\n\n";
        for (Artikel artikel : this.artikels){
            res += artikel.getNaam() + "\t €" + artikel.getPrijs() + "\t" + artikel.getState().toString() + "\n";
        }
        return res.substring(0, res.length()-1);
    }

    public String removeArtikel(String naam){
        String message = "";
        for (Artikel artikel : artikels){
            if (artikel.getNaam().equals(naam)){
                message = artikel.verwijder();
                if (artikel.getState() == artikel.getVerwijderd()){
                    this.artikels.remove(artikel);
                }
            }
        }
        return message;
    }

    public String rentArtikel(String naam){
        String message = "";
        for (Artikel artikel : this.artikels){
            if (artikel.getNaam().equals(naam)){
                System.out.println("check");
                message = artikel.leenUit();
                System.out.println(message);
            }
        }
        return message;
    }

    public String returnArtikel(String naam, boolean beschadigd){
        String message = "";
        for (Artikel artikel : this.artikels){
            if (artikel.getNaam().equals(naam)){
                message = artikel.brengTerug(beschadigd);
            }
        }
        return message;
    }

    public String repairArtikel(String naam){
        String message = "";
        for (Artikel artikel : artikels){
            if (artikel.getNaam().equals(naam)){
                message = artikel.herstel();
            }
        }
        return message;
    }
}
