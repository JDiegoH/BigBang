/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador_bigbang;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author juandiegohernandezamaya
 */
public class Ventana extends javax.swing.JFrame {

    Cronometro c;
    
    public Ventana() {
        initComponents();
        c = new Cronometro(LTiempo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PTiempos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        STSegundo = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BReset = new javax.swing.JButton();
        SRonda = new javax.swing.JSpinner();
        STMinuto = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        SDHora = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        SDMinuto = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        SDSegundo = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        STHora = new javax.swing.JSpinner();
        BIniciar = new javax.swing.JButton();
        PTemporizador = new javax.swing.JPanel();
        LTexto = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        LTiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEMPORIZADOR");
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        PTiempos.setLayout(null);

        jLabel1.setText("Tiempo de Descanso");
        PTiempos.add(jLabel1);
        jLabel1.setBounds(40, 170, 140, 16);

        jLabel2.setText("# Rondas");
        PTiempos.add(jLabel2);
        jLabel2.setBounds(40, 40, 80, 16);

        STSegundo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        PTiempos.add(STSegundo);
        STSegundo.setBounds(350, 120, 50, 26);

        jLabel4.setText("Tiempo de Trabajo");
        PTiempos.add(jLabel4);
        jLabel4.setBounds(40, 90, 120, 16);

        jLabel5.setText("H:");
        PTiempos.add(jLabel5);
        jLabel5.setBounds(100, 120, 20, 20);

        jLabel7.setText("M:");
        PTiempos.add(jLabel7);
        jLabel7.setBounds(210, 120, 20, 20);

        jLabel8.setText("S:");
        PTiempos.add(jLabel8);
        jLabel8.setBounds(330, 120, 20, 20);

        BReset.setText("RESET");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });
        PTiempos.add(BReset);
        BReset.setBounds(390, 60, 90, 29);

        SRonda.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        PTiempos.add(SRonda);
        SRonda.setBounds(170, 40, 50, 26);

        STMinuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        PTiempos.add(STMinuto);
        STMinuto.setBounds(230, 120, 50, 26);

        jLabel11.setText("H:");
        PTiempos.add(jLabel11);
        jLabel11.setBounds(100, 200, 20, 20);

        SDHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        PTiempos.add(SDHora);
        SDHora.setBounds(120, 200, 50, 26);

        jLabel12.setText("M:");
        PTiempos.add(jLabel12);
        jLabel12.setBounds(210, 200, 20, 20);

        SDMinuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        PTiempos.add(SDMinuto);
        SDMinuto.setBounds(230, 200, 50, 26);

        jLabel13.setText("S:");
        PTiempos.add(jLabel13);
        jLabel13.setBounds(330, 200, 20, 20);

        SDSegundo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        PTiempos.add(SDSegundo);
        SDSegundo.setBounds(350, 200, 50, 26);
        PTiempos.add(jSeparator1);
        jSeparator1.setBounds(0, 240, 500, 12);

        STHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        PTiempos.add(STHora);
        STHora.setBounds(120, 120, 50, 26);

        BIniciar.setText("INICIAR");
        BIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIniciarActionPerformed(evt);
            }
        });
        PTiempos.add(BIniciar);
        BIniciar.setBounds(390, 30, 92, 29);

        getContentPane().add(PTiempos);
        PTiempos.setBounds(0, 0, 500, 250);

        PTemporizador.setLayout(null);

        LTexto.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        LTexto.setText("DESCANSA");
        PTemporizador.add(LTexto);
        LTexto.setBounds(190, 30, 130, 30);

        jLabel16.setText("Ronda:");
        PTemporizador.add(jLabel16);
        jLabel16.setBounds(390, 90, 43, 16);

        jLabel17.setText("Tiempo:");
        PTemporizador.add(jLabel17);
        jLabel17.setBounds(30, 90, 51, 16);

        LTiempo.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        LTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LTiempo.setText("00:00:00        0");
        PTemporizador.add(LTiempo);
        LTiempo.setBounds(40, 130, 410, 50);

        getContentPane().add(PTemporizador);
        PTemporizador.setBounds(0, 250, 500, 250);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BResetActionPerformed

    private void BIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIniciarActionPerformed
        
        c.setThoras((int) STHora.getValue());
        c.setTminutos((int) STMinuto.getValue());
        c.setTsegundos((int) STSegundo.getValue());
        c.setDhoras((int) SDHora.getValue());
        c.setDminutos((int) SDMinuto.getValue());
        c.setDsegundos((int) SDSegundo.getValue());
        c.setRondas((int) SRonda.getValue());
        c.guardar();
        
        c.start();
    }//GEN-LAST:event_BIniciarActionPerformed


    public JLabel getLTiempo() {
        return LTiempo;
    }

    public JLabel getLTexto() {
        return LTexto;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BIniciar;
    private javax.swing.JButton BReset;
    private javax.swing.JLabel LTexto;
    private javax.swing.JLabel LTiempo;
    private javax.swing.JPanel PTemporizador;
    private javax.swing.JPanel PTiempos;
    private javax.swing.JSpinner SDHora;
    private javax.swing.JSpinner SDMinuto;
    private javax.swing.JSpinner SDSegundo;
    private javax.swing.JSpinner SRonda;
    private javax.swing.JSpinner STHora;
    private javax.swing.JSpinner STMinuto;
    private javax.swing.JSpinner STSegundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
