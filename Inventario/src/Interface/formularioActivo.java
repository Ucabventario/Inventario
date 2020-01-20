/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Interface.login.mi_sede;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Andrea
 */
public class formularioActivo extends javax.swing.JFrame {
    
    /**
     * Creates new form NewJFrame
     */
    
    public static String id_activo_ingresado;
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("InventarioPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction datosTransaccion = em.getTransaction();
    
    public formularioActivo() {
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

        formularioActivo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fechaDeshincorporacionActivo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        activoFichaResponsable = new javax.swing.JTextField();
        descripcionActivo = new javax.swing.JTextField();
        seleccionTipoActivo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        agActivo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        activoAtras = new javax.swing.JButton();
        codigoActivo1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fechaIncorporacionActivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formularioActivo.setBackground(new java.awt.Color(255, 255, 255));
        formularioActivo.setPreferredSize(new java.awt.Dimension(1200, 660));
        formularioActivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Descripcion de Activo");
        formularioActivo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        fechaDeshincorporacionActivo.setBackground(new java.awt.Color(255, 255, 255));
        fechaDeshincorporacionActivo.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        fechaDeshincorporacionActivo.setForeground(new java.awt.Color(51, 51, 51));
        fechaDeshincorporacionActivo.setText("fecha de deshincorporacion del Activo");
        fechaDeshincorporacionActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaDeshincorporacionActivoActionPerformed(evt);
            }
        });
        formularioActivo.add(fechaDeshincorporacionActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 230, 40));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar un Activo");
        formularioActivo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 490, 70));

        activoFichaResponsable.setBackground(new java.awt.Color(255, 255, 255));
        activoFichaResponsable.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        activoFichaResponsable.setForeground(new java.awt.Color(51, 51, 51));
        activoFichaResponsable.setText("Ficha empleado responsable");
        formularioActivo.add(activoFichaResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 230, 40));

        descripcionActivo.setBackground(new java.awt.Color(255, 255, 255));
        descripcionActivo.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        descripcionActivo.setForeground(new java.awt.Color(51, 51, 51));
        descripcionActivo.setText("Descripcion de Activo");
        formularioActivo.add(descripcionActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 270, 40));

        seleccionTipoActivo.setBackground(new java.awt.Color(255, 255, 255));
        seleccionTipoActivo.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        seleccionTipoActivo.setForeground(new java.awt.Color(0, 0, 0));
        seleccionTipoActivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Activo", "Tangible", "Intangible", "Inmueble", "Natural" }));
        seleccionTipoActivo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));
        seleccionTipoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionTipoActivoActionPerformed(evt);
            }
        });
        formularioActivo.add(seleccionTipoActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 270, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha de Desincorporacion ");
        formularioActivo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ficha Empleado Responsable");
        formularioActivo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        agActivo.setBackground(new java.awt.Color(255, 255, 255));
        agActivo.setForeground(new java.awt.Color(255, 255, 255));
        agActivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (1).png"))); // NOI18N
        agActivo.setBorder(null);
        agActivo.setBorderPainted(false);
        agActivo.setContentAreaFilled(false);
        agActivo.setFocusPainted(false);
        agActivo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (2).png"))); // NOI18N
        agActivo.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/add (2).png"))); // NOI18N
        agActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agActivoActionPerformed(evt);
            }
        });
        formularioActivo.add(agActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 230, 120));

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Agregar Activo");
        formularioActivo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

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
        formularioActivo.add(activoAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        codigoActivo1.setBackground(new java.awt.Color(255, 255, 255));
        codigoActivo1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        codigoActivo1.setForeground(new java.awt.Color(51, 51, 51));
        codigoActivo1.setText("Codigo Activo");
        codigoActivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActivo1ActionPerformed(evt);
            }
        });
        formularioActivo.add(codigoActivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 230, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Codigo de Activo");
        formularioActivo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Fecha de Incorporacion");
        formularioActivo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        fechaIncorporacionActivo.setBackground(new java.awt.Color(255, 255, 255));
        fechaIncorporacionActivo.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        fechaIncorporacionActivo.setForeground(new java.awt.Color(51, 51, 51));
        fechaIncorporacionActivo.setText("fecha de Incorporacion del Activo");
        fechaIncorporacionActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaIncorporacionActivoActionPerformed(evt);
            }
        });
        formularioActivo.add(fechaIncorporacionActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 230, 40));

        getContentPane().add(formularioActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionTipoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionTipoActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionTipoActivoActionPerformed

    private void fechaDeshincorporacionActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaDeshincorporacionActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaDeshincorporacionActivoActionPerformed

    private void agActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agActivoActionPerformed
       
        //Tangible, Intangible, Inmueble, Natural
        
        String tipoActivo = this.seleccionTipoActivo.getSelectedItem().toString();
        em.getTransaction().begin();
        em.createNativeQuery("INSERT INTO activo (id_activo, id_responsableu, descripcion) VALUES (?, ?, ?)")
                .setParameter(1, this.codigoActivo1.getText())
                .setParameter(2, this.activoFichaResponsable.getText())
                .setParameter(3, this.descripcionActivo.getText())
                .executeUpdate();
        id_activo_ingresado = this.codigoActivo1.getText();
        em.createNativeQuery("INSERT INTO distribuido (id_sede, id_activo, f_incorp, f_desincorp) VALUES (?, ?, ?, ?)")
                .setParameter(1, mi_sede)
                .setParameter(2, this.codigoActivo1.getText())
                .setParameter(3, this.fechaIncorporacionActivo.getText())
                .setParameter(4, this.fechaDeshincorporacionActivo.getText())
                .executeUpdate();
        em.flush();
        datosTransaccion.commit();
        em.close();
        
        if("Tangible".equals(tipoActivo)){
            formularioActivoTangible fat = new formularioActivoTangible();
            fat.setVisible(true);
            this.setVisible(false);
            
            }else if(tipoActivo == "Intangible"){
                formularioActivoIntangible fai = new formularioActivoIntangible();
                fai.setVisible(true);
                this.setVisible(false);

                    }else if(tipoActivo == "Inmueble"){
                        formularioActivoInmueble fain = new formularioActivoInmueble();
                        fain.setVisible(true);
                        this.setVisible(false);

                                }else if (tipoActivo == "Natural"){
                                    formularioActivoNatural fan = new formularioActivoNatural();
                                    fan.setVisible(true);
                                    this.setVisible(false);

                                }
        
    }//GEN-LAST:event_agActivoActionPerformed

    private void activoAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activoAtrasActionPerformed
        listaActivo la = new listaActivo();
        la.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_activoAtrasActionPerformed

    private void codigoActivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActivo1ActionPerformed

    private void fechaIncorporacionActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaIncorporacionActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaIncorporacionActivoActionPerformed

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
            java.util.logging.Logger.getLogger(formularioActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioActivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activoAtras;
    private javax.swing.JTextField activoFichaResponsable;
    private javax.swing.JButton agActivo;
    private javax.swing.JTextField codigoActivo1;
    private javax.swing.JTextField descripcionActivo;
    private javax.swing.JTextField fechaDeshincorporacionActivo;
    private javax.swing.JTextField fechaIncorporacionActivo;
    private javax.swing.JPanel formularioActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> seleccionTipoActivo;
    // End of variables declaration//GEN-END:variables
}