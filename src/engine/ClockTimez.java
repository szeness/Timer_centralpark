package engine;


import gui.Gui;
import sounds.WaveFile;

import java.time.LocalDateTime;

import static engine.RLTimeEng.LOL;

public class ClockTimez extends Thread {


    public static int stat = 59;
    public static int seczZeit;
    public static boolean runinT,pauseT;
    public static int iiii,c=200;
    public static int counterZahl = !Gui.textfield1.getText().isEmpty() ? Integer.parseInt(Gui.textfield1.getText()) : 0;




    public void run() {}


    public static void countingAlgo()  {

        if (runinT) {





                Gui.area.setText(counterZahl + ":");

                if (Integer.toString(counterZahl).length() == 1) {
                    Gui.area.setText("0" + (counterZahl + ":"));
                } else {
                    Gui.area.setText(counterZahl + ":");
                }


                Gui.area2.setLocation(115 + ((Gui.area.getText().length() - 1) * 15), 208);

                if (Integer.toString(stat).length() == 1) {
                    Gui.area2.setText("0" + (stat));
                } else {
                    Gui.area2.setText(Integer.toString(stat));
                }


                stat--;
                if (stat == 0) {
                    stat = 59;
                    counterZahl = counterZahl > 0 ? --counterZahl : 0;
                    Gui.area.setText(counterZahl + ":");
                }
            }

        }


    public static void finTime(int loops) throws InterruptedException {

        Gui.area2.setText("");
        Gui.area.setText("F I N");

          for (int i = 0; i < loops; i++) {
            WaveFile.trackPlayz();
            sleep(10000);
         }


    }



}
