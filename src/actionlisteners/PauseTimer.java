package actionlisteners;

import engine.ClockTimez;
import engine.RLTimeEng;
import gui.Gui;
import sounds.WaveFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import static engine.ClockTimez.seczZeit;


public class PauseTimer implements ActionListener {

    public static int pauseDiff;
    public static boolean pauseToggled;

    public static int pauseDiffCounter() {

        LocalDateTime date = LocalDateTime.now();
        int startSPause = date.toLocalTime().toSecondOfDay();
        PauseTimer.pauseDiff = seczZeit - startSPause;
        System.out.println("pauseDiff = " + pauseDiff);


        return(PauseTimer.pauseDiff);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (((JButton) e.getSource()).getText().equals("Pause")) {

            if(!pauseToggled && StartTimer.toggledStart) {

                ClockTimez.runinT = false;

                StartTimer.toggledStart = false;


                Gui.panej.setText(("\u2615"));
                ClockTimez.pauseT = true;
                pauseToggled = true;

                pauseDiffCounter();




            }


            if(WaveFile.soundclip!=null && WaveFile.soundclip.isActive()) {
                WaveFile.soundclip.stop();
                WaveFile.musTogl = false;
            }




        }

    }



}
