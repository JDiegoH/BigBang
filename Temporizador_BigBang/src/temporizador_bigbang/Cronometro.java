package temporizador_bigbang;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cronometro {

    private Ventana v;

    public Cronometro(Ventana v) {

        this.v = v;
    }

    //Variables de los tiempos y rondas ingresados por el usuario
    private int Thora;
    private int Tminuto;
    private int Tsegundo;
    private int Dhora;
    private int Dminuto;
    private int Dsegundo;
    private int ronda;

    //Setters y Getters de las variables
    public String getThora() {
        return String.valueOf(Thora);
    }

    public void setThora(int Thora) {
        this.Thora = Thora;
    }

    public String getTminuto() {
        return String.valueOf(Tminuto);
    }

    public void setTminuto(int Tminuto) {
        this.Tminuto = Tminuto;
    }

    public String getTsegundo() {
        return String.valueOf(Tsegundo);
    }

    public void setTsegundo(int Tsegundo) {
        this.Tsegundo = Tsegundo;
    }

    public String getDhora() {
        return String.valueOf(Dhora);
    }

    public void setDhora(int Dhora) {
        this.Dhora = Dhora;
    }

    public String getDminuto() {
        return String.valueOf(Dminuto);
    }

    public void setDminuto(int Dminuto) {
        this.Dminuto = Dminuto;
    }

    public String getDsegundo() {
        return String.valueOf(Dsegundo);
    }

    public void setDsegundo(int Dsegundo) {
        this.Dsegundo = Dsegundo;
    }

    public String getRonda() {
        return String.valueOf(ronda);
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public void imprimir() { //Imprime los datos ingresados por el usuario en formato de hora

        System.out.println("Ronda: " + ronda);
        System.out.println("Trabajo: " + Thora + " : " + Tminuto + " : " + Tsegundo);
        System.out.println("Descanso: " + Dhora + " : " + Dminuto + " : " + Dsegundo);
    }

    public void temporizar() {

        try {

            while (Tsegundo >= 0 && Tminuto >= 0 && Thora >= 0) {

                v.actualizar();

                Tsegundo--;

                Thread.sleep(1000);
                
                System.out.println(Tsegundo);

                if (Tsegundo == 0) {

                    Tsegundo = 59;
                    Tminuto--;

                    if (Tminuto == 0) {

                        Tminuto = 59;
                        Thora--;

                        if (Thora == 0) {
                            break;
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Algo salió mal con el hilo");
        }
    }

}
