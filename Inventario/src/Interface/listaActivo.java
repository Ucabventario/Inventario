/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Interface.principalEmpleado.a;
import static Interface.principalJefe.b;

/**
 *
 * @author Andrea
 */
public class listaActivo extends javax.swing.JFrame {

    /**
     * Creates new form listaActivo
     */
    public listaActivo() {
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

        empleado = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaActivo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        agActivo = new javax.swing.JButton();
        activoAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        empleado.setBackground(new java.awt.Color(255, 255, 255));
        empleado.setPreferredSize(new java.awt.Dimension(1200, 700));
        empleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(188, 212, 230));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        empleado.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1200, 10));

        listaActivo.setBackground(new java.awt.Color(255, 255, 255));
        listaActivo.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        listaActivo.setForeground(new java.awt.Color(255, 255, 255));
        listaActivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "unidad", "Fecha de Incorproracion", "Fecha de deshincorproracion"
            }
        ));
        jScrollPane1.setViewportView(listaActivo);

        empleado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1120, 520));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Activos ");
        empleado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 1080, 70));

        agActivo.setBackground(new java.awt.Color(255, 255, 255));
        agActivo.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        agActivo.setForeground(new java.awt.Color(0, 0, 0));
        agActivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add.png"))); // NOI18N
        agActivo.setText(" Agregar Activo");
        agActivo.setActionCommand("    Agregar Activo");
        agActivo.setBorder(null);
        agActivo.setBorderPainted(false);
        agActivo.setContentAreaFilled(false);
        agActivo.setFocusPainted(false);
        agActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agActivoActionPerformed(evt);
            }
        });
        empleado.add(agActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, 60));

        activoAtras.setBackground(new java.awt.Color(255, 255, 255));
        activoAtras.setForeground(new java.awt.Color(255, 255, 255));
        activoAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back.png"))); // NOI18N
        activoAtras.setBorder(null);
        activoAtras.setBorderPainted(false);
        activoAtras.setContentAreaFilled(false);
        activoAtras.setFocusPainted(false);
        activoAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        activoAtras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        activoAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activoAtrasActionPerformed(evt);
            }
        });
        empleado.add(activoAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agActivoActionPerformed
       formularioActivo fa = new formularioActivo();
       fa.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_agActivoActionPerformed

    private void activoAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activoAtrasActionPerformed
       if (a == 1){
            a--;
            principalEmpleado pe = new principalEmpleado();
            pe.setVisible(true);
            this.setVisible(false);
        }else if(b == 1){
                b--;
                principalJefe pj = new principalJefe();
                pj.setVisible(true);
                this.setVisible(false);
                }
    }//GEN-LAST:event_activoAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(listaActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listaActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listaActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listaActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listaActivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activoAtras;
    private javax.swing.JButton agActivo;
    private javax.swing.JPanel empleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaActivo;
    // End of variables declaration//GEN-END:variables
}
