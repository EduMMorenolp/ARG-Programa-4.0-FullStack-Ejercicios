package com.biblioteca;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Servidor");

        Label titleLabel = new Label("Servidor Biblioteca");
        titleLabel.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");

        Button btnApagar = new Button("Apagar");
        btnApagar.setOnAction(e -> {
            // Código para apagar el servidor (cerrar la aplicación)
            System.exit(0);
        });

        Button btnIrAPagina = new Button("Ir a la Página");
        btnIrAPagina.setOnAction(e -> {
            // Código para redirigir a una página (reemplaza la URL con tu página)
            String url = "http://localhost:8080/";
            HostServices hostServices = getHostServices();
            hostServices.showDocument(url);
        });

        // Usar un VBox para apilar verticalmente los botones
        VBox vbox = new VBox(10); // 10 es el espacio entre los nodos
        vbox.getChildren().addAll(titleLabel, btnIrAPagina, btnApagar);
        vbox.setAlignment(Pos.CENTER);

        // Usar un StackPane para centrar el VBox en la escena
        StackPane root = new StackPane();
        root.getChildren().add(vbox);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

        System.out.println("Servidor iniciado");
    }
}
