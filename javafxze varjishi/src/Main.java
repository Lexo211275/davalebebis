import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random;
    public class Main extends Application {

        private final double MOVE_STEP = 10;
        private final Color[] colors = {Color.RED, Color.BLACK, Color.GREEN, Color.BLUE, Color.YELLOW};
        private int colorIndex = 0;

        @Override
        public void start(Stage primaryStage) {
            Pane pane = new Pane();
            Circle circle = new Circle(200, 200, 20, Color.GRAY);

            pane.getChildren().add(circle);
            Button up = new Button("w");
            Button down = new Button("s");
            Button left = new Button("a");
            Button right = new Button("d");
            Button upLeft = new Button("q");
            Button upRight = new Button("e");
            Button downLeft = new Button("z");
            Button downRight = new Button("c");
            Button redButton = new Button("წითელი");
            Button colorCycleButton = new Button("ფერის შეცვლა");
            GridPane controls = new GridPane();
            controls.setHgap(5);
            controls.setVgap(5);
            controls.add(upLeft, 0, 0);
            controls.add(up, 1, 0);
            controls.add(upRight, 2, 0);
            controls.add(left, 0, 1);
            controls.add(right, 2, 1);
            controls.add(downLeft, 0, 2);
            controls.add(down, 1, 2);
            controls.add(downRight, 2, 2);
            controls.add(redButton, 0, 3);
            controls.add(colorCycleButton, 2, 3);
            up.setOnAction(e -> circle.setCenterY(circle.getCenterY() - MOVE_STEP));
            down.setOnAction(e -> circle.setCenterY(circle.getCenterY() + MOVE_STEP));
            left.setOnAction(e -> circle.setCenterX(circle.getCenterX() - MOVE_STEP));
            right.setOnAction(e -> circle.setCenterX(circle.getCenterX() + MOVE_STEP));
            upLeft.setOnAction(e -> {
                circle.setCenterX(circle.getCenterX() - MOVE_STEP);
                circle.setCenterY(circle.getCenterY() - MOVE_STEP);
            });
            upRight.setOnAction(e -> {
                circle.setCenterX(circle.getCenterX() + MOVE_STEP);
                circle.setCenterY(circle.getCenterY() - MOVE_STEP);
            });
            downLeft.setOnAction(e -> {
                circle.setCenterX(circle.getCenterX() - MOVE_STEP);
                circle.setCenterY(circle.getCenterY() + MOVE_STEP);
            });
            downRight.setOnAction(e -> {
                circle.setCenterX(circle.getCenterX() + MOVE_STEP);
                circle.setCenterY(circle.getCenterY() + MOVE_STEP);
            });
            redButton.setOnAction(e -> circle.setFill(Color.RED));
            colorCycleButton.setOnAction(e -> {
                colorIndex = (colorIndex + 1) % colors.length;
                circle.setFill(colors[colorIndex]);
            });
            VBox root = new VBox(10, pane, controls);
            Scene scene = new Scene(root, 400, 400);
            primaryStage.setTitle("Circle Controller");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
//private int clickCount = 0;
//        private final String[] jokes = {
//                "ნეტა რას ელოდი?",
//                "კაი ჰა მიდი",
//                "ნუ მეხები",
//                "ბურღავ ტვინს თუ ვარჯიშობ?",
//                "სირცხვილისგან შენს ადგილას გავთიშავდი",
//                "ღილაკსაც აქვს გრძნობები, ამჟამად სირცხვილის",
//                "დასვენება არ გინდა?",
//                "ჰა აბა",
//                "ლოყაზე წითელი ხალი ხოარაგაქ?",
//                "მორჩა, შენ მოიგე"
//        };
//        @Override
//        public void start(Stage stage) {
//            Pane pane = new Pane();
//            pane.setPrefSize(400, 400);
//            Button btn = new Button("Click me");
//            btn.setLayoutX(180);
//            btn.setLayoutY(180);
//            Random rand = new Random();
//            btn.setOnAction(e -> {
//                clickCount++;
//                double newX = rand.nextDouble() * (pane.getWidth() - btn.getWidth());
//                double newY = rand.nextDouble() * (pane.getHeight() - btn.getHeight());
//                btn.setLayoutX(newX);
//                btn.setLayoutY(newY);
//                String msg = jokes[rand.nextInt(jokes.length)];
//                btn.setText(msg);
//            });
//            pane.getChildren().add(btn);
//            Scene scene = new Scene(pane);
//            stage.setTitle("Tვiნ is ბuრgი ღილაკი");
//            stage.setScene(scene);
//            stage.show();
//        }
//        public static void main(String[] args) {
//            launch();
//        }
//}