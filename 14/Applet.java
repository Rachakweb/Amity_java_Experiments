import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class InsertTextApplet extends Applet implements ActionListener {
    TextField inputText;
    Button insertButton;
    TextArea displayText;

    public void init() {
        setLayout(new FlowLayout());

        // Create a text input field
        inputText = new TextField(20);

        // Create an "Insert" button
        insertButton = new Button("Insert");

        // Create a text area to display the text
        displayText = new TextArea(10, 30);

        // Add the input field, button, and text area to the applet
        add(inputText);
        add(insertButton);
        add(displayText);

        // Register the "Insert" button for action events
        insertButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insertButton) {
            // Get the text from the input field
            String textToInsert = inputText.getText();

            // Get the current text from the display area
            String currentText = displayText.getText();

            // Get the cursor position
            int position = displayText.getCaretPosition();

            // Insert the text at the specified position
            String newText = currentText.substring(0, position) + textToInsert + currentText.substring(position);

            // Update the display area with the new text
            displayText.setText(newText);
        }
    }
}
