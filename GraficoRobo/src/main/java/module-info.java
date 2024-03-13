module graficos.graficorobo {
    requires javafx.controls;
    requires javafx.fxml;

    opens graficos.graficorobo to javafx.fxml;
    exports graficos.graficorobo;
}
