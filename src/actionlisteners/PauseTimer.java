package actionlisteners;

import engine.ClockTimez;
import sounds.WaveFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PauseTimer implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

        if (((JButton) e.getSource()).getText().equals("Pause")) {

            if(WaveFile.soundclip!=null && WaveFile.soundclip.isActive())
                WaveFile.soundclip.stop();

            if(ClockTimez.runinT)
            {

                ClockTimez.pauseT = true;
                ClockTimez.runinT = false;

            }




        }

    }
}
