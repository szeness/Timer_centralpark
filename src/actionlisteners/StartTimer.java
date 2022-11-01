package actionlisteners;
import engine.ClockTimez;
import engine.RLTimeEng;
import sounds.WaveFile;
import gui.Gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import static engine.ClockTimez.counterZahl;
import static engine.ClockTimez.seczZeit;
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

            if (Gui.textfield1.getText().equals("jj")) {
                try {
                    if (!WaveFile.soundclip.isActive())
                        WaveFile.trackPlayz();
                } catch (NullPointerException exception) {
                    System.out.println("alles gut");
                }

            }else{

                 Gui.area.setText("(`,°)");

                 if(!toggledStart) {

                    if (!PauseTimer.toggle)
                        rlTimeGetStart(counterZahl);
                    else {
                        startDiffCounter();
                        PauseTimer.toggle = false;
                        ClockTimez.pauseT = false;
                    }

                    ClockTimez.runinT = true;

                    RLTimeEng rlT = new RLTimeEng();

                    rlT.setDaemon(true);
                    rlT.start();

                    toggledStart = true;

                }

            }
        }

    }
}
