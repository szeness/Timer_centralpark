public class ClockTimez extends Thread {

    public static boolean onT;
    public static boolean resetT;
    static int counterZahl = !Gui.textfield1.getText().isEmpty() ? Integer.parseInt(Gui.textfield1.getText()) : 0;


    public void run() {


        while (onT) {

            try {

                if (!resetT) {

                    counterZahl = !Gui.textfield1.getText().isEmpty() ? Integer.parseInt(Gui.textfield1.getText()) : 0;

                    for (int j = 1; j <= counterZahl; j++) {
                        if (onT) {
                            Gui.area.setText(counterZahl + ":");

                            sleep(1000);
                            counterZahl -= j;
                            if (Integer.toString(counterZahl).length() == 1) {
                                Gui.area.setText("0" + (counterZahl + ":"));
                            } else {
                                Gui.area.setText(counterZahl + ":");
                            }


                            for (int k = 59; k >= 0; k--) {

                                if (onT) {
                                    Gui.area2.setLocation(115 + ((Gui.area.getText().length() - 1) * 15), 208);

                                    if (Integer.toString(k).length() == 1) {
                                        Gui.area2.setText("0" + (k));
                                    } else {
                                        Gui.area2.setText(Integer.toString(k));
                                    }
                                    if (onT)
                                        sleep(1000);
                                }
                            }
                        }
                    }


                } else {

                    if (onT) {



                        for (int j = counterZahl; j >= 0; j--) {
                            if (onT) {

                                sleep(1000);



                                if (Integer.toString(counterZahl).length() == 1) {
                                    Gui.area.setText("0" + (counterZahl + ":"));
                                } else {
                                    Gui.area.setText(counterZahl + ":");
                                }


                                for (int k = Integer.parseInt(Gui.area2.getText()); k >= 0; k--) {

                                    if (onT) {
                                        Gui.area2.setLocation(115 + ((Gui.area.getText().length() - 1) * 15), 208);

                                        if (Integer.toString(k).length() == 1) {
                                            Gui.area2.setText("0"+(k));
                                        } else {
                                            Gui.area2.setText(Integer.toString(k));
                                        }
                                        if (onT)
                                            sleep(1000);
                                    }
                                }
                            }
                        }

                    }
                }
            }catch(InterruptedException e){
            }
        }
    }
}