package Domain;

public class Artikel{
    private State state;
    private State uitleenbaar;
    private State uitgeleend;
    private State beschadigd;
    private State verwijderd;

    private double prijs;
    private String naam;

    public Artikel(String naam, double prijs){
        this.uitleenbaar = new Uitleenbaar(this);
        this.uitgeleend = new Uitgeleend(this);
        this.beschadigd = new Beschadigd(this);
        this.verwijderd = new Verwijderd(this);
        this.state = uitleenbaar;

        this.setPrijs(prijs);
        this.setNaam(naam);
    }

    private void setPrijs(double prijs){
        if (prijs <= 0){
            throw new IllegalArgumentException("Een artikel mag niet gratis zijn.");
        }
        this.prijs = prijs;
    }

    private void setNaam(String naam) {
        if (naam.equals(null) || naam.trim().isEmpty()) {
            throw new IllegalArgumentException("De naam van een artikel mag niet leeg zijn.");
        }
        this.naam = naam.trim();
    }

    public void setState(State state){
        this.state = state;
    }

    public String verwijder(){
        return this.state.verwijder();
    }

    public String leenUit(){
        return this.state.leenUit();
    }

    public String herstel(){
        return this.state.herstel();
    }

    public String brengTerug(boolean beschadigd){
        return this.state.brengTerug(beschadigd);
    }

    public State getState(){
        return this.state;
    }

    public State getUitleenbaar(){
        return this.uitleenbaar;
    }

    public State getBeschadigd() {
        return this.beschadigd;
    }

    public State getUitgeleend() {
        return this.uitgeleend;
    }

    public State getVerwijderd(){
        return this.verwijderd;
    }

    public double getPrijs() {
        return this.prijs;
    }

    public String getNaam() {
        return this.naam;
    }
}

