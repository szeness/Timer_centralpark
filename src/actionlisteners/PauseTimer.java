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
    public static boolean pauseToggled;


    @Override
    public void actionPerformed(ActionEvent e) {

        if (((JButton) e.getSource()).getText().equals("Pause")) {

            if(WaveFile.soundclip!=null && WaveFile.soundclip.isActive())
                WaveFile.soundclip.stop();
                WaveFile.musTogl = false;

            if(!pauseToggled && StartTimer.toggledStart) {

                pauseToggled = true;

                StartTimer.toggledStart = false;


                ClockTimez.pauseT = true;
                ClockTimez.runinT = false;


                pauseDiffCounter();


            }


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
