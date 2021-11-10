import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class App extends Application {

    private static Stage stage;
    private static Scene mainScene;
    private static Scene detailsScene;
    private static Scene welcomeScene;
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

        FXMLLoader fxmlWelcome = new FXMLLoader(getClass().getResource("Layouts/welcomeSystem.fxml"));
        root = fxmlWelcome.load();
        welcomeScene = new Scene(root);


        primaryStage.setScene(mainScene);

        primaryStage.show();

        System.out.println("Para entrar no sistema sem se cadastrar basta colocar login: adm, senha: adm");
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
            case "welcome":
                stage.setScene(welcomeScene);
                break;
        
            default:
                break;
        }
    }
    public static void ComparaLoginSenha(TextField login, TextField senha) {
        for (int i = 0; i < ArrayDeLista.getAEmails().size(); i++) {
            if (ArrayDeLista.getAEmails().get(i).equals(login.getText()) && ArrayDeLista.getASenhas().get(i).equals(senha.getText())) {
                ChangeScene("welcome");
            }
        }
    }
}
