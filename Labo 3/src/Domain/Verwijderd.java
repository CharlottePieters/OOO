package Domain;

public class Verwijderd implements State{
    Artikel artikel;

    public Verwijderd(Artikel artikel){
        this.artikel = artikel;
    }

    @Override
    public String verwijder() {
        return (artikel.getNaam() + " is al verwijderd.");
    }

    @Override
    public String leenUit() {
        return (artikel.getNaam() + " is verwijderd en kan dus niet meer uitgeleend worden.");
    }

    @Override
    public String brengTerug(boolean beschadigd) {
        return (artikel.getNaam() + " is verwijderd en kan dus niet teruggebracht worden.");
    }

    @Override
    public String herstel() {
        return (artikel.getNaam() + " is verwijderd en kan dus niet hersteld worden.");
    }
}
