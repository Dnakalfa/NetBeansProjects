package graficos.graficos;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import javafx.stage.Stage;
public class App extends Application {
    private final String IMG_URL1 = "https://bit.ly/2Pxqady";
    private final String IMG_URL2 = "https://bit.ly/2EZlriY";
    private final String IMG_URL3 = "https://bit.ly/3fylvmj";
    private final String IMG_URL4 = "https://bit.ly/3iaOOgk";   
    @Override
    public void start(Stage janela) {
        Text texto = new Text("Aplicação Exibe Imagens");
        texto.setTranslateX(50);
        texto.setTranslateY(20);
        Image img1 = new Image(IMG_URL1);
        ImageView view1 = new ImageView(img1);
        view1.setTranslateX(100);
        view1.setTranslateY(30);
        Image img2 = new Image(IMG_URL2);
        ImageView view2 = new ImageView(img2);
        view2.setTranslateX(100);
        view2.setTranslateY(90);
        Image img3 = new Image(IMG_URL3);
        ImageView view3 = new ImageView(img3);
        view3.setTranslateX(100);
        view3.setTranslateY(160);
        Image img4 = new Image(IMG_URL4);
        ImageView view4 = new ImageView(img4);
        view4.setTranslateX(100);
        view4.setTranslateY(220);         
        Group grupo = new Group();
        grupo.getChildren().addAll(texto, view1, view2, view3, view4);
        Scene cena = new Scene(grupo, 260, 300);
        janela.setTitle("Aplicação Manipula Imagens");
        janela.setScene(cena);
        janela.show();
      } 
}