package engine;
import gui.Gui;


public class BlinkingFin extends Thread implements Runnable {

    public static boolean endeAni;
    @Override
    public void run() {


        try {

            while(endeAni && !ClockTimez.runinT) {

                Gui.area.setText("00:00");
                Gui.area.setVisible(true);

                sleep(800);
                Gui.panej.setText("\u23F0");
                Gui.area.setText("    \u23F0");
                sleep(600);
                Gui.area.setVisible(false);


            }
            Gui.area.setVisible(true);






        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }






    }


}
