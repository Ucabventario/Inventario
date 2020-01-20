/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Interface.formularioActivo.id_activo_ingresado;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Andrea
 */
public class formularioActivoIntangible extends javax.swing.JFrame {

    /**
     * Creates new form activoIntangle
     */
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("InventarioPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction datosTransaccion = em.getTransaction();
    
    public formularioActivoIntangible() {
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

        formularioActivoIntangible = new javax.swing.JPanel();
        fechaCaducidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        activoIntangibleStatus = new javax.swing.JComboBox<>();
        activoIntangibleCompartida = new javax.swing.JComboBox<>();
        activoIntangible = new javax.swing.JButton();
        agActivoIntangible = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formularioActivoIntangible.setBackground(new java.awt.Color(255, 255, 255));
        formularioActivoIntangible.setPreferredSize(new java.awt.Dimension(1200, 660));
        formularioActivoIntangible.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fechaCaducidad.setBackground(new java.awt.Color(255, 255, 255));
        fechaCaducidad.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        fechaCaducidad.setForeground(new java.awt.Color(51, 51, 51));
        fechaCaducidad.setText("Fecha de caducidad");
        fechaCaducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaCaducidadActionPerformed(evt);
            }
        });
        formularioActivoIntangible.add(fechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 190, 40));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar un Activo Intangible");
        formularioActivoIntangible.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 530, 70));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Fecha de Caducidad");
        formularioActivoIntangible.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 190, 30));

        activoIntangibleStatus.setBackground(new java.awt.Color(255, 255, 255));
        activoIntangibleStatus.setForeground(new java.awt.Color(0, 0, 0));
        activoIntangibleStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo Intangle Status", "En proceso de registro", "Vigente", "vencidas", "Desincorporadas" }));
        activoIntangibleStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        formularioActivoIntangible.add(activoIntangibleStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 220, -1));

        activoIntangibleCompartida.setBackground(new java.awt.Color(255, 255, 255));
        activoIntangibleCompartida.setForeground(new java.awt.Color(0, 0, 0));
        activoIntangibleCompartida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compartida", "SI", "NO" }));
        activoIntangibleCompartida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        formularioActivoIntangible.add(activoIntangibleCompartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 220, -1));

        activoIntangible.setBackground(new java.awt.Color(255, 255, 255));
        activoIntangible.setForeground(new java.awt.Color(255, 255, 255));
        activoIntangible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back.png"))); // NOI18N
        activoIntangible.setBorder(null);
        activoIntangible.setBorderPainted(false);
        activoIntangible.setContentAreaFilled(false);
        activoIntangible.setFocusPainted(false);
        activoIntangible.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        activoIntangible.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        activoIntangible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activoIntangibleActionPerformed(evt);
            }
        });
        formularioActivoIntangible.add(activoIntangible, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        agActivoIntangible.setBackground(new java.awt.Color(255, 255, 255));
        agActivoIntangible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (1).png"))); // NOI18N
        agActivoIntangible.setBorder(null);
        agActivoIntangible.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (2).png"))); // NOI18N
        agActivoIntangible.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (2).png"))); // NOI18N
        agActivoIntangible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agActivoIntangibleActionPerformed(evt);
            }
        });
        formularioActivoIntangible.add(agActivoIntangible, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 190, 90));

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Agregar Activo");
        formularioActivoIntangible.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(formularioActivoIntangible, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(formularioActivoIntangible, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaCaducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaCaducidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaCaducidadActionPerformed

    private void activoIntangibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activoIntangibleActionPerformed
        formularioActivo la = new formularioActivo();
        la.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_activoIntangibleActionPerformed

    private void agActivoIntangibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agActivoIntangibleActionPerformed
        listaActivo la = new listaActivo();
        em.getTransaction().begin();
        em.createNativeQuery("INSERT INTO activo_intangible (id_activo, fecha_cad, compartida, status) VALUES (?, ?, ?, ?)")
                .setParameter(1, id_activo_ingresado)
                .setParameter(2, this.fechaCaducidad.getText())
                .setParameter(3, this.activoIntangibleCompartida.getSelectedItem().toString())
                .setParameter(4, this.activoIntangibleStatus.getSelectedItem().toString())
                .executeUpdate();
        em.flush();
        datosTransaccion.commit();
        em.close();
        la.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_agActivoIntangibleActionPerformed

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
            java.util.logging.Logger.getLogger(formularioActivoIntangible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioActivoIntangible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioActivoIntangible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioActivoIntangible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioActivoIntangible().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activoIntangible;
    private javax.swing.JComboBox<String> activoIntangibleCompartida;
    private javax.swing.JComboBox<String> activoIntangibleStatus;
    private javax.swing.JButton agActivoIntangible;
    private javax.swing.JTextField fechaCaducidad;
    private javax.swing.JPanel formularioActivoIntangible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}