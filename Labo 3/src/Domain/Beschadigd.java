package Domain;

public class Beschadigd implements State {
    Artikel artikel;

    public Beschadigd(Artikel artikel){
        this.artikel = artikel;
    }

    @Override
    public String verwijder() {
        artikel.setState(artikel.getVerwijderd());
        return (artikel.getNaam() + " kon niet meer hersteld worden.\nHet is nu verwijderd.");
    }

    @Override
    public String leenUit() {
        return (artikel.getNaam() + " is beschadigd.\nBeschadigde artikels worden niet uitgeleend.");
    }

    @Override
    public String brengTerug(boolean beschadigd) {
        return (artikel.getNaam() + " is al teruggebracht. Het is zelfs beschadigd.");
    }

    @Override
    public String herstel() {
        artikel.setState(artikel.getUitleenbaar());
        return (artikel.getNaam() + " is hersteld en terug uitleenbaar.");
    }
}
