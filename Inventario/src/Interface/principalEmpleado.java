/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Andrea
 */
public class principalEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form principalEmpleado
     */
    
    public static int a = 0;
    
    public principalEmpleado() {
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

        menuEmpleado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombreEmpleado = new javax.swing.JLabel();
        UnidadOperativaEmpleado = new javax.swing.JLabel();
        SedeEmpleado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonActivoEmpleado = new javax.swing.JButton();
        botonJefe = new javax.swing.JButton();
        botonEstadisticaEmpleado = new javax.swing.JButton();
        botonInventarioEmpleado = new javax.swing.JButton();
        botonMovilizacionEmpleado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        principalEmpleadoAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        menuEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        menuEmpleado.setPreferredSize(new java.awt.Dimension(1200, 700));
        menuEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/man (1).png"))); // NOI18N
        menuEmpleado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 150, 160));

        nombreEmpleado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        nombreEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEmpleado.setText("Nombre Empleado");
        menuEmpleado.add(nombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 500, 40));

        UnidadOperativaEmpleado.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        UnidadOperativaEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UnidadOperativaEmpleado.setText("Unidad operativa empleado");
        UnidadOperativaEmpleado.setToolTipText("");
        UnidadOperativaEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEmpleado.add(UnidadOperativaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 270, 20));

        SedeEmpleado.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        SedeEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SedeEmpleado.setText("Sede Empleado");
        SedeEmpleado.setToolTipText("");
        SedeEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEmpleado.add(SedeEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 270, 20));

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

        menuEmpleado.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1200, 10));

        botonActivoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        botonActivoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        botonActivoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/furniture-and-household (1).png"))); // NOI18N
        botonActivoEmpleado.setBorder(null);
        botonActivoEmpleado.setBorderPainted(false);
        botonActivoEmpleado.setContentAreaFilled(false);
        botonActivoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActivoEmpleado.setFocusPainted(false);
        botonActivoEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/furniture-and-household (3).png"))); // NOI18N
        botonActivoEmpleado.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/furniture-and-household (3).png"))); // NOI18N
        botonActivoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActivoEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(botonActivoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 230, 170));

        botonJefe.setBackground(new java.awt.Color(255, 255, 255));
        botonJefe.setForeground(new java.awt.Color(255, 255, 255));
        botonJefe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/man (4).png"))); // NOI18N
        botonJefe.setBorder(null);
        botonJefe.setBorderPainted(false);
        botonJefe.setContentAreaFilled(false);
        botonJefe.setFocusPainted(false);
        botonJefe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonJefe.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/man (3).png"))); // NOI18N
        botonJefe.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/man (3).png"))); // NOI18N
        botonJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJefeActionPerformed(evt);
            }
        });
        menuEmpleado.add(botonJefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 260, 180));

        botonEstadisticaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        botonEstadisticaEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        botonEstadisticaEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/progress.png"))); // NOI18N
        botonEstadisticaEmpleado.setBorder(null);
        botonEstadisticaEmpleado.setBorderPainted(false);
        botonEstadisticaEmpleado.setContentAreaFilled(false);
        botonEstadisticaEmpleado.setFocusPainted(false);
        botonEstadisticaEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/progress (1).png"))); // NOI18N
        botonEstadisticaEmpleado.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/progress (1).png"))); // NOI18N
        botonEstadisticaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstadisticaEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(botonEstadisticaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 250, 180));

        botonInventarioEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        botonInventarioEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        botonInventarioEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/treasure.png"))); // NOI18N
        botonInventarioEmpleado.setBorder(null);
        botonInventarioEmpleado.setBorderPainted(false);
        botonInventarioEmpleado.setContentAreaFilled(false);
        botonInventarioEmpleado.setFocusPainted(false);
        botonInventarioEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/treasure (1).png"))); // NOI18N
        botonInventarioEmpleado.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/treasure (1).png"))); // NOI18N
        botonInventarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInventarioEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(botonInventarioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 220, 160));

        botonMovilizacionEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        botonMovilizacionEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        botonMovilizacionEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/moving.png"))); // NOI18N
        botonMovilizacionEmpleado.setBorder(null);
        botonMovilizacionEmpleado.setBorderPainted(false);
        botonMovilizacionEmpleado.setContentAreaFilled(false);
        botonMovilizacionEmpleado.setFocusPainted(false);
        botonMovilizacionEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/moving (1).png"))); // NOI18N
        botonMovilizacionEmpleado.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/moving (1).png"))); // NOI18N
        botonMovilizacionEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMovilizacionEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(botonMovilizacionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 260, 160));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Movilizaciones");
        menuEmpleado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, 180, 70));

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Activos");
        menuEmpleado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 180, 70));

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Jefe");
        menuEmpleado.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 180, 70));

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estadisticas");
        menuEmpleado.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 180, 70));

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Inventario");
        menuEmpleado.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 210, 70));

        principalEmpleadoAtras.setBackground(new java.awt.Color(255, 255, 255));
        principalEmpleadoAtras.setForeground(new java.awt.Color(255, 255, 255));
        principalEmpleadoAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back.png"))); // NOI18N
        principalEmpleadoAtras.setBorder(null);
        principalEmpleadoAtras.setBorderPainted(false);
        principalEmpleadoAtras.setContentAreaFilled(false);
        principalEmpleadoAtras.setFocusPainted(false);
        principalEmpleadoAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        principalEmpleadoAtras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosInterface/back (2).png"))); // NOI18N
        principalEmpleadoAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalEmpleadoAtrasActionPerformed(evt);
            }
        });
        menuEmpleado.add(principalEmpleadoAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActivoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActivoEmpleadoActionPerformed
        listaActivo la = new listaActivo();
        la.setVisible(true);
        this.setVisible(false);
        a++;
    }//GEN-LAST:event_botonActivoEmpleadoActionPerformed

    private void botonJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJefeActionPerformed
        jefe j = new jefe();
        j.setVisible(true);
        this.setVisible(false);
        a++;
    }//GEN-LAST:event_botonJefeActionPerformed

    private void botonEstadisticaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstadisticaEmpleadoActionPerformed
        estadistica e = new estadistica();
        e.setVisible(true);
        this.setVisible(false);
        a++;
    }//GEN-LAST:event_botonEstadisticaEmpleadoActionPerformed

    private void botonInventarioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInventarioEmpleadoActionPerformed
        inventario i = new inventario();
        i.setVisible(true);
        this.setVisible(false);
        a++;
    }//GEN-LAST:event_botonInventarioEmpleadoActionPerformed

    private void principalEmpleadoAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalEmpleadoAtrasActionPerformed
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_principalEmpleadoAtrasActionPerformed

    private void botonMovilizacionEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMovilizacionEmpleadoActionPerformed
        listaMovilizacion lm = new listaMovilizacion();
        lm.setVisible(true);
        this.setVisible(false);
        a++;
    }//GEN-LAST:event_botonMovilizacionEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(principalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SedeEmpleado;
    private javax.swing.JLabel UnidadOperativaEmpleado;
    private javax.swing.JButton botonActivoEmpleado;
    private javax.swing.JButton botonEstadisticaEmpleado;
    private javax.swing.JButton botonInventarioEmpleado;
    private javax.swing.JButton botonJefe;
    private javax.swing.JButton botonMovilizacionEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menuEmpleado;
    private javax.swing.JLabel nombreEmpleado;
    private javax.swing.JButton principalEmpleadoAtras;
    // End of variables declaration//GEN-END:variables
}
