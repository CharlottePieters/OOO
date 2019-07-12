package Domain;

public class Uitgeleend implements State {
    Artikel artikel;

    public Uitgeleend(Artikel artikel){
        this.artikel = artikel;
    }

    @Override
    public String verwijder() {
        return (artikel.getNaam() + " kan niet worden verwijderd aangezien het uitgeleend is.");
    }

    @Override
    public String leenUit() {
        return (artikel.getNaam() + "is al uitgeleend.");
    }

    @Override
    public String brengTerug(boolean beschadigd) {
        if (beschadigd){
            artikel.setState(artikel.getBeschadigd());
            return (artikel.getNaam() + " is beschadigd!\nU moet €" + artikel.getPrijs()/3 + " schadevergoeding betalen.");
        }
        else {
            artikel.setState(artikel.getUitleenbaar());
            return (artikel.getNaam() + " is teruggebracht!");
        }
    }

    @Override
    public String herstel() {
        return (artikel.getNaam() + " is uitgeleend en kan dus niet hersteld worden.");
    }
}
