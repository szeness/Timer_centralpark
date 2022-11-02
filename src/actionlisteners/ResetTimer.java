package actionlisteners;
import engine.BlinkingFin;
import engine.ClockTimez;
import sounds.WaveFile;
import gui.Gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetTimer implements ActionListener  {
    @Override
    public void actionPerformed(ActionEvent e) {

        if (((JButton) e.getSource()).getText().equals("Reset") ) {




            if(WaveFile.soundclip!=null && WaveFile.soundclip.isActive()) {
                WaveFile.soundclip.stop();
                WaveFile.musiTogl = false;
            }

                Gui.panej.setText("\u21BA");

                ClockTimez.runinT = false;
                ClockTimez.pauseT = false;

                ClockTimez.counterZahl = !Gui.textfield1.getText().isEmpty() ? Integer.parseInt(Gui.textfield1.getText()) : 0;
                ClockTimez.counterSecs = !Gui.textfield2.getText().isEmpty() ? Integer.parseInt(Gui.textfield2.getText()) : 0;



                Gui.area.setText(ClockTimez.counterZahl + ":");
                ClockTimez.stat = ClockTimez.counterSecs;
                Gui.area2.setText(String.valueOf(ClockTimez.counterSecs));

                StartTimer.toggledStart = false;
                 BlinkingFin.endeAni = false;

        }

    }
}
