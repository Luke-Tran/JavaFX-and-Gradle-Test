import javafx.application.Application;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
		Pane pane = new Pane();
        Circle circle = new Circle(150, 137.5, 100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);
		
		Button enlargerButton = new Button();
		enlargerButton.setText("Make Circle Bigger");
		pane.getChildren().add(enlargerButton);
		enlargerButton.setOnAction(e -> {
			double newRadius = circle.getRadius() + 10;
			circle.setRadius(newRadius);
		});

        HBox hBox = new HBox();
        hBox.setSpacing(10);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        Scene scene = new Scene(borderPane, 300, 275);
		stage.setTitle("JavaFX with Gradle test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}