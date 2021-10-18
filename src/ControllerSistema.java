import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerSistema {
    
    @FXML
    protected void Voltar(ActionEvent event) {
        App.ChangeScene("main");
    }
}
