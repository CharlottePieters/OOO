package app;

import Domain.Game;
import javafx.application.Application;
import javafx.stage.Stage;
import view.PlayerView;

import javax.swing.*;

public class Main extends Application {

            @Override
            public void start(Stage primaryStage) throws Exception {
                Game game = new Game();

                PlayerView player1 = new PlayerView(game, new Stage());
                PlayerView player2 = new PlayerView(game, new Stage());
                PlayerView player3 = new PlayerView(game, new Stage());

                game.registerOberver(player1);
                game.registerOberver(player2);
                game.registerOberver(player3);

                try{
                    String naamPlayer1 = JOptionPane.showInputDialog("Get name of first player.");
                    player1.setPlayer(game.addSpeler(naamPlayer1));

                    String naamPlayer2 = JOptionPane.showInputDialog("Get name of second player.");
                    player2.setPlayer(game.addSpeler(naamPlayer2));

                    String naamPlayer3 = JOptionPane.showInputDialog("Get name of third player.");
                    player3.setPlayer(game.addSpeler(naamPlayer3));
                }
                catch (Game.IllegalNumberOfPlayersException e) {
                    System.out.println(e);
                }
            }

            public static void main(String[] args) {
                launch(args);
            }
        }


