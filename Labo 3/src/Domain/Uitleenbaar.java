package Domain;

public class Uitleenbaar implements State {
    public Artikel artikel;

    public Uitleenbaar(Artikel artikel){
        this.artikel = artikel;
    }
    @Override
    public String verwijder() {
        artikel.setState(artikel.getVerwijderd());
        return (artikel.getNaam() + " is nu verwijderd.");
    }

    @Override
    public String leenUit() {
        artikel.setState(artikel.getUitgeleend());
        return (artikel.getNaam() + " is nu uitgeleend.\nU moet €" + artikel.getPrijs()/5 + " betalen.");
    }

    @Override
    public String brengTerug(boolean beschadigd) {
        return (artikel.getNaam() + " kan niet worden teruggebracht aangezien het niet uitgeleend is.");
    }

    @Override
    public String herstel() {
        return (artikel.getNaam() + " kan niet worden hersteld aangezien het niet kapot is.");
    }
}
