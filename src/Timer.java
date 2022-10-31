import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;

public class Timer extends Thread {

    public static Clip soundclip;

    public static String path;

    static {
        try {
            path = String.valueOf(Timer.class.getResource("/img/syam.wav").toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    ;



    public static void trackPlayz() {

        try {

            System.out.println(path);

            File sound = new File(Timer.class.getResource("/img/syam.wav").toURI());

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(sound);
            soundclip = AudioSystem.getClip();
            soundclip.open(audioStream);

            soundclip.start();



            } catch (LineUnavailableException e) {e.printStackTrace();} catch (IOException e) {e.printStackTrace();
            } catch (UnsupportedAudioFileException e) {e.printStackTrace();
            } catch (NullPointerException e) {
            System.out.println("file nicht gefunden");
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }

    public void run() {


        long timez = !Gui.textfield1.getText().isEmpty() ? Long.parseLong(Gui.textfield1.getText()) : 0;

        if (timez != 0) {


            new ClockTimez().setDaemon(true);
            new ClockTimez().start();

          /*      for(int i =mainCount;i<12000 * timez;i++) {
                    if (ClockTimez.runinT) {
                        if (!ClockTimez.pauseT){
                            mainCount = 0;
                            sleep(5);

                        } else {
                            mainCount = i;
                            break;
                        }
                    }else{
                        if(!ClockTimez.pauseT) {
                            mainCount = 0;
                            break;

                        }
                    }
                }
*/


        }

    }


    }
