/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author arthu_uhkw4r8
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblResolucao;
    private Button btnClick;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        Dimension resolucao
             = Toolkit.getDefaultToolkit().getScreenSize();
        int altura = (int)resolucao.getWidth();
        int largura = (int)resolucao.getHeight();
        lblResolucao.setText("A Resolução do seu sistema é " + altura + "X" + largura);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
