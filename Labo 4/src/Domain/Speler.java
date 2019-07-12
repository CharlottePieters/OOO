package Domain;

public class Speler {
    private String naam;
    private int spelerNummer;
    private int totalScore = 0;
    private int currentScore = 0;
    private int turns = 0;
    private int dice1 = 0;
    private int dice2 = 0;

    public Speler(String naam, int spelerNummer) throws Exception{
        this.setNaam(naam);
        this.setSpelerNummer(spelerNummer);
    }

    public void setNaam(String naam) throws Exception{
        if (naam.equals(null) || naam.trim().isEmpty()){
            throw new IllegalArgumentException("Name of player cannot be empty.");
        }
    }

    public void setSpelerNummer(int spelerNummer) throws Exception{
        if (spelerNummer >= 1 && spelerNummer <= 3){
            this.spelerNummer = spelerNummer;
        }
        else {
            throw new IllegalArgumentException("Spelernummer moet een getal tussen 1 en 3 zijn.");
        }
    }

    public void throwDice(int previousScore){
        this.dice1 = (int) Math.random() * 6 + 1;
        this.dice2 = (int) Math.random() * 6 + 1;

        this.currentScore = this.calcScore(previousScore);
        this.turns++;
        this.totalScore += this.currentScore;
    }

    public int calcScore(int previousScore){
        int score = this.dice1 + this.dice2;
        if (score == previousScore){
            score += 5;
        }
        else if (this.dice1 == this.dice2){
            score = this.dice1 * 4;
        }
        return score;
    }

    public int getSpelerNummer(){
        return this.spelerNummer;
    }

    public int getTotalScore(){
        return this.totalScore;
    }

    public int getCurrentScore(){
        return this.currentScore;
    }

    public int getTurns(){
        return this.turns;
    }

    public int getDice1(){
        return this.dice1;
    }

    public int getDice2(){
        return this.dice2;
    }
}
