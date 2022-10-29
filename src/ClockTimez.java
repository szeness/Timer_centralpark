public class ClockTimez extends Thread {



    int counterZahl = !Gui.textfield1.getText().isEmpty() ? Integer.parseInt(Gui.textfield1.getText()) : 0;


    public static ClockTimez cl =new ClockTimez();


    public void run() {

        try {


            for (int j = 1; j <= counterZahl; j++) {
                Gui.area.setText(counterZahl +":");
                sleep(1000);
                counterZahl -=j;
                if (Integer.toString(counterZahl).length() == 1) {
                    Gui.area.setText("0" + (counterZahl + ":"));
                }else {
                    Gui.area.setText(counterZahl + ":");
                }
                for (int k = 59; k >= 0; k--) {

                    Gui.area2.setLocation(115+((Gui.area.getText().length()-1)*15),208);

                    if (Integer.toString(k).length() == 1) {
                        Gui.area2.setText("0" + (k));
                    }else{
                        Gui.area2.setText(Integer.toString(k));
                    }
                    sleep(1000);
                }

            }
        } catch (InterruptedException e) {e.printStackTrace();
        }
    }
}
