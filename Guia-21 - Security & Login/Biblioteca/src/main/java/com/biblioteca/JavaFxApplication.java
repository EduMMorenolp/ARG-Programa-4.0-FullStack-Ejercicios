package com.biblioteca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Servidor");

        Button btn = new Button();
        btn.setText("Apagar");
        btn.setOnAction(e -> {
            // Código para apagar el servidor (cerrar la aplicación)
            System.exit(0);
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

        System.out.println("Servidor iniciado");
    }
}
