
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranavkundra
 */
public class Menu extends javax.swing.JPanel {

    JFrame frame;
    Data data;
    String key;
    Language lang;
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setAllText();
    }
    
    /**
     * Creates new form Menu using parameterized constructor
     */
    public Menu(JFrame frame, String key) {
        this(frame, key, new English());
    }
    
    /**
     * Creates new form Menu using parameterized constructor
     */
    public Menu(JFrame frame, String key, Language lang) {
        this.frame=frame;
        this.key=key;
        this.lang=lang;
        
        try
        {
            this.data = new Data();
        }
        catch(FileNotFoundException e) {}
        catch(IOException e) {}
        
        initComponents();
        setAllText();
        Welcome.setText(this.lang.welcome()+ " " + this.data.getName(key) + this.lang.exclamation());
    }
    
    
    private void setAllText() {
        Welcome.setText(lang.welcome() + " " + lang.exclamation());
        Balance.setText(lang.checkBalance());
        Deposit.setText(lang.deposit());
        Withdraw.setText(lang.withdraw());
        Exit.setText(lang.exitATM());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Welcome = new javax.swing.JLabel();
        Balance = new javax.swing.JButton();
        Deposit = new javax.swing.JButton();
        Withdraw = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 500));
        setLayout(new java.awt.GridBagLayout());

        Welcome.setText("Welcome !");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 21, 0);
        add(Welcome, gridBagConstraints);

        Balance.setText("Check Balance");
        Balance.setMaximumSize(new java.awt.Dimension(135, 29));
        Balance.setMinimumSize(new java.awt.Dimension(135, 29));
        Balance.setPreferredSize(new java.awt.Dimension(135, 29));
        Balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        add(Balance, gridBagConstraints);

        Deposit.setText("Deposit");
        Deposit.setMaximumSize(new java.awt.Dimension(135, 29));
        Deposit.setMinimumSize(new java.awt.Dimension(135, 29));
        Deposit.setPreferredSize(new java.awt.Dimension(135, 29));
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        add(Deposit, gridBagConstraints);

        Withdraw.setText("Withdraw");
        Withdraw.setMaximumSize(new java.awt.Dimension(135, 29));
        Withdraw.setMinimumSize(new java.awt.Dimension(135, 29));
        Withdraw.setPreferredSize(new java.awt.Dimension(135, 29));
        Withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 0);
        add(Withdraw, gridBagConstraints);

        Exit.setText("Exit");
        Exit.setMaximumSize(new java.awt.Dimension(135, 29));
        Exit.setMinimumSize(new java.awt.Dimension(135, 29));
        Exit.setPreferredSize(new java.awt.Dimension(135, 29));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        add(Exit, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        saveData();
        
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        
    }//GEN-LAST:event_ExitActionPerformed

    private void BalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(frame, lang.balanceMessage() + lang.convertEnglishNumber(data.getBalance(key)) + lang.fullStop());
    }//GEN-LAST:event_BalanceActionPerformed

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        // TODO add your handling code here:
        String deposit = JOptionPane.showInputDialog(frame, lang.depositPrompt());
        
        int deposit_value=0;
        if(deposit.matches("[0-9]+"))
        {
            deposit_value = Integer.valueOf(deposit);
        
            data.augmentBalance(key, deposit_value);

            JOptionPane.showMessageDialog(frame, lang.balanceMessage() + lang.convertEnglishNumber(data.getBalance(key)) + lang.fullStop());
        }
        
        else
            JOptionPane.showMessageDialog(frame, lang.invalidDeposit());
    }//GEN-LAST:event_DepositActionPerformed

    private void WithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawActionPerformed
        // TODO add your handling code here:
        String withdrawal = JOptionPane.showInputDialog(frame, lang.withdrawalPrompt());
        
        int withdrawal_value=0;
        if(withdrawal.matches("[0-9]+"))
        {
            withdrawal_value = -Integer.valueOf(withdrawal);
            
            int current_balance = Integer.valueOf(data.getBalance(key));
            
            if(current_balance>Math.abs(withdrawal_value))
            {
        
                data.augmentBalance(key, withdrawal_value);

                JOptionPane.showMessageDialog(frame, lang.balanceMessage() + lang.convertEnglishNumber(data.getBalance(key)) + lang.fullStop());
            }
            
            else
                JOptionPane.showMessageDialog(frame, lang.excessWithdrawal());
        }
        
        else
            JOptionPane.showMessageDialog(frame, lang.invalidWithdrawal());
    }//GEN-LAST:event_WithdrawActionPerformed

    private void saveData()
    {
        try
        {
            data.writeToFile();
        }
        catch(FileNotFoundException e) {}
        catch(IOException e) {}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Balance;
    private javax.swing.JButton Deposit;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Welcome;
    private javax.swing.JButton Withdraw;
    // End of variables declaration//GEN-END:variables

}
