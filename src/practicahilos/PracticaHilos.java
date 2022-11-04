/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahilos;

import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author lfern
 */
public class PracticaHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        new HilosArreglo().setVisible(true);

//     AudioFileFormat.Type[] tipos = AudioSystem.getAudioFileTypes();
//        for (AudioFileFormat.Type tipo : tipos) {
//            System.out.println(tipo.getExtension());
//        }
//        Clip sonido = AudioSystem.getClip();
//        File cancion = new File("C:\\Users\\lfern\\Desktop\\Música/EXTASIS.wav");
//        sonido.open(AudioSystem.getAudioInputStream(cancion));
//        sleep(1000);
//        sonido.start();
//        while (sonido.isRunning()) {
//            sleep(1000);
//        }
    }

}
