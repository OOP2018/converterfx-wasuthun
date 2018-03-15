package converter;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
/**
 * This class use to convert a input value in textfield to other unit and use clear textfield
 * @author wasuthun wanaphongthipakorn
 *
 */
public class ConverterController {
	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	@FXML
	ComboBox<Length> combo1;
	@FXML
	ComboBox<Length> combo2;
	@FXML
	Button button1;
	@FXML
	Button button2;
	/**
	 * This method use to initialize attribute 
	 */
	 @FXML
	 public void initialize() {
	 // This is for testing
	 System.out.println("Running initialize");
	 if (combo1 != null) {
	 combo1.getItems().addAll( Length.values() );
	 combo1.getSelectionModel().select(0); // select an item to show
	 }
	 if (combo2 != null) {
	 combo2.getItems().addAll( Length.values() );
	 combo2.getSelectionModel().select(1); // select an item to show
	 }
	 }
	 
	/**
	 * This method use to convert value in textfield to other unit
	 * @param event
	 */
	 public void handleConvert(ActionEvent event) {
		
		 String textf1 = textfield1.getText().trim();
		 String textf2 = textfield2.getText().trim();
		 System.out.println("handleConvert converting "+textf1);
		 if(!textf1.equals("")) {
		 try {
			 double text2=Double.parseDouble(textf1);
			 double text3=text2*combo2.getValue().getValue()/combo1.getValue().getValue();
			 textfield2.setText(""+text3);
		 }catch(NumberFormatException e) {
			 	textfield2.setText("Error!!");
				textfield2.setStyle("-fx-text-fill: red");
		 }
		 }
		 else if(!textf2.equals("")) {
			 try {
				 double text2=Double.parseDouble(textf2);
				 double text3=text2*combo1.getValue().getValue()/combo2.getValue().getValue();
				 textfield1.setText(""+text3);
			 }catch(NumberFormatException e) {
				 	textfield1.setText("Error!!");
					textfield1.setStyle("-fx-text-fill: red");
			 }
		 }
		 }
	 /**
	  * Use to clear all textfield
	  * @param event
	  */
	 public void handleClear(ActionEvent event) {
		 	textfield1.clear();
		 	textfield2.clear();
		 	textfield1.setStyle("-fx-text-fill: black");
			textfield2.setStyle("-fx-text-fill: black");
	 }
}
