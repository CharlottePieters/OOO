package view;

import Domain.Game;
import Domain.Observer;
import Domain.Player;
import Domain.Speler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PlayerView implements Observer {
	private Stage stage;
	private Scene playerScene;
	private Label diceLabel; 
	private Button playButton; 
	private Label messageLabel; 
	
	private Player player;
	private Game game;

	public PlayerView(Game game, Stage stage){
		this.game = game;
		this.stage = stage;
		diceLabel = new Label("beurt 1: ");
		playButton = new Button("Werp dobbelstenen");
		playButton.setOnAction(new ThrowDicesHandler());
		playButton.setDisable(true);
		messageLabel = new Label("Spel nog niet gestart");
		layoutComponents();
		stage.setScene(playerScene);
		stage.setTitle("Temporary title");
		stage.setResizable(false);
		stage.setX(100 + (this.player.getPlayerNumber() - 1) * 350);
		stage.setY(200);
		stage.show();
	}

	public void setPlayer(Player player){
		this.player = player;
		stage.setTitle("Player " + this.player.getPlayerNumber());
	}

	private void layoutComponents() {
		VBox root = new VBox(10);
		playerScene = new Scene(root, 250, 100);
		root.getChildren().add(playButton);
		root.getChildren().add(diceLabel);
		root.getChildren().add(messageLabel);			
	}
	
	public void isAanBeurt(boolean aanBeurt){
		playButton.setDisable(!aanBeurt);		
	}


	public void start(Stage stage) {
	}

	@Override
	public void update() {
		System.out.println("I received an update");
		boolean aanBeurt = this.game.amICurrentPlayer(this.player);
		this.isAanBeurt(aanBeurt);
	}

	class ThrowDicesHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
        	game.throwDice(player);
        }
    }
}
