package actionlisteners;
import engine.BlinkingFin;
import engine.ClockTimez;
import engine.RLTimeEng;
import sounds.WaveFile;
import gui.Gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import static engine.ClockTimez.*;
import static engine.RLTimeEng.rlTimeGetStart;


public class StartTimer implements ActionListener {

    public static boolean toggledStart;

    public static void startDiffCounter() {

        int pausiertSEc = seczZeit;
        LocalDateTime date = LocalDateTime.now();
        int startSResume = date.toLocalTime().toSecondOfDay();
        seczZeit  =  PauseTimer.pauseDiff + startSResume;
        System.out.println("neue Endesec = " + seczZeit+ "   <"+(seczZeit-pausiertSEc) + " Sek. pausiert>");

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (((JButton) e.getSource()).getText().equals("Start")) {




            Gui.panej.setText("(`,°)");


            if (Gui.textfield1.getText().equals("jj")) {
                try {
                    Gui.panej.setText("(`,°)");
                    WaveFile.trackPlayz();
                    WaveFile.musiTogl = true;
                    Gui.panej.setText(String.valueOf((char)9835));
                    System.out.println("wtf");
                } catch (NullPointerException exception) {
                    throw exception;
                    //System.out.println("alles gut");
                }

            }else if(!toggledStart && !BlinkingFin.endeAni &&(!Gui.textfield1.getText().isEmpty()
                    || !Gui.textfield2.getText().isEmpty() )) {
                    toggledStart = true;

                if (!PauseTimer.pauseToggled)
                    try {
                        rlTimeGetStart(counterZahl);
                    } catch (ExceptionInInitializerError exception) {

                    }
                else {

                    startDiffCounter();
                    PauseTimer.pauseToggled = false;
                    ClockTimez.pauseT = false;
                }

                ClockTimez.runinT = true;

                RLTimeEng rlT = new RLTimeEng();


                rlT.setDaemon(true);
                rlT.start();
                Gui.panej.setText(("\u25B6"));


            }


        }

    }
}
