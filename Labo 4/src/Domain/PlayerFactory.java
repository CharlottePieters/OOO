package Domain;

public class PlayerFactory {

    public static Player createPlayer(PlayerType type, String playerName, int playerNumber){
        Player player;
        switch (type){
            case MALE:
                player = new MalePlayer(playerName, playerNumber);
                break;
            case FEMALE:
                player = new FemalePlayer(playerName, playerNumber);
                break;
                default:
                    player = new MalePlayer(playerName, playerNumber);
        }
        return player;
    }
}
