module com.example.escaperoom {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.escaperoom to javafx.fxml;
    exports com.example.escaperoom;
}