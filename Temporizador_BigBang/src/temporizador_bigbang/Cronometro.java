package temporizador_bigbang;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class Cronometro extends Thread {

    private int Rondas;
    private int x = 1;

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

    private Clip sonido;

    public Cronometro(JLabel LTiempo, JLabel LTexto) {
        this.LTiempo = LTiempo;
        this.LTexto = LTexto;
    }

    public void run() {
        while (Rondas >= x) {

            try {

                if (Tsegundos >= 0 && Tminutos >= 0 && Thoras >= 0) {

                    LTiempo.setText(Thoras + " : " + Tminutos + " : " + Tsegundos + "     " + x);
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

                    if (Tsegundos == 5 && Tminutos == 0 && Thoras == 0) {

                        sonido = AudioSystem.getClip();
                        sonido.open(AudioSystem.getAudioInputStream(new File("suave.wav")));

                        sonido.start();
                    }
                    
                } else if (Dsegundos >= 0 && Dminutos >= 0 && Dhoras >= 0) {

                    LTiempo.setText(Dhoras + " : " + Dminutos + " : " + Dsegundos + "     " + x);
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
                    
                    if (Dsegundos == 6 && Dminutos == 0 && Dhoras == 0) {

                        sonido = AudioSystem.getClip();
                        sonido.open(AudioSystem.getAudioInputStream(new File("duro.wav")));

                        sonido.start();
                    }
                } else {
                    abrir();
                    x++;
                }

            } catch (InterruptedException ex) {
                System.out.println("Algo salio Mal Con El Cronometro");
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void guardar() {

        aux_Thoras = Thoras;
        aux_Tminutos = Tminutos;
        aux_Tsegundos = Tsegundos;

        aux_Dhoras = Dhoras;
        aux_Dminutos = Dminutos;
        aux_Dsegundos = Dsegundos;

    }

    public void abrir() {

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
