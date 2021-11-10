import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ControllerRegistrar {

    ArrayList<String> lista = new ArrayList<String>();
    private static ArrayList<String> listaCadastro = new ArrayList<String>();

    public static void setListaCadastro(ArrayList<String> listaCadastro) {
        ControllerRegistrar.listaCadastro = listaCadastro;
    }

    public static ArrayList<String> getListaCadastro() {
        return ControllerRegistrar.listaCadastro;
    }

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
        String email = lblEmail.getText(); 
        String senha = lblSenha.getText();

        ArrayDeLista.setAEmails(email);
        ArrayDeLista.setASenhas(senha);

        lblEmail.setText("");
        lblSenha.setText("Registrado");

    }
}