package temporizador_bigbang;

public class Cronometro {
    
    private int Thora;
    private int Tminuto;
    private int Tsegundo;
    private int Dhora;
    private int Dminuto;
    private int Dsegundo;
    private int ronda;

    public int getThora() {
        return Thora;
    }

    public void setThora(int Thora) {
        this.Thora = Thora;
    }

    public int getTminuto() {
        return Tminuto;
    }

    public void setTminuto(int Tminuto) {
        this.Tminuto = Tminuto;
    }

    public int getTsegundo() {
        return Tsegundo;
    }

    public void setTsegundo(int Tsegundo) {
        this.Tsegundo = Tsegundo;
    }

    public int getDhora() {
        return Dhora;
    }

    public void setDhora(int Dhora) {
        this.Dhora = Dhora;
    }

    public int getDminuto() {
        return Dminuto;
    }

    public void setDminuto(int Dminuto) {
        this.Dminuto = Dminuto;
    }

    public int getDsegundo() {
        return Dsegundo;
    }

    public void setDsegundo(int Dsegundo) {
        this.Dsegundo = Dsegundo;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }
    
    public void imprimir(){
        
        System.out.println("Ronda: " + ronda);
        System.out.println("Trabajo: " + Thora + " : " + Tminuto + " : " + Tsegundo);
        System.out.println("Descanso: " + Dhora + " : " + Dminuto + " : " + Dsegundo);
    }
}
