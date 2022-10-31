public class ClockTimez extends Thread {

    public static boolean runinT;
    public static boolean pauseT;
    public static int c = 162;
    static int counterZahl = !Gui.textfield1.getText().isEmpty() ? Integer.parseInt(Gui.textfield1.getText()) : 0;

    public static int iiii;
    public void run() {




            try {

                if (!pauseT) {




                    for(int i = iiii;i<c;i++){
                        if (runinT) {

                            sleep(5);

                        }else{
                            if(pauseT) {

                                break;
                            }
                        }


                    }
                    for (int j = 0; j <= counterZahl; j++) {
                        if (runinT) {

                            Gui.area.setText(counterZahl-- + ":");



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

                                            sleep(5);

                                        }else{
                                            if(pauseT) {

                                                break;
                                            }
                                        }

                                    }


                                }
                            }
                        }

                    }
                    Gui.area2.setText("");
                    Gui.area.setText("F I N");

                    for (int i = 0; i < 3; i++) {
                        Timer.trackPlayz();
                        sleep(10000);
                    }






                } else {
                    ClockTimez.pauseT = false;
                    if (runinT) {

                        for (int j = counterZahl; j >= 0; j--) {
                            if (runinT) {

                                for(int i = iiii;i<c;i++){
                                    if (runinT) {

                                        sleep(5);

                                    }else{
                                        if(pauseT) {

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

                                                sleep(5);

                                            }else{
                                                if(pauseT) {

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