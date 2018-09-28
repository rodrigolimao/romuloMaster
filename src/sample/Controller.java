package sample;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;

public class Controller implements Initializable {

    @FXML
    private ComboBox<LiquidSoap> comboBox;
    @FXML
    private Label label;
    @FXML
    private ImageView imageView;


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        comboBox.setPromptText("Choose Soap");
        label.setText("");

        LiquidSoap soap1 = new LiquidSoap("Palmolive","Dish",887, new Image("palmolive.jpg"));
        LiquidSoap soap2 = new LiquidSoap("Meyers","Hand",370, new Image("meyers.jpg"));
        LiquidSoap soap3 = new LiquidSoap("Soft Soap","Hand",236, new Image("lemon.jpg"));
        LiquidSoap soap4 = new LiquidSoap("Murphys","Floor",473, new Image("murphys.jpg"));
        LiquidSoap soap5 = new LiquidSoap("Dawn","Dish",8000, new Image("dawn.jpg"));

        this.comboBox.getItems().add(soap1);
        this.comboBox.getItems().add(soap2);
        this.comboBox.getItems().add(soap3);
        this.comboBox.getItems().add(soap4);
        this.comboBox.getItems().add(soap5);

    }

    public void comboBoxWasUpdated()
    {
        this.label.setText("Soap selected: \n" + comboBox.getValue().toString2());
        this.imageView.setImage(comboBox.getValue().getImageFile());
    }
}

