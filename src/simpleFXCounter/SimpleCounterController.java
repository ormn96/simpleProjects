package simpleFXCounter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SimpleCounterController {

	@FXML
	private Label counter;
	private int cnt = 0;

	@FXML
	void add(ActionEvent event) {
		inc();
	}

	@FXML
	void sub(ActionEvent event) {
		if (cnt > 0) {
			cnt--;
			updateLabel();
		}
	}

	@FXML
	void zero(ActionEvent event) {
		cnt = 0;
		updateLabel();
	}

	public void inc() {
		cnt++;
		updateLabel();
	}

	private void updateLabel() {
		counter.setText(cnt + "");
	}
}
