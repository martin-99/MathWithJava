package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField a ;
    @FXML
    TextField b;
    @FXML
    TextField c;

    public  double findDiscriminat(){
        int A = Integer.parseInt(a.getText());
        double B = Double.parseDouble(b.getText());
        int C = Integer.parseInt(c.getText());

        double descrimininat = Math.pow(B,2)-4*A*C;

        System.out.println("Descriminant = "+descrimininat);
        return descrimininat;
    }
public void findX1AndX2(){
    int A = Integer.parseInt(a.getText());
    double B = Double.parseDouble(b.getText());
    int C = Integer.parseInt(c.getText());
        double X1 =  -B + Math.sqrt(findDiscriminat())/2*A;
        double X2 =  -B - Math.sqrt(findDiscriminat())/2*A;

    System.out.println(X1);
    System.out.println(X2);
}
}
