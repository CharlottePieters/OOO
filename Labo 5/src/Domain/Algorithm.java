package Domain;

public enum Algorithm {
    CEASAR ("Ceasar", "Domain.Ceasar"),
    MIRROR ("Mirror", "Domain.Mirror"),
    RANDOMCYPHER ("RandomCypher", "Domain.RandomCypherAdapter");

    private final String omschrijving;
    private final String klasseNaam;

    Algorithm(String omschrijving, String klasseNaam) {
        this.omschrijving = omschrijving;
        this.klasseNaam = klasseNaam;
    }

    public String getOmschrijving() { return omschrijving; }
    public String getKlasseNaam() { return klasseNaam; }
}
