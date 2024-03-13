module graficos.graficos {
    requires javafx.controls;
    requires javafx.fxml;

    opens graficos.graficos to javafx.fxml;
    exports graficos.graficos;
}
