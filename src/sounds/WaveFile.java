package sounds;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class WaveFile extends Thread {

    public static Clip soundclip;
    public static boolean musiTogl;
    public static String path = System.getProperty("user.dir");

    public static File sound = new File(path+"\\out\\production\\timerLAc\\sounds/syam.wav");


    public static void trackPlayz() {

        try {


            if (!musiTogl) {
                musiTogl = true;
                System.out.println(path);


                AudioInputStream audioStream = AudioSystem.getAudioInputStream(sound);
                soundclip = AudioSystem.getClip();
                soundclip.open(audioStream);

                soundclip.start();





            }
            } catch(LineUnavailableException | UnsupportedAudioFileException |
                    IOException e){
                e.printStackTrace();
            } catch(NullPointerException e){
                System.out.println("file nicht gefunden");
            }


    }




    public void run() {


          /*      for(int i =mainCount;i<12000 * timez;i++) {
                    if (Engines.ClockTimez.runinT) {
                        if (!Engines.ClockTimez.pauseT){
                            mainCount = 0;
                            sleep(5);

                        } else {
                            mainCount = i;
                            break;
                        }
                    }else{
                        if(!Engines.ClockTimez.pauseT) {
                            mainCount = 0;
                            break;
                        }
                    }
                }*/
    }


}