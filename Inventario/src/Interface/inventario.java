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
public class inventario extends javax.swing.JFrame {

    /**
     * Creates new form inventario
     */
    public inventario() {
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

        formularioActivoNatural = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inventarioAtras = new javax.swing.JButton();
        agInventario = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formularioActivoNatural.setBackground(new java.awt.Color(255, 255, 255));
        formularioActivoNatural.setPreferredSize(new java.awt.Dimension(1200, 660));
        formularioActivoNatural.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inventario");
        formularioActivoNatural.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 440, 70));

        inventarioAtras.setBackground(new java.awt.Color(255, 255, 255));
        inventarioAtras.setForeground(new java.awt.Color(255, 255, 255));
        inventarioAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back.png"))); // NOI18N
        inventarioAtras.setBorder(null);
        inventarioAtras.setBorderPainted(false);
        inventarioAtras.setContentAreaFilled(false);
        inventarioAtras.setFocusPainted(false);
        inventarioAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        inventarioAtras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        inventarioAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioAtrasActionPerformed(evt);
            }
        });
        formularioActivoNatural.add(inventarioAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        agInventario.setBackground(new java.awt.Color(255, 255, 255));
        agInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (1).png"))); // NOI18N
        agInventario.setBorder(null);
        agInventario.setBorderPainted(false);
        agInventario.setContentAreaFilled(false);
        agInventario.setFocusPainted(false);
        agInventario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (2).png"))); // NOI18N
        agInventario.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (2).png"))); // NOI18N
        agInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agInventarioActionPerformed(evt);
            }
        });
        formularioActivoNatural.add(agInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 190, 90));

        jLabel9.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Agregar Inventario");
        formularioActivoNatural.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(formularioActivoNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(formularioActivoNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agInventarioActionPerformed
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
    }//GEN-LAST:event_agInventarioActionPerformed

    private void inventarioAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioAtrasActionPerformed
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
    }//GEN-LAST:event_inventarioAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agInventario;
    private javax.swing.JPanel formularioActivoNatural;
    private javax.swing.JButton inventarioAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
