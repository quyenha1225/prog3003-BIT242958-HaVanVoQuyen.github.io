package Bai_4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        TextField celsiusField = new TextField();
        celsiusField.setPromptText("Nhập nhiệt độ Celsius");

        Button convertBtn = new Button("Chuyển sang Fahrenheit");

        Label resultLabel = new Label("Kết quả sẽ hiển thị ở đây");

        convertBtn.setOnAction(e -> {
            try {
                double c = Double.parseDouble(celsiusField.getText());
                double f = c * 9 / 5 + 32;
                resultLabel.setText("Fahrenheit: " + f);
            } catch (Exception ex) {
                resultLabel.setText("Vui lòng nhập số hợp lệ!");
            }
        });

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(celsiusField, convertBtn, resultLabel);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Chuyển đổi nhiệt độ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}