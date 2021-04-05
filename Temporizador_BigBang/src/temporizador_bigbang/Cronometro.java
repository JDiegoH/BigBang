package temporizador_bigbang;

import javax.swing.*;

public class Cronometro extends Thread {

    private int rondas;
    
    private int Tminutos;
    private int Tsegundos;
    private int Thoras;
    
    private int Dminutos;
    private int Dsegundos;
    private int Dhoras;
    JLabel LTiempo;
    JLabel LRondas;

    public Cronometro(JLabel LTiempo, JLabel Rondas) {
        this.LTiempo = LTiempo;
        this.LTiempo = LTiempo;
    }

    public void run() {
        while (Tsegundos >= 0 && Tminutos >= 0 && Thoras >= 0) {
            try {
                
                LTiempo.setText(Thoras + " : " + Tminutos + " : " + Tsegundos);
                
                Tsegundos--;

                if (Tsegundos < 0) {

                    Tminutos--;
                    Tsegundos = 59;
                    
                    if(Tminutos < 0){
                        
                        Thoras--;
                        Tminutos = 59;
                    }
                }
                Thread.sleep(1000);
               
            } catch (InterruptedException ex) {
                System.out.println("Algo salio Mal");
            }
        }
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public void setTminutos(int Tminutos) {
        this.Tminutos = Tminutos;
    }

    public void setTsegundos(int Tsegundos) {
        this.Tsegundos = Tsegundos;
    }

    public void setThoras(int Thoras) {
        this.Thoras = Thoras;
    }

    public void setDminutos(int Dminutos) {
        this.Dminutos = Dminutos;
    }

    public void setDsegundos(int Dsegundos) {
        this.Dsegundos = Dsegundos;
    }

    public void setDhoras(int Dhoras) {
        this.Dhoras = Dhoras;
    }

    public void setLblCronos(JLabel lblCronos) {
        this.LTiempo = lblCronos;
    }
    
    
}
