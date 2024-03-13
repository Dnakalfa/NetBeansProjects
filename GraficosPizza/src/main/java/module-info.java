module graficos.graficospizza {
    requires javafx.controls;
    requires javafx.fxml;

    opens graficos.graficospizza to javafx.fxml;
    exports graficos.graficospizza;
}
