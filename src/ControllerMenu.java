import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerMenu {
    
    @FXML
    protected void Cadastrar(ActionEvent event) {
        App.ChangeScene("registrar");
    }

    @FXML
    protected void Entrar(ActionEvent event){
        App.ChangeScene("welcome");
    }

}