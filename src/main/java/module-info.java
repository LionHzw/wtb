module de.lionhzw.wtb {
    requires javafx.controls;
    requires javafx.fxml;

    opens de.lionhzw.wtb to javafx.fxml;
    exports de.lionhzw.wtb;
}