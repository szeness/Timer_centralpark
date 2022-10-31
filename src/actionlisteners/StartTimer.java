package actionlisteners;

import engine.ClockTimez;
import sounds.WaveFile;
import gui.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartTimer implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        if (((JButton) e.getSource()).getText().equals("Start")) {

            if (Gui.textfield1.getText().equals("jj")) {
                try {
                    if(!WaveFile.soundclip.isActive())
                        WaveFile.trackPlayz();
                }catch(NullPointerException exception){
                    System.out.println("alles gut");
                    WaveFile.trackPlayz();
                }
            }

            else{

                ClockTimez.runinT = true;

                new ClockTimez().setDaemon(true);
                new ClockTimez().start();



            }}

    }
}
