package actionlisteners;

import engine.ClockTimez;
import sounds.WaveFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import static engine.ClockTimez.seczZeit;


public class PauseTimer implements ActionListener {

    public static int pauseDiff;
    public static boolean toggle;


    @Override
    public void actionPerformed(ActionEvent e) {

        if (((JButton) e.getSource()).getText().equals("Pause")) {


            if(!toggle) {

                StartTimer.toggledStart = false;

                toggle = true;

                ClockTimez.pauseT = true;
                ClockTimez.runinT = false;
                ClockTimez.counterZahl++;

                pauseDiffCounter();


            }
            if(WaveFile.soundclip!=null && WaveFile.soundclip.isActive())
                WaveFile.soundclip.stop();

        }

    }

    public static int pauseDiffCounter() {

        LocalDateTime date = LocalDateTime.now();
        int startSPause = date.toLocalTime().toSecondOfDay();
        PauseTimer.pauseDiff = seczZeit - startSPause;
        System.out.println("pauseDiff = " + pauseDiff);


        return(PauseTimer.pauseDiff);
    }

}
