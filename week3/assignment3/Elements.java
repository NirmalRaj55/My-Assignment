package week3.assignment3;

public class Elements {

	public static void main(String[] args) {
		Button button = new Button();
        button.click();
        button.submit();

        TextField textField = new TextField();
        textField.click();
        textField.setText("Text Feild");
        textField.getText();

        CheckBoxButton checkBoxButton = new CheckBoxButton();
        checkBoxButton.click();
        checkBoxButton.clickCheckButton();

        RadioButton radioButton = new RadioButton();
        radioButton.click();
        radioButton.selectRadioButton();

	}

}
