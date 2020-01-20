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
public class listaMovilizacion extends javax.swing.JFrame {

    /**
     * Creates new form movilizacion
     */
    public listaMovilizacion() {
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

        movilizacion = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEmpleado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        agMovilizacion = new javax.swing.JButton();
        movilizacionAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        movilizacion.setBackground(new java.awt.Color(255, 255, 255));
        movilizacion.setPreferredSize(new java.awt.Dimension(1200, 700));
        movilizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        movilizacion.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1200, 10));

        listaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        listaEmpleado.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        listaEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        listaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sede Cedente", "Sede Receptora", "Responsable Cedente", "Responsable Receptor", "Activo", "Fecha ", "Motivo"
            }
        ));
        jScrollPane1.setViewportView(listaEmpleado);

        movilizacion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1150, 470));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Movilizacion");
        movilizacion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 1000, 70));

        agMovilizacion.setBackground(new java.awt.Color(255, 255, 255));
        agMovilizacion.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        agMovilizacion.setForeground(new java.awt.Color(0, 0, 0));
        agMovilizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add.png"))); // NOI18N
        agMovilizacion.setText("Agregar Movilizaciones");
        agMovilizacion.setBorder(null);
        agMovilizacion.setBorderPainted(false);
        agMovilizacion.setContentAreaFilled(false);
        agMovilizacion.setFocusPainted(false);
        agMovilizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agMovilizacionActionPerformed(evt);
            }
        });
        movilizacion.add(agMovilizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, 70));

        movilizacionAtras.setBackground(new java.awt.Color(255, 255, 255));
        movilizacionAtras.setForeground(new java.awt.Color(255, 255, 255));
        movilizacionAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back.png"))); // NOI18N
        movilizacionAtras.setBorder(null);
        movilizacionAtras.setBorderPainted(false);
        movilizacionAtras.setContentAreaFilled(false);
        movilizacionAtras.setFocusPainted(false);
        movilizacionAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        movilizacionAtras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        movilizacionAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movilizacionAtrasActionPerformed(evt);
            }
        });
        movilizacion.add(movilizacionAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(movilizacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(movilizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agMovilizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agMovilizacionActionPerformed
        formularioMovilizacion fm = new formularioMovilizacion();
        fm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_agMovilizacionActionPerformed

    private void movilizacionAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movilizacionAtrasActionPerformed
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

    }//GEN-LAST:event_movilizacionAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(listaMovilizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listaMovilizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listaMovilizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listaMovilizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listaMovilizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agMovilizacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaEmpleado;
    private javax.swing.JPanel movilizacion;
    private javax.swing.JButton movilizacionAtras;
    // End of variables declaration//GEN-END:variables
}
