package engine;
import actionlisteners.StartTimer;
import gui.Gui;
import java.time.LocalDateTime;
import java.util.Random;

import static engine.ClockTimez.*;

public class RLTimeEng extends Thread{

    public static int lol1;
    public static char e;

    @Override
    public void run() { try {

        StartTimer.toggledStart = true;

            RlUmrechner();



        } catch (InterruptedException e) {throw new RuntimeException(e);}
    }



    public static void RlUmrechner() throws InterruptedException {



        while (runinT) {

            int now = rlTimecheck();
            System.out.println(now);

            while (now == rlTimecheck() && runinT) {

                if (!pauseT && runinT) {
                    if (lol1++ == 0) {
                        e = (char) new Random().nextInt(0, 15000);
                        Gui.area3.append(String.valueOf(e));
                        //System.out.println("unicode: "+(int)e);
                        //Gui.panej.setText(String.valueOf(e));
                        //System.out.println(e);
                        if (Gui.area3.getText().length() > 9)
                            Gui.area3.setText("");


                    }
                    sleep(1);
                    if (lol1 == 55) lol1=0;




                }
            }

            countingAlgo();
        }
    }

    public static int rlTimecheck() throws InterruptedException {

        LocalDateTime date = LocalDateTime.now();
        int nowSec = date.toLocalTime().toSecondOfDay();

        if(nowSec == seczZeit) {
            System.out.println("finfin");
            finTime(2);
        }
        return nowSec;
    }

    public static void rlTimeGetStart(int min) {

        LocalDateTime date = LocalDateTime.now();
        int startS = date.toLocalTime().toSecondOfDay();
        int dur = min * 60;
        stat = ClockTimez.counterSecs;
        seczZeit = startS + dur + stat;
        System.out.println("endesec = " + seczZeit);

    }
}
