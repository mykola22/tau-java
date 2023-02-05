module com.example.taujava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taujava to javafx.fxml;
    exports com.example.taujava;
}