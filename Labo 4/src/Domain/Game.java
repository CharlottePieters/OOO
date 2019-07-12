package Domain;

import java.util.ArrayList;
import java.util.List;

public class Game implements Subject{
    private List<Player> players;
    private static int MAX_NUMBER_OF_PLAYERS = 3;
    private List<Observer> observers;

    public Game(){
        this.players = new ArrayList<Player>();
        this.observers = new ArrayList<Observer>();
    }

    public Player addSpeler(String playerName) throws IllegalNumberOfPlayersException {
        int playerNumber = this.players.size() + 1;
        if (playerNumber > MAX_NUMBER_OF_PLAYERS){
            throw new IllegalNumberOfPlayersException("Too many players");
        }
        Player player = PlayerFactory.createPlayer(PlayerType.MALE, playerName, playerNumber);
        this.players.add(player);
        if (players.size() == MAX_NUMBER_OF_PLAYERS){
            notifyObservers();
        }
        return player;
    }

    public boolean amICurrentPlayer(Player player){
        return true;
    }

    public void throwDice(Player player){

    }

    @Override
    public void registerOberver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers){
            observer.update();
        }
    }

    public class IllegalNumberOfPlayersException extends Throwable {
        public IllegalNumberOfPlayersException(String too_many_players) {
        }
    }
}
