/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador_bigbang;

/**
 *
 * @author juandiegohernandezamaya
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setVisible(true);
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
        jTextField1 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SHora_Trabajo = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jSpinner11 = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        PTemporizador = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEMPORIZADOR");
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        PTiempos.setLayout(null);

        jLabel1.setText("Tiempo de Trabajo");
        PTiempos.add(jLabel1);
        jLabel1.setBounds(40, 170, 120, 16);

        jLabel2.setText("# Rondas");
        PTiempos.add(jLabel2);
        jLabel2.setBounds(40, 40, 80, 16);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        PTiempos.add(jTextField1);
        jTextField1.setBounds(180, 40, 50, 26);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        PTiempos.add(jSpinner1);
        jSpinner1.setBounds(350, 120, 50, 26);

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

        jButton1.setText("INICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PTiempos.add(jButton1);
        jButton1.setBounds(390, 30, 92, 29);

        SHora_Trabajo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        PTiempos.add(SHora_Trabajo);
        SHora_Trabajo.setBounds(120, 120, 50, 26);

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        PTiempos.add(jSpinner8);
        jSpinner8.setBounds(230, 120, 50, 26);

        jLabel11.setText("H:");
        PTiempos.add(jLabel11);
        jLabel11.setBounds(100, 200, 20, 20);

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        PTiempos.add(jSpinner9);
        jSpinner9.setBounds(120, 200, 50, 26);

        jLabel12.setText("M:");
        PTiempos.add(jLabel12);
        jLabel12.setBounds(210, 200, 20, 20);

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        PTiempos.add(jSpinner10);
        jSpinner10.setBounds(230, 200, 50, 26);

        jLabel13.setText("S:");
        PTiempos.add(jLabel13);
        jLabel13.setBounds(330, 200, 20, 20);

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        PTiempos.add(jSpinner11);
        jSpinner11.setBounds(350, 200, 50, 26);
        PTiempos.add(jSeparator1);
        jSeparator1.setBounds(0, 240, 500, 10);

        getContentPane().add(PTiempos);
        PTiempos.setBounds(0, 0, 500, 250);

        PTemporizador.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel3.setText("DESCANSA");
        PTemporizador.add(jLabel3);
        jLabel3.setBounds(190, 30, 130, 30);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabel6.setText("00");
        PTemporizador.add(jLabel6);
        jLabel6.setBounds(20, 80, 110, 90);

        getContentPane().add(PTemporizador);
        PTemporizador.setBounds(0, 250, 500, 250);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PTemporizador;
    private javax.swing.JPanel PTiempos;
    private javax.swing.JSpinner SHora_Trabajo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}