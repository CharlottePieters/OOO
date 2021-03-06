package Domain;

public class FemalePlayer implements Player {
    private String playerName;
    private int playerNumber;

    public FemalePlayer(String playerName, int playerNumber){
        this.setPlayerName(playerName);
        this.setPlayerNumber(playerNumber);
    }

    private void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    private void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String getPlayerName() {
        return this.playerName;
    }

    @Override
    public int getPlayerNumber() {
        return this.playerNumber;
    }
}
