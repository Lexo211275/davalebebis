import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    // მაგალითისთვის:
    private final String correctUsername = "admin";
    private final String correctPassword = "1234";

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("გთხოვთ შეავსოთ ყველა ველი.");
        } else if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
            messageLabel.setText("არასწორი Username ან Password.");
        } else {
            messageLabel.setText("წარმატებული ავტორიზაცია!");
        }
    }
}
