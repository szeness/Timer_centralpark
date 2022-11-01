package engine;
import actionlisteners.StartTimer;
import gui.Gui;
import java.time.LocalDateTime;
import java.util.Random;

import static engine.ClockTimez.*;

public class RLTimeEng extends Thread{

    public static int lol1;
    public static char e;
    static char[] unico = new char[] {14709,(char)10852, (char) 9909, (char) 77660, (char) 11059, (char) 9200,(char)11790,(char)13030, (char) 77748,(char)13164,
            (char)9717,(char)12875,(char)14533,(char)8733,(char)2224,(char)10080,(char)10283,(char)10523,(char) 5038,(char)
            9862,(char)1571,(char)562,(char)7781,(char)5209,(char)10912,(char)14385,(char)8175,(char)5034,(char)8871,(char)10451,(char)380,(char)2680,(char)3165,};
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

            while (now == rlTimecheck()) {

                if (!pauseT && runinT) {
                    if (lol1++ == 0) {
                        e = (char) new Random().nextInt(0, 15000);
                        Gui.area3.append(String.valueOf(e));
                        System.out.println("unicode: "+(int)e);
                        //Gui.panej.setText(String.valueOf(e));
                        System.out.println(e);
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
