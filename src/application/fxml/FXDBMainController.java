package application.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;

public class FXDBMainController {

	@FXML
	Accordion mainAccordion;

	@FXML
	TitledPane loginPange;

	@FXML
	private void initialize() {
		System.out.println(" ############# Login Controller ############# ");
		mainAccordion.setExpandedPane(loginPange);
		loginPange.setExpanded(true);
	}
}
