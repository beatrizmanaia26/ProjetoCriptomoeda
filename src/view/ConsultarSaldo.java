/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author luana
 */
public class ConsultarSaldo extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarSaldo
     */
    public ConsultarSaldo() {
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

        txtNome = new javax.swing.JLabel();
        lblBitcoinRes = new javax.swing.JLabel();
        lblEthereumRes = new javax.swing.JLabel();
        lblRippleRes = new javax.swing.JLabel();
        lblReais = new javax.swing.JLabel();
        lblBitcoin = new javax.swing.JLabel();
        lblEthereum = new javax.swing.JLabel();
        lblRipple = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMenu = new javax.swing.JMenu();
        jMenuItemMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblBitcoinRes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblEthereumRes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblRippleRes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblReais.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblReais.setText("Reais:");

        lblBitcoin.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblBitcoin.setText("Bitcoin:");

        lblEthereum.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblEthereum.setText("Ethereum:");

        lblRipple.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblRipple.setText("Ripple:");

        lblNome.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblNome.setText("Nome:");

        txtNome1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblCPF.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        lblCPF.setText("CPF:");

        lblSaldo.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        lblSaldo.setText("Saldo");

        jMenuMenu.setText("Menu");

        jMenuItemMenu.setText("menu");
        jMenuMenu.add(jMenuItemMenu);

        jMenuBar1.add(jMenuMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblReais)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEthereum)
                                        .addComponent(lblRipple))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEthereumRes, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(lblRippleRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblBitcoin)
                                            .addGap(40, 40, 40))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNome)
                                            .addGap(53, 53, 53)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(lblBitcoinRes, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtNome1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(lblCPF))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(lblSaldo)
                .addGap(0, 179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReais)
                    .addComponent(txtNome1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBitcoin)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBitcoinRes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEthereum)
                    .addComponent(lblEthereumRes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRippleRes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRipple))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ConsultarSaldo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemMenu;
    private javax.swing.JMenu jMenuMenu;
    private javax.swing.JLabel lblBitcoin;
    private javax.swing.JLabel lblBitcoinRes;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEthereum;
    private javax.swing.JLabel lblEthereumRes;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblReais;
    private javax.swing.JLabel lblRipple;
    private javax.swing.JLabel lblRippleRes;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel txtCPF;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtNome1;
    // End of variables declaration//GEN-END:variables
}
