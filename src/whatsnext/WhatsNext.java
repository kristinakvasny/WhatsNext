/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatsnext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Phil
 */
public class WhatsNext extends Application {
    
    private static PersistentDataCntl theDataCntl;
    @Override
    public void start(Stage stage) throws Exception {
        
        LoginCntl theLoginCntl = new LoginCntl(stage);
        theDataCntl = PersistentDataCntl.getPersistentDataCntl();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
