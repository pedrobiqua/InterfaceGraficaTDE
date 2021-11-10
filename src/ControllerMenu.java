import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControllerMenu {

    @FXML
    private TextField lblLogin;

    @FXML
    private TextField lblSenha;
    /**
     * Botão para trocar de cena
     * @param event
     */
    @FXML
    protected void Cadastrar(ActionEvent event) {
        App.ChangeScene("registrar");
    }

    /**
     * Botão para entrar no sistema
     * @param event
     */
    @FXML
    protected void Entrar(ActionEvent event){
        if (lblLogin.getText().equals("adm") && lblSenha.getText().equals("adm")) {
            lblLogin.setText("");
            lblSenha.setText("");
            App.ChangeScene("welcome");
            
        }
        App.ComparaLoginSenha(lblLogin, lblSenha); //Usando função escrita no main.
        
    }

}