import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private static Stage stage;
    private static Scene mainScene;
    private static Scene detailsScene;
    private Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        primaryStage.setTitle("Interface");

        FXMLLoader fxmlMain = new FXMLLoader(getClass().getResource("Layouts/principal.fxml"));
        root = fxmlMain.load();
        mainScene = new Scene(root);

        FXMLLoader fxmlRegistrar = new FXMLLoader(getClass().getResource("Layouts/registrar.fxml"));
        root = fxmlRegistrar.load();
        detailsScene = new Scene(root);

        primaryStage.setScene(mainScene);

        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
    /**
     * Função para trocar as Cenas/Telas.
     * @param src Nesse parametro é colocado a tela onde o programa/logica deve ir.
     */
    public static void ChangeScene(String src) {
        switch (src) {
            case "main":
                stage.setScene(mainScene);
                break;
            case "registrar":
                stage.setScene(detailsScene);
                break;
        
            default:
                break;
        }
    }
}
