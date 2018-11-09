/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema.ui.movie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Phijak
 */
public class MovieListController implements Initializable {

    @FXML
    private AnchorPane test;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            FileInputStream seats_fileInputStream;
            seats_fileInputStream = new FileInputStream("C:\\wamp64\\www\\OOAD\\KMITL Cinema\\src\\cinema\\ui\\movie\\seat.png");
            Image seats_image = new Image(seats_fileInputStream,50,50,false,false);
            ImageView[] seats = new ImageView[30];

            for(int i = 0;i<30;i++){
                seats[i] = new ImageView(seats_image);
            }

            HBox seatsRaw_hbox[] = new HBox[5];
            VBox seatsLine_vbox = new VBox();

            for(int i=0;i<5;i++){
                seatsRaw_hbox[i]= new HBox();
                for(int j=0;j<6;j++){
                    seatsRaw_hbox[i].getChildren().addAll(seats[j]);             
                }
                seatsLine_vbox.getChildren().addAll(seatsRaw_hbox[i]);
            } 
                
            test.getChildren().add(seatsLine_vbox);
        } catch (FileNotFoundException ex) {    
            Logger.getLogger(MovieListController.class.getName()).log(Level.SEVERE, null, ex);
        }    

    }
    
}
