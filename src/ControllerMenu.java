import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControllerMenu {

    @FXML
    private TextField lblLogin;

    @FXML
    private TextField lblSenha;
    
    @FXML
    protected void Cadastrar(ActionEvent event) {
        App.ChangeScene("registrar");
    }

    @FXML
    protected void Entrar(ActionEvent event){
        if (lblLogin.getText().equals("adm") && lblSenha.getText().equals("adm")) {
            App.ChangeScene("welcome");
            lblLogin.setText("");
            lblSenha.setText("");
        }
        App.ComparaLoginSenha(lblLogin, lblSenha);
        
    }

}