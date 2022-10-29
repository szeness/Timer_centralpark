import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public class Timer extends Thread {



    public void run() {

        long timez = !Gui.textfield1.getText().isEmpty() ? Long.parseLong(Gui.textfield1.getText()) : 0;


        try {
            ClockTimez.cl.setDaemon(true);
            ClockTimez.cl.start();

            sleep(60000* timez + 1800);
            trackPlayz();

            for (int i = 0; i < 10; i++) {

                sleep(10000);
                trackPlayz();

            }

        } catch (InterruptedException e) {e.printStackTrace();}

    }

    public static void trackPlayz(){
        File sound = new File("C:/Users/Student/Desktop/syam.wav");
        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(sound);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        try {
            clip.open(audioStream);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        clip.start();
        while (clip.isActive())
            clip.stop();
    }
}
