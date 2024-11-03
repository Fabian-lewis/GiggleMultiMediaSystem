import controllers.MediaController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("views/mediaPlayerView.fxml"));
            Scene scene = new Scene(loader.load());

            MediaController controller = loader.getController();
            controller.setStage(primaryStage);
            
            primaryStage.setScene(scene);
            primaryStage.setTitle("Multimedia Player");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}