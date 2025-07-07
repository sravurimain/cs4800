package org.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.hibernate.Session;

public class StudentForm {

    public void show() {
        Stage stage = new Stage();
        stage.setTitle("Add New Student");

        Label idLabel = new Label("Bronco ID:");
        TextField idField = new TextField();

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label addressLabel = new Label("Address:");
        TextField addressField = new TextField();

        Label degreeLabel = new Label("Degree:");
        TextField degreeField = new TextField();

        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            String broncoId = idField.getText();
            String name = nameField.getText();
            String address = addressField.getText();
            String degree = degreeField.getText();

            Student student = new Student(broncoId, name, address, degree);
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            session.close();

            idField.clear();
            nameField.clear();
            addressField.clear();
            degreeField.clear();
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(idLabel, idField, nameLabel, nameField,
                addressLabel, addressField, degreeLabel, degreeField, saveButton);

        stage.setScene(new Scene(layout, 300, 350));
        stage.show();
    }
}
