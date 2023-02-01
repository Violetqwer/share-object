module com.example.windows1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.windows1 to javafx.fxml;
    exports com.example.windows1;
}