

public class Timer extends Thread {


    public static int mainCount = 0;

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

        public static void trackPlayz() {
        /*File sound = new File("C:/Users/Student/Desktop/syam.wav");
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
            clip.stop();*/
        }

}
