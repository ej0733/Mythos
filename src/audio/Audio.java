/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audio;

import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author eluiz
 */
public class Audio {       
    JFXPanel jfx = new JFXPanel();
    Media media;
    MediaPlayer mediaPlayer;
    
    public void abrir(String path){    
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
    }
    
    public void tocar(){
        mediaPlayer.play();
    }
    
    public void pausar(){
        mediaPlayer.pause();
    }
    
    public void fechar(){
        mediaPlayer.stop();
    }
    
    public void volume(double vol){
        mediaPlayer.setVolume(vol);
    }
}
