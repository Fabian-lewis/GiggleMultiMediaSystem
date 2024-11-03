package controllers;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MediaController {
    private MediaPlayer mediaPlayer;
    private Stage stage;

    @FXML
    private MediaView mediaView; // Reference to MediaView for playing the video

    public void setStage(Stage stage){
        this.stage = stage;
    }

    @FXML
    public void loadMedia(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("Audio Files", "*.mp3"),
            new FileChooser.ExtensionFilter("Video Files", "*.mp4")
        );

        File selectedFile = fileChooser.showOpenDialog(stage);

        if(selectedFile != null){
            Media media = new Media(selectedFile.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mediaView.setMediaPlayer(mediaPlayer);
        }
    }
      // Method to play the media
      @FXML
      public void playMedia() {
        if (mediaPlayer != null) {
            mediaPlayer.play();
        }
    }

    // Method to pause the media
    @FXML
    public void pauseMedia() {
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    // Method to stop the media
    @FXML
    public void stopMedia() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }
    
}
