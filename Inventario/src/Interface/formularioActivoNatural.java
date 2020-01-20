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
public class formularioActivoNatural extends javax.swing.JFrame {

    /**
     * Creates new form activoNatural
     */
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("InventarioPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction datosTransaccion = em.getTransaction();
    
    public formularioActivoNatural() {
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

        agActivoTangible = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        formularioActivoNatural = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombreCientificoNatural = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nombreVulgarNatural = new javax.swing.JTextField();
        fechaPlantacionNatural = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        activoNaturalFloracion = new javax.swing.JTextField();
        activoNaturalFrutal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        activoNaturalOrigen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ubicacionActivoNatural = new javax.swing.JTextField();
        activoNaturalStatus = new javax.swing.JComboBox<>();
        compartidoActivoNatural = new javax.swing.JComboBox<>();
        activoNaturalAtras = new javax.swing.JButton();
        agActivoNatural = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        agActivoTangible.setBackground(new java.awt.Color(255, 255, 255));
        agActivoTangible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (1).png"))); // NOI18N
        agActivoTangible.setBorder(null);
        agActivoTangible.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (2).png"))); // NOI18N
        agActivoTangible.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (2).png"))); // NOI18N
        agActivoTangible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agActivoTangibleActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Agregar Activo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formularioActivoNatural.setBackground(new java.awt.Color(255, 255, 255));
        formularioActivoNatural.setPreferredSize(new java.awt.Dimension(1200, 660));
        formularioActivoNatural.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fecha de  Plantacion");
        formularioActivoNatural.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        nombreCientificoNatural.setBackground(new java.awt.Color(255, 255, 255));
        nombreCientificoNatural.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        nombreCientificoNatural.setForeground(new java.awt.Color(51, 51, 51));
        nombreCientificoNatural.setText("Nombre Científico");
        nombreCientificoNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCientificoNaturalActionPerformed(evt);
            }
        });
        formularioActivoNatural.add(nombreCientificoNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, 40));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar un Activo Natural");
        formularioActivoNatural.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 540, 70));

        nombreVulgarNatural.setBackground(new java.awt.Color(255, 255, 255));
        nombreVulgarNatural.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        nombreVulgarNatural.setForeground(new java.awt.Color(51, 51, 51));
        nombreVulgarNatural.setText("Nombre Vulgar");
        formularioActivoNatural.add(nombreVulgarNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 190, 40));

        fechaPlantacionNatural.setBackground(new java.awt.Color(255, 255, 255));
        fechaPlantacionNatural.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        fechaPlantacionNatural.setForeground(new java.awt.Color(51, 51, 51));
        fechaPlantacionNatural.setText("Fecha de Plantacion");
        formularioActivoNatural.add(fechaPlantacionNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 190, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Nombre Científico");
        formularioActivoNatural.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre Vulgar");
        formularioActivoNatural.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Floracion");
        formularioActivoNatural.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 160, -1));

        activoNaturalFloracion.setBackground(new java.awt.Color(255, 255, 255));
        activoNaturalFloracion.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        activoNaturalFloracion.setForeground(new java.awt.Color(51, 51, 51));
        activoNaturalFloracion.setText("Floracion");
        formularioActivoNatural.add(activoNaturalFloracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 190, 40));

        activoNaturalFrutal.setBackground(new java.awt.Color(255, 255, 255));
        activoNaturalFrutal.setForeground(new java.awt.Color(0, 0, 0));
        activoNaturalFrutal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frutal", "SI", "NO" }));
        activoNaturalFrutal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        activoNaturalFrutal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activoNaturalFrutalActionPerformed(evt);
            }
        });
        formularioActivoNatural.add(activoNaturalFrutal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 190, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Origen");
        formularioActivoNatural.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 160, -1));

        activoNaturalOrigen.setBackground(new java.awt.Color(255, 255, 255));
        activoNaturalOrigen.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        activoNaturalOrigen.setForeground(new java.awt.Color(51, 51, 51));
        activoNaturalOrigen.setText("Origen");
        formularioActivoNatural.add(activoNaturalOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 190, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ubicacion");
        formularioActivoNatural.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        ubicacionActivoNatural.setBackground(new java.awt.Color(255, 255, 255));
        ubicacionActivoNatural.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        ubicacionActivoNatural.setForeground(new java.awt.Color(51, 51, 51));
        ubicacionActivoNatural.setText("Ubicacion");
        ubicacionActivoNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionActivoNaturalActionPerformed(evt);
            }
        });
        formularioActivoNatural.add(ubicacionActivoNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 190, 40));

        activoNaturalStatus.setBackground(new java.awt.Color(255, 255, 255));
        activoNaturalStatus.setForeground(new java.awt.Color(0, 0, 0));
        activoNaturalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status Activo Natural", "En proceso de registro", "Plantado", "Enfermo", "Extinto" }));
        activoNaturalStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        activoNaturalStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activoNaturalStatusActionPerformed(evt);
            }
        });
        formularioActivoNatural.add(activoNaturalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 190, -1));

        compartidoActivoNatural.setBackground(new java.awt.Color(255, 255, 255));
        compartidoActivoNatural.setForeground(new java.awt.Color(0, 0, 0));
        compartidoActivoNatural.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compartido", "SI", "NO" }));
        compartidoActivoNatural.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        compartidoActivoNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compartidoActivoNaturalActionPerformed(evt);
            }
        });
        formularioActivoNatural.add(compartidoActivoNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 190, -1));

        activoNaturalAtras.setBackground(new java.awt.Color(255, 255, 255));
        activoNaturalAtras.setForeground(new java.awt.Color(255, 255, 255));
        activoNaturalAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back.png"))); // NOI18N
        activoNaturalAtras.setBorder(null);
        activoNaturalAtras.setBorderPainted(false);
        activoNaturalAtras.setContentAreaFilled(false);
        activoNaturalAtras.setFocusPainted(false);
        activoNaturalAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        activoNaturalAtras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        activoNaturalAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activoNaturalAtrasActionPerformed(evt);
            }
        });
        formularioActivoNatural.add(activoNaturalAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        agActivoNatural.setBackground(new java.awt.Color(255, 255, 255));
        agActivoNatural.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (1).png"))); // NOI18N
        agActivoNatural.setBorder(null);
        agActivoNatural.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (2).png"))); // NOI18N
        agActivoNatural.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (2).png"))); // NOI18N
        agActivoNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agActivoNaturalActionPerformed(evt);
            }
        });
        formularioActivoNatural.add(agActivoNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 190, 90));

        jLabel9.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Agregar Activo");
        formularioActivoNatural.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(formularioActivoNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(formularioActivoNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreCientificoNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCientificoNaturalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCientificoNaturalActionPerformed

    private void activoNaturalFrutalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activoNaturalFrutalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activoNaturalFrutalActionPerformed

    private void activoNaturalStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activoNaturalStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activoNaturalStatusActionPerformed

    private void ubicacionActivoNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionActivoNaturalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionActivoNaturalActionPerformed

    private void compartidoActivoNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compartidoActivoNaturalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compartidoActivoNaturalActionPerformed

    private void activoNaturalAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activoNaturalAtrasActionPerformed
        formularioActivo la = new formularioActivo();
        la.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_activoNaturalAtrasActionPerformed

    private void agActivoTangibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agActivoTangibleActionPerformed
        listaActivo la = new listaActivo();
        la.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_agActivoTangibleActionPerformed

    private void agActivoNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agActivoNaturalActionPerformed
        listaActivo la = new listaActivo();
        em.getTransaction().begin();
        em.createNativeQuery("INSERT INTO activo_natural (id_activo, nombre_c, nombre_v, frutal, floracion, fplantacion, origen, status, ubicacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")
                .setParameter(1, id_activo_ingresado)
                .setParameter(2, this.nombreCientificoNatural.getText())
                .setParameter(3, this.nombreVulgarNatural.getText())
                .setParameter(4, this.activoNaturalFrutal.getSelectedItem().toString())
                .setParameter(5, this.activoNaturalFloracion.getText())
                .setParameter(6, this.fechaPlantacionNatural.getText())
                .setParameter(7, this.activoNaturalOrigen.getText())
                .setParameter(8, this.activoNaturalStatus.getSelectedItem().toString())
                .setParameter(9, this.ubicacionActivoNatural.getText())
                .executeUpdate();
        em.flush();
        datosTransaccion.commit();
        em.close();
        la.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_agActivoNaturalActionPerformed

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
            java.util.logging.Logger.getLogger(formularioActivoNatural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioActivoNatural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioActivoNatural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioActivoNatural.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioActivoNatural().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activoNaturalAtras;
    private javax.swing.JTextField activoNaturalFloracion;
    private javax.swing.JComboBox<String> activoNaturalFrutal;
    private javax.swing.JTextField activoNaturalOrigen;
    private javax.swing.JComboBox<String> activoNaturalStatus;
    private javax.swing.JButton agActivoNatural;
    private javax.swing.JButton agActivoTangible;
    private javax.swing.JComboBox<String> compartidoActivoNatural;
    private javax.swing.JTextField fechaPlantacionNatural;
    private javax.swing.JPanel formularioActivoNatural;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombreCientificoNatural;
    private javax.swing.JTextField nombreVulgarNatural;
    private javax.swing.JTextField ubicacionActivoNatural;
    // End of variables declaration//GEN-END:variables
}