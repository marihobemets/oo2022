module com.example.proovikontrolltoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proovikontrolltoo to javafx.fxml;
    exports com.example.proovikontrolltoo;
}