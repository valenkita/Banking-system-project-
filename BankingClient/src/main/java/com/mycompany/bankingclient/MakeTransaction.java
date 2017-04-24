/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingclient;

import com.mycompany.bankingclient.models.BankAccount;
import com.mycompany.bankingclient.models.Customer;
import com.mycompany.bankingclient.models.Transaction;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Banking system
 * Final version
 * Date 24/04/2017
 * @reference https://www.youtube.com/watch?v=RDUPOnXCmuw&feature=youtu.be
 * @author Jun Hsin Lim, Stuent ID  X16123107
 * @author Jessica Valeria Hernandez Ramirez, Student ID X16118677
 */
public class MakeTransaction extends javax.swing.JFrame {

    List<BankAccount> accountList;
    List<String> accountNumber;
    Customer customer;
    BankAccount selectedAccount;
    final String TRANSACTION_API_PATH = "http://localhost:8080/BankingSystem/api/transaction";
    final String ACCOUNT_API_PATH = "http://localhost:8080/BankingSystem/api/bankAccount";
    /**
     * Creates new form Transaction
     */
    public MakeTransaction() {
        initComponents();
        accountNumber = new ArrayList<>();
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
        UserName.setText(customer.getFullName());
    }

    public void setAccountList(List<BankAccount> accountList) {
        this.accountList = accountList;
        
        for(BankAccount account: accountList){
            accountNumber.add(account.getAId()+" " + account.getAccountType());
        }
        
        this.accounts.setModel(new DefaultComboBoxModel(accountNumber.toArray()));
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        transactionType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        accounts = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        submit_Transaction = new javax.swing.JButton();
        amount = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel1.setText("jj's bank");

        UserName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UserName.setText("*User Name*");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Type of Transaction:");

        transactionType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        transactionType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lodgement", "Withdraw", "Transfer" }));
        transactionType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionTypeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("From Account:");

        accounts.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        accounts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        accounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Description:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Amount:");

        submit_Transaction.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submit_Transaction.setText("Submit");
        submit_Transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_TransactionActionPerformed(evt);
            }
        });

        amount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        desc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(submit_Transaction)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(accounts, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(transactionType, javax.swing.GroupLayout.Alignment.LEADING, 0, 224, Short.MAX_VALUE)
                                .addComponent(amount, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(desc)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserName)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(transactionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(accounts, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submit_Transaction)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transactionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionTypeActionPerformed

    private void accountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountsActionPerformed

    private void submit_TransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_TransactionActionPerformed
       Transaction t = new Transaction();
       selectedAccount = accountList.get(accounts.getSelectedIndex());
       
       t.setAId(selectedAccount);
       t.setCusId(customer);
       BigDecimal amt = new BigDecimal(amount.getText());
       t.setAmount(amt);
       t.setDescription(desc.getText());
       t.setTType(transactionType.getSelectedItem().toString());
       t.setDate(new Date());
       
       boolean status = RESTConnection.sendPostRequest(t, TRANSACTION_API_PATH);
       
       if(status == true){
            BigDecimal oriBal = selectedAccount.getBalance();
            BigDecimal newBal = BigDecimal.ZERO;
            if(transactionType.getSelectedItem().toString().equals("Lodgement")){
                newBal = oriBal.add(amt);
            }else if(transactionType.getSelectedItem().toString().equals("Withdraw")){
                newBal = oriBal.subtract(amt);
            }else if(transactionType.getSelectedItem().toString().equals("Transfer")){
                newBal = oriBal.subtract(amt);
            }
            selectedAccount.setBalance(newBal);
            boolean accountStatus = RESTConnection.sendPutRequest(selectedAccount, ACCOUNT_API_PATH, selectedAccount.getAId());
            if(accountStatus == true){
                JOptionPane.showMessageDialog(null, "Your transaction has been completed and your balance has been updated.");
                
                Home myHome = new Home();
                myHome.setCustomer(customer);
                myHome.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Your account balance could not be updated");
            }
        }else{
           JOptionPane.showMessageDialog(null, "Unable to complete transaction.");
       }
    }//GEN-LAST:event_submit_TransactionActionPerformed

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
            java.util.logging.Logger.getLogger(MakeTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserName;
    private javax.swing.JComboBox<String> accounts;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField desc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton submit_Transaction;
    private javax.swing.JComboBox<String> transactionType;
    // End of variables declaration//GEN-END:variables
}
