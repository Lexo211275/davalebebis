import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.HashMap;
public class CurrencyConverterApp extends Application {
    private final HashMap<String, Double> exchangeRates = new HashMap<>();
    private Label resultLabel;
    private ChoiceBox<String> fromCurrency;
    private ChoiceBox<String> toCurrency;
    private Spinner<Double> amountSpinner;

    @Override
    public void start(Stage primaryStage) {
        exchangeRates.put("GEL", 1.0);
        exchangeRates.put("USD", 0.37);
        exchangeRates.put("EUR", 0.34);
        exchangeRates.put("GBP", 0.29);

        fromCurrency = new ChoiceBox<>();
        fromCurrency.getItems().addAll("GEL", "USD", "EUR", "GBP");
        fromCurrency.setValue("GEL");
        toCurrency = new ChoiceBox<>();
        toCurrency.getItems().addAll("GEL", "USD", "EUR", "GBP");
        toCurrency.setValue("USD");
        amountSpinner = new Spinner<>(0.0, 1000000.0, 1.0, 1.0);
        amountSpinner.setEditable(true);
        resultLabel = new Label("შედეგი გამოჩნდება აქ");
        ChangeListener<Object> updateResultListener = (obs, oldVal, newVal) -> convert();
        fromCurrency.getSelectionModel().selectedItemProperty().addListener(updateResultListener);
        toCurrency.getSelectionModel().selectedItemProperty().addListener(updateResultListener);
        amountSpinner.valueProperty().addListener(updateResultListener);
        VBox root = new VBox(10, new Label("რომელი ვალუტიდან:"),
                fromCurrency,
                new Label("რომელ ვალუტაში:"),
                toCurrency,
                new Label("თანხა:"),
                amountSpinner,
                resultLabel);
        root.setStyle("-fx-padding: 20; -fx-font-size: 14px;");
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("ვალუტის გადამყვანი");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void convert() {
        try {
            String from = fromCurrency.getValue();
            String to = toCurrency.getValue();
            double amount = amountSpinner.getValue();
            if (from.equals(to)) {
                resultLabel.setText(String.format("შედეგი: %.2f %s", amount, to));
                return;
            }
            double amountInGEL = amount / exchangeRates.get(from);
            double convertedAmount = amountInGEL * exchangeRates.get(to);
            resultLabel.setText(String.format("შედეგი: %.2f %s", convertedAmount, to));
        } catch (Exception e) {
            resultLabel.setText("დაფიქსირდა შეცდომა.");
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}