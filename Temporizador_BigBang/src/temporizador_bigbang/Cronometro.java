package temporizador_bigbang;

import javax.swing.*;

public class Cronometro extends Thread {

    private int Rondas;

    private int Tminutos;
    private int Tsegundos;
    private int Thoras;

    private int Dminutos;
    private int Dsegundos;
    private int Dhoras;
    
    private int aux_Tminutos;
    private int aux_Tsegundos;
    private int aux_Thoras;

    private int aux_Dminutos;
    private int aux_Dsegundos;
    private int aux_Dhoras;
    
    JLabel LTiempo;
    JLabel LTexto;

    public Cronometro(JLabel LTiempo, JLabel LTexto) {
        this.LTiempo = LTiempo;
        this.LTexto = LTexto;
    }

    public void run() {
        while (Rondas > 0) {
            
            try {
                
                if (Tsegundos >= 0 && Tminutos >= 0 && Thoras >= 0) {

                    LTiempo.setText(Thoras + " : " + Tminutos + " : " + Tsegundos + "         " + Rondas);
                    LTexto.setText("TRABAJO");

                    Tsegundos--;

                    if (Tsegundos < 0) {

                        Tminutos--;
                        Tsegundos = 59;

                        if (Tminutos < 0) {

                            Thoras--;
                            Tminutos = 59;
                        }
                    }
                    Thread.sleep(1000);
                }
                else if (Dsegundos >= 0 && Dminutos >= 0 && Dhoras >= 0){
                    
                    LTiempo.setText(Dhoras + " : " + Dminutos + " : " + Dsegundos + "         " + Rondas);
                    LTexto.setText("DESCANSO");

                    Dsegundos--;

                    if (Dsegundos < 0) {

                        Dminutos--;
                        Dsegundos = 59;

                        if (Dminutos < 0) {

                            Dhoras--;
                            Dminutos = 59;
                        }
                    }
                    Thread.sleep(1000);
                }
                else{
                    abrir();
                    Rondas--;
                }

            } catch (InterruptedException ex) {
                System.out.println("Algo salio Mal Con El Cronometro");
            }
        }
    }

    public void guardar(){
        
        aux_Thoras = Thoras;
        aux_Tminutos = Tminutos;
        aux_Tsegundos = Tsegundos;
        
        aux_Dhoras = Dhoras;
        aux_Dminutos = Dminutos;
        aux_Dsegundos = Dsegundos;
        
    }
    
    public void abrir(){
        
        Thoras = aux_Thoras;
        Tminutos = aux_Tminutos;
        Tsegundos = aux_Tsegundos;
        
        Dhoras = aux_Dhoras;
        Dminutos = aux_Dminutos;
        Dsegundos = aux_Dsegundos;
        
    }
    
    public void setRondas(int rondas) {
        this.Rondas = rondas;
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
