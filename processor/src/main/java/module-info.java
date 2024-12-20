module word.processor {
    requires javafx.controls;
    requires javafx.fxml;

    opens wordprocessor to javafx.fxml;
    opens wordprocessor.controllers to javafx.fxml;
    exports wordprocessor;
}

