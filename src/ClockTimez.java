public class ClockTimez extends Thread {

    public static boolean runinT;
    public static boolean pauseT;
    public static int c = 162;
    static int counterZahl = !Gui.textfield1.getText().isEmpty() ? Integer.parseInt(Gui.textfield1.getText()) : 0;

    public static int iiii = 0;
    public void run() {




            try {

                if (!pauseT) {

                    counterZahl = !Gui.textfield1.getText().isEmpty() ? Integer.parseInt(Gui.textfield1.getText()) : 0;
                    ;


                    for (int j = 1; j <= counterZahl; j++) {
                        if (runinT) {
                            Gui.area.setText(counterZahl + ":");
                            for(int i = iiii;i<c;i++){
                                if (runinT) {
                                    iiii = 0;
                                    sleep(5);

                                }else{
                                    if(pauseT) {
                                        iiii = i;
                                        break;
                                    }
                                }

                            }

                            counterZahl -= j;
                            if (Integer.toString(counterZahl).length() == 1) {
                                Gui.area.setText("0" + (counterZahl + ":"));
                            } else {
                                Gui.area.setText(counterZahl + ":");
                            }


                            for (int k = 59; k >= 0; k--) {

                                if (runinT) {
                                    Gui.area2.setLocation(115 + ((Gui.area.getText().length() - 1) * 15), 208);

                                    if (Integer.toString(k).length() == 1) {
                                        Gui.area2.setText("0" + (k));
                                    } else {
                                        Gui.area2.setText(Integer.toString(k));
                                    }
                                    for(int i = iiii;i<c;i++){
                                        if (runinT) {
                                            iiii = 0;
                                            sleep(5);

                                        }else{
                                            if(pauseT) {
                                                iiii = i;
                                                break;
                                            }
                                        }

                                    }


                                }
                            }
                        }
                    }


                } else {
                    ClockTimez.pauseT = false;
                    if (runinT) {


                        for (int j = counterZahl; j >= 0; j--) {
                            if (runinT) {

                                for(int i = iiii;i<c;i++){
                                    if (runinT) {
                                        iiii = 0;
                                        sleep(5);

                                    }else{
                                        if(pauseT) {
                                            iiii = i;
                                            break;
                                        }
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
                                            Gui.area2.setText("0"+(k));
                                        } else {
                                            Gui.area2.setText(Integer.toString(k));
                                        }
                                        for(int i = iiii;i<c;i++){
                                            if (runinT) {
                                                iiii = 0;
                                                sleep(5);

                                            }else{
                                                if(pauseT) {
                                                    iiii = i;
                                                    break;
                                                }
                                            }


                                        }

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