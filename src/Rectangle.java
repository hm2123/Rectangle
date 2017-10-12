/**
 * author:Hamid Majeed
 * date:10/04/17
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

public class Rectangle extends Application {
    @Override
    public void start(Stage primaryStage){
        TextInputDialog textinputdialog = new TextInputDialog ("Geometric Calculator");// creates a text dialog to take inoout from the user
        textinputdialog.setHeaderText("Input the width and height of the rectangle seperated by a space");
        Optional<String> result = textinputdialog.showAndWait();
        String [] side = result.get().split(" ");
        double width = Double.parseDouble(side[0]); /* double the width and double the area : this is the math to get the perimeter and area*/
        double height = Double.parseDouble(side[1]);
        double perimeter = 2*width + 2*height;
        double are = width * height;


        Alert alert = new Alert(AlertType.INFORMATION);// alert box
        alert.setContentText("The perimeter of the rectangle is " + perimeter);
        alert.showAndWait();

        Alert area = new Alert(AlertType.INFORMATION);
        area.setContentText(" The area of the rectangle is " + are );
        area.showAndWait();


    }
}
