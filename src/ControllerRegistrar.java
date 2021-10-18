import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControllerRegistrar {
    @FXML
    private TextField lblEmail;

    @FXML
    private TextField lblSenha;

    
    @FXML
    protected void Voltar(ActionEvent event) {
        App.ChangeScene("main");
    }

    @FXML
    protected void Cadastrar(ActionEvent event){
        ArrayDeLista lista = new ArrayDeLista();
        String email = lblEmail.getText();
        String senha = lblSenha.getText();

        lista.getAEmails().add(email);
        lista.getASenhas().add(senha);
    }
}