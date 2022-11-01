package engine;

import actionlisteners.PauseTimer;
import gui.Gui;

import java.time.LocalDateTime;
import java.util.Random;

import static engine.ClockTimez.*;

public class RLTimeEng extends Thread{




    @Override
    public void run() { try {


            RlUmrechner();



        } catch (InterruptedException e) {throw new RuntimeException(e);}
    }



    public static void RlUmrechner() throws InterruptedException {

        char e = 0;

        while (runinT) {


            int now = rlTimecheck();
            System.out.println(now);

            while (now == rlTimecheck()) {
                if(!pauseT) {
                    sleep(70);
                   // e = (char) new Random().nextInt(65,122);
                    Gui.area3.append(String.valueOf(e++));
                    if(Gui.area3.getText().length() > 9)
                        Gui.area3.setText("");
                }
            }
            countingAlgo();

        }
    }

    public static int rlTimecheck() throws InterruptedException {

        LocalDateTime date = LocalDateTime.now();
        int nowSec = date.toLocalTime().toSecondOfDay();

        if(nowSec >= seczZeit) {
            System.out.println("finfin");
            finTime(2);
        }
        return nowSec;
    }

    public static void rlTimeGetStart(int min) {

        LocalDateTime date = LocalDateTime.now();
        int startS = date.toLocalTime().toSecondOfDay();
        int dur = min * 60;
        seczZeit = startS + dur;
        System.out.println("endesec = " + seczZeit);

    }
}
