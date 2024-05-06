import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
	
public class DrawLines extends Application {
   @Override
	public void start(Stage stage) throws Exception {

parent root = 
	FXMLLoader.load(getClass().getResource("DrawLines.fxml"));

Scene scene = new Scene(root);
stage.setTitle("Draw Lines");
Stage.setScene(scene);
stage.show();

}

public static void main(String[] args) {
launch(args);
}
}