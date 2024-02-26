/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import Grafo.La_simulacion;


/**
 *
 * @author yangel
 */
public class Menú extends javax.swing.JFrame {
    /**
     * Creates new form Menú
     */
    
    public Menú() {
        initComponents();   
    }    
    
    public void Actualizacion(){
        La_simulacion simulacion = Emulador.getSimulacion();
        
        Num_ciclos.setText(Integer.toString(simulacion.getCiclos()));
        Num_ciudades.setText(Integer.toString(simulacion.getColonia().getCant_ciudades()));
        Num_hormigas.setText(Integer.toString(simulacion.getHormiguero().getCantidad()));
        Grado_v.setText(String.valueOf(simulacion.getVisibilidad_ciudad()));
        Grado_f.setText(String.valueOf(simulacion.getImportancia_feromona()));
        Evaporacion.setText(String.valueOf(simulacion.getFactor_evaporacion()));
        Ciudad_In.setText(simulacion.getColonia().getPrimero());
        Ciudad_Fin.setText(simulacion.getColonia().getUltimo());
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Simulación = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        Agregar_ciu = new javax.swing.JButton();
        Eliminar_ciu = new javax.swing.JButton();
        Cargar_gr = new javax.swing.JButton();
        Guardar_gr = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Grado_fe_lb = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        Grado_f = new javax.swing.JLabel();
        Num_hormigas = new javax.swing.JLabel();
        Num_ciudades = new javax.swing.JLabel();
        Num_ciclos = new javax.swing.JLabel();
        Grado_v = new javax.swing.JLabel();
        Evaporacion = new javax.swing.JLabel();
        Ciudad_In = new javax.swing.JLabel();
        Ciudad_Fin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Colonia de Hormigas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("- Números de Hormigas:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 20, 600));

        Simulación.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Simulación.setText("Iniciar Simulación");
        Simulación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulaciónActionPerformed(evt);
            }
        });
        getContentPane().add(Simulación, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1110, 10));

        Agregar_ciu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Agregar_ciu.setText("Crear ciudad");
        Agregar_ciu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_ciuActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar_ciu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 220, -1));

        Eliminar_ciu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Eliminar_ciu.setText("Eliminar ciudad");
        Eliminar_ciu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_ciuActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar_ciu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 220, -1));

        Cargar_gr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Cargar_gr.setText("Cargar grafo");
        Cargar_gr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cargar_grActionPerformed(evt);
            }
        });
        getContentPane().add(Cargar_gr, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 230, -1));

        Guardar_gr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Guardar_gr.setText("Guardar grafo");
        getContentPane().add(Guardar_gr, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 230, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 480, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Grafos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 480, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("- Números de Ciudades:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("- Número de ciclos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("- Grado de visibilidad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, -1, -1));

        Grado_fe_lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Grado_fe_lb.setText("- Grado de feromonas: ");
        getContentPane().add(Grado_fe_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("- Factor evaporación:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("- Ciudad  de llegada:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("- Ciudad de Salida:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\n    Revisa las últimas colonias \n  realizadas  o  aprovecha de guardar \n  lo ya hecho para futuros ingresos.\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 220, 120));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel11.setText("Ciudades");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("\n         Crea o elimina ciudades para \n  que rus simulaciones cambien de\n  resultados:\n              - Son máximo 20 ciudades\n              - Son mínimo 4 ciudades");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 130));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("      Incia el programa con la idea de comprobar el comportamiento de las \n  hormigas, recuerda que antes de iniciar tienes que colocar:\n           - Importancia de feromona\n           - Grafo de visibilidad\n           - Factor evaporación\n           - Número de hormigas\n           - Número de ciudades\n           - Número de ciclos\n           - Ciudad de inicio\n           - Ciudad de llegada");
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 430, 180));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel12.setText("Simulación");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        Salir.setText("X");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 80, -1));

        Grado_f.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Grado_f.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Grado_f.setText("0");
        getContentPane().add(Grado_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 630, 30, -1));

        Num_hormigas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num_hormigas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num_hormigas.setText("0");
        getContentPane().add(Num_hormigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 30, -1));

        Num_ciudades.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num_ciudades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num_ciudades.setText("0");
        getContentPane().add(Num_ciudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 30, -1));

        Num_ciclos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Num_ciclos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num_ciclos.setText("0");
        getContentPane().add(Num_ciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 590, 30, -1));

        Grado_v.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Grado_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Grado_v.setText("0");
        getContentPane().add(Grado_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 630, 30, -1));

        Evaporacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Evaporacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Evaporacion.setText("0");
        getContentPane().add(Evaporacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 510, 30, -1));

        Ciudad_In.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Ciudad_In.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ciudad_In.setText("0");
        getContentPane().add(Ciudad_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 550, 30, -1));

        Ciudad_Fin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Ciudad_Fin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ciudad_Fin.setText("0");
        getContentPane().add(Ciudad_Fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 590, 30, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Agregar_ciuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_ciuActionPerformed
        this.setVisible(false);
        Crear_Ciu ventana = new Crear_Ciu();
        ventana.setVisible(true);
        
    }//GEN-LAST:event_Agregar_ciuActionPerformed

    private void Cargar_grActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cargar_grActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cargar_grActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_SalirActionPerformed

    private void SimulaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimulaciónActionPerformed
        this.setVisible(false);
        Simulación ventana = new Simulación();
        ventana.setVisible(true);
    }//GEN-LAST:event_SimulaciónActionPerformed

    private void Eliminar_ciuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_ciuActionPerformed
        this.setVisible(false);
        Eliminar_Ciu ventana = new Eliminar_Ciu();
        ventana.setVisible(true);
    }//GEN-LAST:event_Eliminar_ciuActionPerformed

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
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_ciu;
    private javax.swing.JButton Cargar_gr;
    private javax.swing.JLabel Ciudad_Fin;
    private javax.swing.JLabel Ciudad_In;
    private javax.swing.JButton Eliminar_ciu;
    private javax.swing.JLabel Evaporacion;
    private javax.swing.JLabel Grado_f;
    private javax.swing.JLabel Grado_fe_lb;
    private javax.swing.JLabel Grado_v;
    private javax.swing.JButton Guardar_gr;
    private javax.swing.JLabel Num_ciclos;
    private javax.swing.JLabel Num_ciudades;
    private javax.swing.JLabel Num_hormigas;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Simulación;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
