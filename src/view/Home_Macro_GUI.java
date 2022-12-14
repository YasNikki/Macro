
package view;

import java.awt.Color;

public class Home_Macro_GUI extends javax.swing.JFrame {

    /**
     * Creates new form home_DGV_GUI
     */
    public Home_Macro_GUI() {
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

        FundoPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botaoDashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        Copyright = new javax.swing.JLabel();
        botaoGastos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        botaoMetas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        botaoSair = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagina Inicial");
        setUndecorated(true);

        FundoPrincipal.setBackground(new java.awt.Color(243, 243, 243));
        FundoPrincipal.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setLayout(null);

        botaoDashboard.setBackground(new java.awt.Color(228, 228, 228));
        botaoDashboard.setToolTipText("Gerenciar registro de chaves.");
        botaoDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoDashboardMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("DASHBOARD");

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dashboard.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botaoDashboardLayout = new javax.swing.GroupLayout(botaoDashboard);
        botaoDashboard.setLayout(botaoDashboardLayout);
        botaoDashboardLayout.setHorizontalGroup(
            botaoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoDashboardLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        botaoDashboardLayout.setVerticalGroup(
            botaoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(botaoDashboard);
        botaoDashboard.setBounds(10, 160, 260, 50);

        Copyright.setText("@YasNikki");
        jPanel1.add(Copyright);
        Copyright.setBounds(10, 454, 240, 20);

        botaoGastos.setBackground(new java.awt.Color(228, 228, 228));
        botaoGastos.setToolTipText("Gerenciar registro de itens.");
        botaoGastos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoGastosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoGastosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoGastosMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("GASTOS/GANHOS");

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fluxo-de-dinheiro.png"))); // NOI18N

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botaoGastosLayout = new javax.swing.GroupLayout(botaoGastos);
        botaoGastos.setLayout(botaoGastosLayout);
        botaoGastosLayout.setHorizontalGroup(
            botaoGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoGastosLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        botaoGastosLayout.setVerticalGroup(
            botaoGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoGastosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(panelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(botaoGastos);
        botaoGastos.setBounds(10, 220, 260, 50);

        botaoMetas.setBackground(new java.awt.Color(228, 228, 228));
        botaoMetas.setToolTipText("Gerenciar dados cadastrados.");
        botaoMetas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoMetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMetasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoMetasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoMetasMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("METAS");

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/growth.png"))); // NOI18N

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botaoMetasLayout = new javax.swing.GroupLayout(botaoMetas);
        botaoMetas.setLayout(botaoMetasLayout);
        botaoMetasLayout.setHorizontalGroup(
            botaoMetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMetasLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(panelImage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        botaoMetasLayout.setVerticalGroup(
            botaoMetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoMetasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botaoMetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(panelImage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(botaoMetas);
        botaoMetas.setBounds(10, 280, 260, 50);

        botaoSair.setBackground(new java.awt.Color(228, 228, 228));
        botaoSair.setToolTipText("");
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoSairMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fechar Software");

        javax.swing.GroupLayout botaoSairLayout = new javax.swing.GroupLayout(botaoSair);
        botaoSair.setLayout(botaoSairLayout);
        botaoSairLayout.setHorizontalGroup(
            botaoSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoSairLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        botaoSairLayout.setVerticalGroup(
            botaoSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botaoSairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(botaoSair);
        botaoSair.setBounds(10, 340, 260, 50);

        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo_macro.png"))); // NOI18N

        javax.swing.GroupLayout panelImage5Layout = new javax.swing.GroupLayout(panelImage5);
        panelImage5.setLayout(panelImage5Layout);
        panelImage5Layout.setHorizontalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panelImage5Layout.setVerticalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage5);
        panelImage5.setBounds(-40, -60, 350, 230);

        FundoPrincipal.add(jPanel1);
        jPanel1.setBounds(0, 0, 280, 490);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/controle-gasto.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        FundoPrincipal.add(panelImage1);
        panelImage1.setBounds(350, 30, 410, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(820, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDashboardMouseEntered
        
        botaoDashboard.setBackground(new Color(153,153,153));
        
    }//GEN-LAST:event_botaoDashboardMouseEntered

    private void botaoDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDashboardMouseExited
        
        botaoDashboard.setBackground(new Color(228,228,228));
        
    }//GEN-LAST:event_botaoDashboardMouseExited

    private void botaoGastosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoGastosMouseEntered
        
        botaoGastos.setBackground(new Color(153,153,153));
        
    }//GEN-LAST:event_botaoGastosMouseEntered

    private void botaoGastosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoGastosMouseExited
        
        botaoGastos.setBackground(new Color(228,228,228));
        
    }//GEN-LAST:event_botaoGastosMouseExited

    private void botaoMetasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMetasMouseEntered
        
        botaoMetas.setBackground(new Color(153,153,153));
        
    }//GEN-LAST:event_botaoMetasMouseEntered

    private void botaoMetasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMetasMouseExited
        
        botaoMetas.setBackground(new Color(228,228,228));
        
    }//GEN-LAST:event_botaoMetasMouseExited

    private void botaoSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseEntered
        
        botaoSair.setBackground(new Color(153,153,153));
        
    }//GEN-LAST:event_botaoSairMouseEntered

    private void botaoSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseExited
        
        botaoSair.setBackground(new Color(228,228,228));
        
    }//GEN-LAST:event_botaoSairMouseExited

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_botaoSairMouseClicked

    private void botaoMetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMetasMouseClicked
        
        new Metas_Macro_GUI().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_botaoMetasMouseClicked

    private void botaoDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDashboardMouseClicked
        
        new Dashboard_Macro_GUI().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_botaoDashboardMouseClicked

    private void botaoGastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoGastosMouseClicked
        
        new Gastos_Macro_GUI().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_botaoGastosMouseClicked

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
            java.util.logging.Logger.getLogger(Home_Macro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Macro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Macro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Macro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Macro_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Copyright;
    private javax.swing.JPanel FundoPrincipal;
    private javax.swing.JPanel botaoDashboard;
    private javax.swing.JPanel botaoGastos;
    private javax.swing.JPanel botaoMetas;
    private javax.swing.JPanel botaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    // End of variables declaration//GEN-END:variables
}
