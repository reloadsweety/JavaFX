package test;

import javafx.application.*; ////➝1
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickCounter_44 extends Application // ➝7
{
	public static void main(String[] args) //// ➝9
	{
		launch(args); //// ➝11
	}

	Button btn; // ➝14
	Label lbl; // ➝15
	int iClickCount = 0; // ➝16

	@Override
	public void start(Stage primaryStage) // ➝18
	{
		// Create the button
		btn = new Button(); // ➝21
		btn.setText("Click me please!"); // ➝22
		btn.setOnAction(e -> buttonClick()); // ➝23
		// Create the Label
		lbl = new Label(); // ➝26
		lbl.setText("You have not clicked the button."); // ➝27
		// Add the label and the button to a layout pane
		BorderPane pane = new BorderPane(); // ➝30
		pane.setTop(lbl); // ➝31
		pane.setCenter(btn); // ➝32
		// Add the layout pane to a scene
		Scene scene = new Scene(pane, 250, 150); // ➝35
		// Add the scene to the stage, set the title
		// and show the stage
		primaryStage.setScene(scene); // ➝39
		primaryStage.setTitle("Click Counter"); // ➝40
		primaryStage.show(); // ➝41
	}

	public void buttonClick() // ➝44
	{
		iClickCount++; // ➝46
		if (iClickCount == 1) // ➝47
		{
			lbl.setText("You have clicked once."); // ➝49
		} else {
			lbl.setText("You have clicked " // ➝53
					+ iClickCount + " times.");
		}
	}
}