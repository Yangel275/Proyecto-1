/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
/**
 *
 * @author yangel
 */
public class Simulación extends javax.swing.JFrame {

    /**
     * Creates new form Simulación
     */
    public Simulación() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        Salida = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Gr_Evaporacion = new javax.swing.JTextField();
        Num_Hormigas = new javax.swing.JTextField();
        Num_ciclos = new javax.swing.JTextField();
        Gr_Visibilidad = new javax.swing.JTextField();
        Gr_Importancia = new javax.swing.JTextField();
        Simulacion = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 56)); // NOI18N
        jLabel1.setText("Simulación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Ciudad de llegada:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel3.setText("Ciudad de inicio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setText("Número de hormigas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel5.setText("Grado de Visibilidad de las ciudades:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setText("Número de ciclos:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        Regresar.setText("←");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, -1));

        Salida.setText("x");
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });
        jPanel1.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel7.setText("Grado de importancia de Feromona:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel8.setText("Grado de evaporación de Feromona:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        Gr_Evaporacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Gr_Evaporacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Gr_Evaporacion.setText("0");
        Gr_Evaporacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gr_EvaporacionActionPerformed(evt);
            }
        });
        jPanel1.add(Gr_Evaporacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, -1, -1));

        Num_Hormigas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num_Hormigas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Num_Hormigas.setText("0");
        Num_Hormigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_HormigasActionPerformed(evt);
            }
        });
        jPanel1.add(Num_Hormigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        Num_ciclos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num_ciclos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Num_ciclos.setText("0");
        Num_ciclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_ciclosActionPerformed(evt);
            }
        });
        jPanel1.add(Num_ciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        Gr_Visibilidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Gr_Visibilidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Gr_Visibilidad.setText("0");
        Gr_Visibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gr_VisibilidadActionPerformed(evt);
            }
        });
        jPanel1.add(Gr_Visibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, -1, -1));

        Gr_Importancia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Gr_Importancia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Gr_Importancia.setText("0");
        Gr_Importancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gr_ImportanciaActionPerformed(evt);
            }
        });
        jPanel1.add(Gr_Importancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

        Simulacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Simulacion.setText("Iniciar");
        Simulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulacionActionPerformed(evt);
            }
        });
        jPanel1.add(Simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 230, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.setVisible(false);
        Menú ventana = new Menú();
        ventana.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalidaActionPerformed

    private void Gr_EvaporacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gr_EvaporacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gr_EvaporacionActionPerformed

    private void Num_HormigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_HormigasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num_HormigasActionPerformed

    private void Num_ciclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_ciclosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num_ciclosActionPerformed

    private void Gr_VisibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gr_VisibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gr_VisibilidadActionPerformed

    private void Gr_ImportanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gr_ImportanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gr_ImportanciaActionPerformed

    private void SimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimulacionActionPerformed
        double evaporacion = Double.parseDouble(Gr_Evaporacion.getText());
        double visibilidad = Double.parseDouble(Gr_Visibilidad.getText());
        double importancia = Double.parseDouble(Gr_Importancia.getText());
        
        
    }//GEN-LAST:event_SimulacionActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Simulación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulación().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Gr_Evaporacion;
    private javax.swing.JTextField Gr_Importancia;
    private javax.swing.JTextField Gr_Visibilidad;
    private javax.swing.JTextField Num_Hormigas;
    private javax.swing.JTextField Num_ciclos;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Salida;
    private javax.swing.JButton Simulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
