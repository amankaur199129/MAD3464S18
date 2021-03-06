
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class TicTacToc extends javax.swing.JFrame {
char board[][] = {{'A','A','A'},
{'A','A','A'},{'A','A','A'}};
boolean player =true; //'x'
boolean win = false;
ImageIcon X= new ImageIcon(getClass().getResource("X.png"));
ImageIcon O = new ImageIcon(getClass().getResource("O.png"));

    /**
     * Creates new form TicTacToc
     */
    public TicTacToc() {
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

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bt00 = new javax.swing.JButton();
        bt02 = new javax.swing.JButton();
        bt01 = new javax.swing.JButton();
        bt11 = new javax.swing.JButton();
        bt10 = new javax.swing.JButton();
        bt12 = new javax.swing.JButton();
        bt20 = new javax.swing.JButton();
        bt21 = new javax.swing.JButton();
        bt22 = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Luminari", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Tic Tac Toc");

        bt00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt00ActionPerformed(evt);
            }
        });

        bt02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt02ActionPerformed(evt);
            }
        });

        bt01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt01ActionPerformed(evt);
            }
        });

        bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt11ActionPerformed(evt);
            }
        });

        bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10ActionPerformed(evt);
            }
        });

        bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt12ActionPerformed(evt);
            }
        });

        bt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt20ActionPerformed(evt);
            }
        });

        bt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt21ActionPerformed(evt);
            }
        });

        bt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(bt00, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bt01, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt02, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt00)
                    .addComponent(bt02)
                    .addComponent(bt01))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt11)
                    .addComponent(bt10)
                    .addComponent(bt12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt20)
                    .addComponent(bt21)
                    .addComponent(bt22))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt00ActionPerformed
        // TODO add your handling code here:
Select(this.bt00 ,00);


    }//GEN-LAST:event_bt00ActionPerformed

    private void bt01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt01ActionPerformed
        // TODO add your handling code here:
Select(this.bt01 ,01);
    }//GEN-LAST:event_bt01ActionPerformed

    private void bt02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt02ActionPerformed
        // TODO add your handling code here:
Select(this.bt02 ,02);

    }//GEN-LAST:event_bt02ActionPerformed

    private void bt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10ActionPerformed
        // TODO add your handling code here:
Select(this.bt10 ,10);
    }//GEN-LAST:event_bt10ActionPerformed

    private void bt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt11ActionPerformed
        // TODO add your handling code here:
Select(this.bt11 ,11);
    }//GEN-LAST:event_bt11ActionPerformed

    private void bt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt12ActionPerformed
        // TODO add your handling code here:
Select(this.bt12 ,12);
    }//GEN-LAST:event_bt12ActionPerformed

    private void bt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt20ActionPerformed
        // TODO add your handling code here:
Select(this.bt20 ,20);

    }//GEN-LAST:event_bt20ActionPerformed

    private void bt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt21ActionPerformed
        // TODO add your handling code here:
Select(this.bt21 ,21);
    }//GEN-LAST:event_bt21ActionPerformed

    private void bt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt22ActionPerformed
        // TODO add your handling code here:
Select(this.bt22 ,22);
    }//GEN-LAST:event_bt22ActionPerformed



public void Select(JButton btn, int cell){
int row = cell/10;
int col = cell % 10;


if (player){
board[row][col] = 'X';
btn.setIcon(X);
}else{
board[row][col] = 'O';
btn.setIcon(O);
}
player = !player;
btn.setEnabled(false);
checkWin();
}

public void checkWin(){
        
        //check for row win
        for (int i=0;i<3;i++){
            if ((board[i][0] == board [i][1]) && 
                    (board[i][0] == board [i][2]) &&
                    (board[i][0] != 'A')){
                JOptionPane.showMessageDialog(this, "Player " 
                        + board[i][0] + " wins...!!!");
                disableAllButtons();
                win = true;
            }
        }
        
        //check for column win
        for (int i=0;i<3;i++){
            if ((board[0][i] == board [1][i]) && 
                    (board[0][i] == board [2][i]) &&
                    (board[0][i] != 'A')){
                JOptionPane.showMessageDialog(this, "Player " 
                        + board[0][i] + " wins...!!!");
                disableAllButtons();
                win = true;
            }
        }
        
        //check for diagonal win
        
        if (((board[0][0] == board [1][1]) && 
                (board[0][0] == board [2][2]) &&
                (board[0][0] != 'A')) || 
                (((board[0][2] == board [1][1]) && 
                (board[0][2] == board [2][0]) &&
                (board[0][2] != 'A')))){
            JOptionPane.showMessageDialog(this, "Player " 
                    + board[1][1] + " wins...!!!");
            disableAllButtons();
            win = true;
        }
        
        if (win){
            //ask to play again
            int answer = JOptionPane.showConfirmDialog(this, "Do you want to play again ?", " Play again", JOptionPane.YES_NO_OPTION);

            if (answer == JOptionPane.YES_OPTION){
                restartGame();
            }else{
                System.exit(0);
            }
        }
    }
public void disableAllButtons(){
        this.bt00.setEnabled(false);
        this.bt01.setEnabled(false);
        this.bt02.setEnabled(false);
        this.bt10.setEnabled(false);
        this.bt11.setEnabled(false);
        this.bt12.setEnabled(false);
        this.bt20.setEnabled(false);
        this.bt21.setEnabled(false);
        this.bt22.setEnabled(false);
    }
    
    public void restartGame(){
        this.bt00.setEnabled(true);
        this.bt00.setIcon(null);
        this.bt01.setEnabled(true);
        this.bt01.setIcon(null);
        this.bt02.setEnabled(true);
        this.bt02.setIcon(null);
        this.bt10.setEnabled(true);
        this.bt10.setIcon(null);
        this.bt11.setEnabled(true);
        this.bt11.setIcon(null);
        this.bt12.setEnabled(true);
        this.bt12.setIcon(null);
        this.bt20.setEnabled(true);
        this.bt20.setIcon(null);
        this.bt21.setEnabled(true);
        this.bt21.setIcon(null);
        this.bt22.setEnabled(true);
        this.bt22.setIcon(null);
        
        player = true;
        win = false;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = 'J';
            }
        }
        
    }

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
            java.util.logging.Logger.getLogger(TicTacToc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt00;
    private javax.swing.JButton bt01;
    private javax.swing.JButton bt02;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt12;
    private javax.swing.JButton bt20;
    private javax.swing.JButton bt21;
    private javax.swing.JButton bt22;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
