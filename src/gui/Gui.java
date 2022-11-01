package gui;

import actionlisteners.PauseTimer;
import actionlisteners.ResetTimer;
import actionlisteners.StartTimer;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.util.Objects;

public class Gui extends JFrame {


    public static StyledDocument doc;
    public static JTextField textfield1;
    public static JTextArea area,area2,area3;
    public static JTextPane panej;
    public static ImageIcon bg2p = new ImageIcon(Objects.requireNonNull(Gui.class.getResource
            ("img/241295199_10227674595196311_8378346888603849515_n.jpg")));
    public JButton buttonTimerStop,buttonTimerReset,buttonTimer;
    public JLabel wp;
    public JFrame framzz;




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

        buttonTimer = new JButton("Start");
        buttonTimer.setSize(100,50);
        buttonTimer.setLocation(300,200);
        buttonTimer.setBackground(new Color(196, 188, 98, 255));
        buttonTimer.setForeground(new Color(54, 147, 154, 255));
        framzz.add(buttonTimer);
        buttonTimer.setVisible(true);
        buttonTimer.addActionListener(new StartTimer());


        buttonTimerStop = new JButton("Pause");
        buttonTimerStop.setSize(100,50);
        buttonTimerStop.setLocation(300,250);
        buttonTimerStop.setBackground(new Color(178, 105, 153, 255));
        buttonTimerStop.setForeground(new Color(76, 167, 173, 255));
        framzz.add(buttonTimerStop);
        buttonTimerStop.setVisible(true);
        buttonTimerStop.addActionListener(new PauseTimer());


        buttonTimerReset = new JButton("Reset");
        buttonTimerReset.setSize(100,50);
        buttonTimerReset.setLocation(300,300);
        buttonTimerReset.setBackground(new Color(123, 192, 177, 255));
        buttonTimerReset.setForeground(new Color(252, 140, 142, 255));
        framzz.add(buttonTimerReset);
        buttonTimerReset.setVisible(true);
        buttonTimerReset.addActionListener(new ResetTimer());

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




        /*panej = new JTextPane();
        doc = panej.getStyledDocument();
        panej.setLocation(104,333);
        panej.setSize(120,50);
        panej.setOpaque(false);
        panej.setContentType("text/html; charset=UTF-8");
        panej.setFont(new Font("Arial Unicode MS",Font.BOLD,12));
        framzz.getContentPane().add(panej, BorderLayout.CENTER);*/




        area2 = new JTextArea();
        area2.setSize(100,50);
        area2.setBackground(Color.BLACK);
        area2.setFont(new Font("Arial", Font.BOLD, 30));
        area2.setForeground(Color.YELLOW);
        area2.setOpaque(false);
        area2.setFocusable(false);
        area2.setVisible(true);
        framzz.add(area2);




        area3 = new JTextArea();
        area3.setSize(120,50);
        area3.setBackground(Color.BLACK);

        area3.setFont(new Font("Arial Unicode MS", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        area3.setForeground(Color.lightGray);
        area3.setLocation(104,320);
        area3.setOpaque(false);
        area3.setFocusable(false);
        area3.setVisible(true);
        framzz.add(area3);



        wp = new JLabel();
        wp.setSize(600,400);
        wp.setIcon(bg2p);
        framzz.add(wp);
        wp.setVisible(true);
        wp.setVisible(false);
        wp.setVisible(true);

    }

}
