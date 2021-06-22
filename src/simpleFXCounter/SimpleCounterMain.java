package simpleFXCounter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SimpleCounterMain extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("CounterScreen.fxml"));
		BorderPane p = loader.load();
		primaryStage.setScene(new Scene(p));
		primaryStage.setTitle("simple counter");
		primaryStage.show();
	}

}
