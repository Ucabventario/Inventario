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
public class formularioActivoInmueble extends javax.swing.JFrame {

    /**
     * Creates new form activoInmueble
     */
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("InventarioPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction datosTransaccion = em.getTransaction();
    
    public formularioActivoInmueble() {
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

        formularioActivoTangible = new javax.swing.JPanel();
        dirUbicacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nombreSuperficie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        activoInmuebleStatus = new javax.swing.JComboBox<>();
        activoInmueblePropiedad = new javax.swing.JComboBox<>();
        activoInmuebleAtras = new javax.swing.JButton();
        agActivoInmueble = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formularioActivoTangible.setBackground(new java.awt.Color(255, 255, 255));
        formularioActivoTangible.setPreferredSize(new java.awt.Dimension(1200, 660));
        formularioActivoTangible.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dirUbicacion.setBackground(new java.awt.Color(255, 255, 255));
        dirUbicacion.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        dirUbicacion.setForeground(new java.awt.Color(51, 51, 51));
        dirUbicacion.setText("Ubicacion");
        dirUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirUbicacionActionPerformed(evt);
            }
        });
        formularioActivoTangible.add(dirUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 190, 40));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar un Activo Inmueble");
        formularioActivoTangible.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 530, 70));

        nombreSuperficie.setBackground(new java.awt.Color(255, 255, 255));
        nombreSuperficie.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        nombreSuperficie.setForeground(new java.awt.Color(51, 51, 51));
        nombreSuperficie.setText("Superficie");
        formularioActivoTangible.add(nombreSuperficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Ubicacion");
        formularioActivoTangible.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 190, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Superficie");
        formularioActivoTangible.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));

        activoInmuebleStatus.setBackground(new java.awt.Color(255, 255, 255));
        activoInmuebleStatus.setForeground(new java.awt.Color(0, 0, 0));
        activoInmuebleStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo Inmueble Status", "En proceso de registro", "En Construcción", "Habitada", "Deshabitada", "Desincorporadas" }));
        activoInmuebleStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        formularioActivoTangible.add(activoInmuebleStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 190, -1));

        activoInmueblePropiedad.setBackground(new java.awt.Color(255, 255, 255));
        activoInmueblePropiedad.setForeground(new java.awt.Color(0, 0, 0));
        activoInmueblePropiedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compartida", "Propia", "Comodato" }));
        activoInmueblePropiedad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        formularioActivoTangible.add(activoInmueblePropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 190, -1));

        activoInmuebleAtras.setBackground(new java.awt.Color(255, 255, 255));
        activoInmuebleAtras.setForeground(new java.awt.Color(255, 255, 255));
        activoInmuebleAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back.png"))); // NOI18N
        activoInmuebleAtras.setBorder(null);
        activoInmuebleAtras.setBorderPainted(false);
        activoInmuebleAtras.setContentAreaFilled(false);
        activoInmuebleAtras.setFocusPainted(false);
        activoInmuebleAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        activoInmuebleAtras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        activoInmuebleAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activoInmuebleAtrasActionPerformed(evt);
            }
        });
        formularioActivoTangible.add(activoInmuebleAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 70));

        agActivoInmueble.setBackground(new java.awt.Color(255, 255, 255));
        agActivoInmueble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (1).png"))); // NOI18N
        agActivoInmueble.setBorder(null);
        agActivoInmueble.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (2).png"))); // NOI18N
        agActivoInmueble.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (2).png"))); // NOI18N
        agActivoInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agActivoInmuebleActionPerformed(evt);
            }
        });
        formularioActivoTangible.add(agActivoInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 190, 90));

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Agregar Activo");
        formularioActivoTangible.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(formularioActivoTangible, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(formularioActivoTangible, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dirUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dirUbicacionActionPerformed

    private void activoInmuebleAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activoInmuebleAtrasActionPerformed
        formularioActivo la = new formularioActivo();
        la.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_activoInmuebleAtrasActionPerformed

    private void agActivoInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agActivoInmuebleActionPerformed
        listaActivo la = new listaActivo();
        em.getTransaction().begin();
        em.createNativeQuery("INSERT INTO activo_inmueble (id_activo, ubicacion, superficie, propiedad, status) VALUES (?, ?, ?, ?, ?)")
                .setParameter(1, id_activo_ingresado)
                .setParameter(2, this.dirUbicacion.getText())
                .setParameter(3, this.nombreSuperficie.getText())
                .setParameter(4, this.activoInmueblePropiedad.getSelectedItem().toString())
                .setParameter(5, this.activoInmuebleStatus.getSelectedItem().toString())
                .executeUpdate();
        em.flush();
        datosTransaccion.commit();
        em.close();
        la.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_agActivoInmuebleActionPerformed

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
            java.util.logging.Logger.getLogger(formularioActivoInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioActivoInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioActivoInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioActivoInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioActivoInmueble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activoInmuebleAtras;
    private javax.swing.JComboBox<String> activoInmueblePropiedad;
    private javax.swing.JComboBox<String> activoInmuebleStatus;
    private javax.swing.JButton agActivoInmueble;
    private javax.swing.JTextField dirUbicacion;
    private javax.swing.JPanel formularioActivoTangible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombreSuperficie;
    // End of variables declaration//GEN-END:variables
}
