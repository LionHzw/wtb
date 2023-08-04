module de.lionhzw.wtb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;

    opens de.lionhzw.wtb to javafx.fxml;
    exports de.lionhzw.wtb;
}