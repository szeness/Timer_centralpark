package actionlisteners;
import engine.ClockTimez;
import sounds.WaveFile;
import gui.Gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetTimer implements ActionListener  {
    @Override
    public void actionPerformed(ActionEvent e) {

        if (((JButton) e.getSource()).getText().equals("Reset")) {

            if(WaveFile.soundclip!=null && WaveFile.soundclip.isActive())
                WaveFile.soundclip.stop();
            else {

                ClockTimez.runinT = false;
                ClockTimez.pauseT = false;
                StartTimer.toggledStart = false;
                ClockTimez.counterZahl = !Gui.textfield1.getText().isEmpty() ? Integer.parseInt(Gui.textfield1.getText()) : 0;

                Gui.area.setText(ClockTimez.counterZahl + ":");
                ClockTimez.stat = 59;
                Gui.area2.setText("00");
            }
        }

    }
}
