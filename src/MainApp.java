import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private static Stage secondaryStage;
    private Parent panel1, panel2;
    private Scene primaryScene;
    private Scene secondaryScene;


    @Override
    public void start(Stage primaryStage) throws IOException {
        // Инициализация окна #1
        createPrimaryStage(primaryStage);
        // Инициализация окна #2
        createSecondaryStage();


        //javafx.scene.control.TableView tableView = (javafx.scene.control.TableView) panel2.lookup("#matrix");
        //tableView.setItems();


//        // Тест графа
//        Node node1 = new Node(50, 50, 10);
//        Node node2 = new Node(50, 100, 10);
//        PathLine pl = new PathLine(node1, node2, 1);
//        graphCanvas.addNode(node1);
//        graphCanvas.addNode(node2);
//        graphCanvas.addPath(pl);
//        graphCanvas.repaint();


    }

    private void createPrimaryStage(Stage stage) throws IOException {
        panel1 = FXMLLoader.load(getClass().getResource("mainApp.fxml"));
        primaryScene = new Scene(panel1, 800, 530);
        GraphCanvas graphCanvas = new GraphCanvas(panel1);
        stage.getIcons().add(new Image("file:iconv2.png"));
        stage.setTitle("Визуализация движения частиц по регулярным сетям");
        stage.setScene(primaryScene);
        stage.show();
    }

    private void createSecondaryStage() throws IOException {
        panel2 = FXMLLoader.load(getClass().getResource("secondWindow.fxml"));
        secondaryScene = new Scene(panel2, 363, 363);
        secondaryStage = new Stage();
        secondaryStage.getIcons().add(new Image("file:iconv2.png"));
        secondaryStage.setTitle("Матрица смежности");
        secondaryStage.setScene(secondaryScene);
    }

    public static void openSecondaryStage() {
        secondaryStage.show();
    }
}