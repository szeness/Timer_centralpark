package actionlisteners;

import engine.ClockTimez;
import engine.RLTimeEng;
import sounds.WaveFile;
import gui.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static engine.ClockTimez.counterZahl;

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

               counterZahl = counterZahl>0 ? --counterZahl : 0;

                RLTimeEng.LOL=true;
                ClockTimez.runinT = true;


                RLTimeEng rlT = new RLTimeEng();

                rlT.setDaemon(true);
                rlT.start();


                new ClockTimez().setDaemon(true);
                new ClockTimez().start();




            }}

    }
}
