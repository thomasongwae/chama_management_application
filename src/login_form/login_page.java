
package login_form;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;



/**
 *
 * @author thomasongwae
 */
public class login_page extends javax.swing.JFrame {

    /**
     * Creates new form login_page
     */
    public  login_page()
    {   
        
        
         //home_page page = new home_page();  
         //page.setVisible(true);  
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Admin log in");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(543, 320));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Abhaya Libre", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("   Login  Form");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("UserName ");

        jTextField1.setText("username");
        jTextField1.setToolTipText("");
        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1InputMethodTextChanged(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("PassWord");

        jButton1.setText("Login Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPasswordField1.setText("password");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Remember me");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        System.out.println("Login Button pressed successfully");
         String textFieldValue = jTextField1.getText();
          String passwordfield =jPasswordField1.getText();
             
        Connection conn = null;
        Statement stmt = null;
               
               
        try {
            Class.forName("org.sqlite.JDBC");
        
            conn = DriverManager.getConnection("jdbc:sqlite:login_form.db");
            
                     System.out.println("Connected to database successfully");
              
             
             System.out.println("\nReading from a database");
            // conn.setAutoCommit(false);
            
             
              stmt = conn.createStatement();
              
              String sql = "SELECT * FROM admin";
              
              
            
             var result = stmt.executeQuery(sql);  
              
             
              while (result.next()) 
              {
                  
                 //System.out.println(result.getInt("id") +  "\t" + result.getString("username") + "\t" + result.getString("password")); 
                 System.out.println("Password retrived from the Database successfully"); 
                 
                       
                if (textFieldValue.equals(result.getString("username")) && passwordfield.equals(result.getString("password"))) 
         
                   {
              
              
              
          
              JOptionPane.showMessageDialog(null,"Hello " +textFieldValue+ " Login was Successfully");
              
              dispose();
             
           
              JFrame frame;
              frame = new JFrame();
       
      
         
                   
                // close connection to a database
                 result.close();
                 stmt.close();
                 conn.close();
              
              
                
                home_page page = new home_page();  
                page.setVisible(true);  
          
            
                   }
          
                else 
                      {   
              
              
               // close connection to a database
                 result.close();
                 stmt.close();
                //conn.commit();
                 conn.close();
              
                   JOptionPane.showMessageDialog(null, "Password does not match");
                   
                   
                   
                      JFrame frame;
                      frame = new JFrame();
       

         
              
              
                 }
                 
          
                 
              }
            
             
          
               
        }
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex)
        {  
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
        }
               
     
          
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void jTextField1ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_jTextField1ActionPerformed
        //jTextField1.setToolTipText("here you enter your username");
        System.out.println("Username jtextfield clicked");
        String textFieldValue = jTextField1.getText();
         System.out.println(textFieldValue);
         /*
         if (textFieldValue.equals("admin"))
                 {
                     System.out.println("Username matched");
                 }
         else
         {
           System.out.println("invalid Username");
         }
         */
    }//GEN-LAST:event_jTextField1ActionPerformed

    public void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
           System.out.println("Password jpasswordfield clicked");
               String passwordfield =jPasswordField1.getText();
               //System.out.println(jPasswordField1);
               
               
           /*     
         if (passwordfield.equals("admin"))
                 {
                     System.out.println("Password matched");
                 }
         else
         {
           System.out.println("incorrect password try again");
         }
               */
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    public void jTextField1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1InputMethodTextChanged

    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("Reset button clicked");
          JOptionPane.showMessageDialog(null, "Not yet Working, contact admin");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
         System.out.println("Remember checkbox ticked");
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
         
       
        
        
         
        JOptionPane optionPane = new JOptionPane("Confirm to Exit Login Form",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION);
         
         
         JFrame frame;
         frame = new JFrame();
         JDialog dialog = new JDialog(frame,"Exiting", true);
         dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                 
                 
                // dialog.setLocationRelativeTo(this); 
                 pack();
                 dialog.setLocationRelativeTo(null);
                 
                 dialog.setResizable(false);
                 dialog.setContentPane(optionPane);
                 
                 
                 
                 
                 optionPane.addPropertyChangeListener(
                                 new PropertyChangeListener() {
                                 public void propertyChange(PropertyChangeEvent e) {
            String prop = e.getPropertyName();

            if (dialog.isVisible() 
             && (e.getSource() == optionPane)
             && (prop.equals(JOptionPane.VALUE_PROPERTY))) 
            {
                //If you were going to check something
                //before closing the window, you'd do
                //it here.
                dialog.setVisible(false);
                
               // dialog.dispose();
            }
        }
              });
                dialog.pack();
                dialog.setVisible(true);
                
                 

        int value = ((Integer)optionPane.getValue()).intValue();
              if (value == JOptionPane.YES_OPTION)
                    {
                         //dispose();
                         dialog.dispose();  //kill the dialog
                         frame.dispose();   //kill the jframe
                         dispose();        //kill the whole program
                         System.exit(0);
                        
                         
                    }
              else if (value == JOptionPane.NO_OPTION)
                    {
                        System.out.println("Operation Canceled by the User");
                       
                    }
                 
                 
           
       
    }//GEN-LAST:event_jButton3ActionPerformed

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
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

   
    }

