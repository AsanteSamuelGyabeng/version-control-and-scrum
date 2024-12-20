module wordprocessor {
    requires javafx.controls;
    requires javafx.fxml;

    opens wordprocessor to javafx.fxml;
    exports wordprocessor;
}

