/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package idiomasistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.util.Locale;
import javafx.scene.control.Button;

/**
 *
 * @author arthu_uhkw4r8
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label lbIdioma;
    @FXML
    private Button btnClick;
    @FXML
    private Label lbLocal;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        Locale idioma = 
                new Locale("Português", "Brasil");
        lbIdioma.setText("A linguagem deste dispositivo é " + idioma.getLanguage());
        lbLocal.setText("O País ao qual ele está inserido é " + idioma.getCountry());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
