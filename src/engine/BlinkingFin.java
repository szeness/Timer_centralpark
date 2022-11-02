package engine;

import actionlisteners.StartTimer;
import gui.Gui;
import sounds.WaveFile;

public class BlinkingFin extends Thread implements Runnable {

    public static boolean endeAni;
    @Override
    public void run() {


        try {

            while(endeAni) {

                Gui.area.setVisible(false);
                sleep(400);
                Gui.area.setVisible(true);
                sleep(400);


            }






        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }






    }


}
