package engine;


import gui.Gui;
import sounds.WaveFile;

public class ClockTimez extends Thread {

    public static boolean runinT,pauseT;
    public static int iiii,c=200;
    public static int counterZahl = !Gui.textfield1.getText().isEmpty() ? Integer.parseInt(Gui.textfield1.getText()) : 0;

    //public long timez = !Gui.textfield1.getText().isEmpty() ? Long.parseLong(Gui.textfield1.getText()) : 0;


    public void run() {

        try {if (!pauseT) {

            countingAlgo();

            if(!pauseT) {

                finTime(3);
            }

        }else{

            pauseAlgo();  }


        }catch(InterruptedException ignored){}
    }


    public static void pauseAlgo() throws InterruptedException {

        ClockTimez.pauseT = false;

        if (runinT) {

            for (int j = counterZahl; j >= 0; j--) {if (runinT) {
                    for (int i = iiii; i < c; i++) {if (runinT) {

                            sleep(5);

                        } else {if (pauseT) {break;}
                        }
                    }

                    if (Integer.toString(counterZahl).length() == 1) {
                        Gui.area.setText("0" + (counterZahl + ":"));
                    } else {
                        Gui.area.setText(counterZahl + ":");
                    }

                    for (int k = Gui.area2.getText().isEmpty() ? 0 : Integer.parseInt(Gui.area2.getText()); k >= 0; k--) {

                        Gui.area2.setLocation(115 + ((Gui.area.getText().length() - 1) * 15), 208);

                        if (runinT) {

                            if (Integer.toString(k).length() == 1) {
                                Gui.area2.setText("0" + (k));
                            } else {
                                Gui.area2.setText(Integer.toString(k));
                            }
                            for (int i = iiii; i < c; i++) {if (runinT) {

                                    sleep(5);

                                } else {if (pauseT) {break;}
                                }
                            }

                        }
                    }
                }
            }}}
    public static void countingAlgo() throws InterruptedException {

        for (int i = iiii; i < c; i++) {if (runinT) {

                sleep(5);

            } else {if (pauseT) {break;}
            }
        }

        for (int j = 0; j <= counterZahl; j++) {if (runinT) {

                Gui.area.setText(counterZahl-- + ":");

                if (Integer.toString(counterZahl).length() == 1) {
                    Gui.area.setText("0" + (counterZahl + ":"));
                } else {
                    Gui.area.setText(counterZahl + ":");
                }


                for (int k = 59; k >= 0; k--) {if (runinT) {

                        Gui.area2.setLocation(115 + ((Gui.area.getText().length() - 1) * 15), 208);

                        if (Integer.toString(k).length() == 1) {
                            Gui.area2.setText("0" + (k));
                        } else {
                            Gui.area2.setText(Integer.toString(k));
                        }
                        for (int i = iiii; i < c; i++) {if (runinT) {

                                sleep(5);

                            } else {if (pauseT) {break;}
                            }
                        }
                    }
                }
            }
        }
    }
    public static void finTime(int loops) throws InterruptedException {

        Gui.area2.setText("");
        Gui.area.setText("F I N");

          for (int i = 0; i < loops; i++) {
            WaveFile.trackPlayz();
            sleep(10000);
         }


    }


}

