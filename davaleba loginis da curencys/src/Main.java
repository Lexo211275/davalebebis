import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Login Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
//
//
//    public class Main extends Application {
//
//        private final Map<String, Double> currencyRates = new HashMap<>();
//        private final ChoiceBox<String> fromCurrency = new ChoiceBox<>();
//        private final ChoiceBox<String> toCurrency = new ChoiceBox<>();
//        private final Spinner<Double> amountSpinner = new Spinner<>();
//        private final Label resultLabel = new Label("შედეგი გამოჩნდება აქ");
//        @Override
//        public void start(Stage primaryStage) {
//            currencyRates.put("GEL", 1.0);
//            currencyRates.put("USD", 2.7);
//            currencyRates.put("EUR", 2.9);
//            currencyRates.put("GBP", 3.2);
//            fromCurrency.getItems().addAll("GEL", "USD", "EUR", "GBP");
//            toCurrency.getItems().addAll("GEL", "USD", "EUR", "GBP");
//            fromCurrency.setValue("GEL");
//            toCurrency.setValue("USD");
//            SpinnerValueFactory<Double> valueFactory = new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 1000000, 1, 0.1);
//            amountSpinner.setValueFactory(valueFactory);
//            amountSpinner.setEditable(true);
//            fromCurrency.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> convert());
//            toCurrency.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> convert());
//            amountSpinner.valueProperty().addListener((obs, oldVal, newVal) -> convert());
//            VBox root = new VBox(10, new Label("საიდან გინდა გადაყვანა:"), fromCurrency,
//                    new Label("სად გინდა გადაყვანა:"), toCurrency,
//                    new Label("თანხა:"), amountSpinner,
//                    new Label("შედეგი:"), resultLabel);
//            root.setPadding(new Insets(20));
//
//            Scene scene = new Scene(root, 300, 300);
//            primaryStage.setScene(scene);
//            primaryStage.setTitle("ვალუტის კონვერტერი");
//            primaryStage.show();
//        }
//        private void convert() {
//            try {
//                String from = fromCurrency.getValue();
//                String to = toCurrency.getValue();
//                double amount = amountSpinner.getValue();
//                if (from.equals(to)) {
//                    resultLabel.setText(String.format("%.2f %s", amount, to));
//                    return;
//                }
//                if (!currencyRates.containsKey(from) || !currencyRates.containsKey(to)) {
//                    resultLabel.setText("არასწორი ვალუტა");
//                    return;
//                }
//                double inGEL = amount * currencyRates.get(from);
//                double converted = inGEL / currencyRates.get(to);
//                resultLabel.setText(String.format("%.2f %s", converted, to));
//            } catch (Exception e) {
//                resultLabel.setText("შეცდომა მოხდა: " + e.getMessage());
//            }
//        }
//        public static void main(String[] args) {
//            launch(args);
        }
    }
