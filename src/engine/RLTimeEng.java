package engine;

import java.time.LocalDateTime;

import static engine.ClockTimez.*;

public class RLTimeEng extends Thread{


    public static boolean LOL;

    @Override
    public void run() {

        rlTimeGetStart(counterZahl);

        try {

            RlUmrechner();



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void RlUmrechner() throws InterruptedException {

        while (runinT) {

            LOL = false;
            int now = rlTimecheck();

            while (now == rlTimecheck()) {
                if (runinT)
                    sleep(1);
            }
            LOL=true;
            countingAlgo();
            System.out.println(now);

        }

    }

    public static int rlTimecheck() throws InterruptedException {

        LocalDateTime date = LocalDateTime.now();
        int nowSec = date.toLocalTime().toSecondOfDay();

        if(nowSec >= seczZeit) {
            System.out.println("finfin");
            finTime(1);
        }
        return nowSec;
    }

    public static void rlTimeGetStart(int min) {

        LocalDateTime date = LocalDateTime.now();
        int startS = date.toLocalTime().toSecondOfDay();
        int dur = min * 60;
        seczZeit = startS + dur;
        System.out.println(seczZeit);

    }

}
