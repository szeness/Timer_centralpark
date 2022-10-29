import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Gui extends JFrame {



    public static JTextField textfield1;
    public static JTextArea area;
    public static JTextArea area2;
    public static ImageIcon bg2p = new ImageIcon(Objects.requireNonNull(Gui.class.getResource
                                         ("img/241295199_10227674595196311_8378346888603849515_n.jpg")));
    public JButton buttonTimerStop;
    public JLabel wp;
    public JFrame framzz;
    public JButton buttonTimer;



    public void run(){


        framzz = new Gui();
        framzz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framzz.setSize(480, 400);
        framzz.setVisible(true);
        framzz.setLocationRelativeTo(null);



        textfield1 = new JTextField();
        textfield1.setSize(50,20);
        textfield1.setLocation(200,100);
        framzz.add(textfield1);
        textfield1.setVisible(true);



        buttonTimer = new JButton("Start Timer");
        buttonTimer.setSize(100,50);
        buttonTimer.setLocation(300,200);
        buttonTimer.setBackground(new Color(0, 17, 52, 255));
        buttonTimer.setForeground(new Color(154, 147, 154, 255));
        framzz.add(buttonTimer);
        buttonTimer.setVisible(true);
        buttonTimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (((JButton) e.getSource()).getText().equals("Start Timer")) {

                    Timer timezz = new Timer();
                    if (!timezz.isAlive()) {
                        timezz.setDaemon(true);
                        timezz.start();


                    }}}});



        buttonTimerStop = new JButton("Exit");
        buttonTimerStop.setSize(100,50);
        buttonTimerStop.setLocation(300,250);
        buttonTimerStop.setBackground(new Color(0, 17, 52, 255));
        buttonTimerStop.setForeground(new Color(154, 147, 154, 255));
        framzz.add(buttonTimerStop);
        buttonTimerStop.setVisible(true);
        buttonTimerStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { if (((JButton) e.getSource()).getText().equals("Exit")) {

               System.exit(1);  ;}}});



        area = new JTextArea();
        area.setSize(100,50);
        area.setBackground(Color.BLACK);
        area.setFont(new Font("Arial", Font.BOLD, 30));
        area.setForeground(Color.YELLOW);
        area.setLocation(100,208);
        area.setOpaque(false);
        area.setFocusable(false);
        area.setVisible(true);
        framzz.add(area);



        area2 = new JTextArea();
        area2.setSize(100,50);
        area2.setBackground(Color.BLACK);
        area2.setFont(new Font("Arial", Font.BOLD, 30));
        area2.setForeground(Color.YELLOW);
        area2.setOpaque(false);
        area2.setFocusable(false);
        area2.setVisible(true);
        framzz.add(area2);



        wp = new JLabel();
        wp.setSize(600,400);
        wp.setIcon(bg2p);
        framzz.add(wp);
        wp.setVisible(true);
        wp.setVisible(false);
        wp.setVisible(true);

    }

}