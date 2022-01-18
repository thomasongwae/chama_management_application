
package login_form;


import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileSystemView;  
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException; 
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.sql.PreparedStatement;  
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author thomasongwae
 */
public class register_form extends javax.swing.JFrame {

    /**
     * Creates new form register_form
     */
 
    
    
    
     
    
    
    public register_form() 
    {   
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registration Form");
        setMinimumSize(new java.awt.Dimension(763, 340));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Full Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 39, 83, 39);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(115, 35, 332, 46);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Mobile");
        jLabel2.setMaximumSize(new java.awt.Dimension(68, 20));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 91, 68, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(115, 91, 332, 48);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(200, 199, 59, 37);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton2StateChanged(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(307, 199, 74, 37);

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 207, 79, 20);

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel5.setText("ID Number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(12, 146, 103, 47);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(115, 145, 332, 47);

        jButton1.setBackground(new java.awt.Color(61, 99, 136));
        jButton1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 57));
        jButton1.setText("Submit");
        jButton1.setPreferredSize(new java.awt.Dimension(78, 42));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(378, 254, 78, 42);

        jButton2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(251, 0, 174));
        jButton2.setText("Reset");
        jButton2.setMaximumSize(new java.awt.Dimension(70, 42));
        jButton2.setMinimumSize(new java.awt.Dimension(70, 42));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(109, 254, 83, 42);

        jButton3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jButton3.setText("Add Picture");
        jButton3.setMaximumSize(new java.awt.Dimension(70, 35));
        jButton3.setMinimumSize(new java.awt.Dimension(70, 42));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(266, 254, 100, 42);

        jButton4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jButton4.setText("Exit");
        jButton4.setMaximumSize(new java.awt.Dimension(70, 42));
        jButton4.setMinimumSize(new java.awt.Dimension(70, 42));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(12, 254, 79, 42);

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 13, 50));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("No Photo Selected");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(474, 12, 265, 284);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
          System.out.println("ID number");
          String textFieldValue4 = jTextField3.getText();
          System.out.println(textFieldValue4);
    }//GEN-LAST:event_jTextField3ActionPerformed

    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         System.out.println("Reset button clicked");
         
         String def = "";
            jTextField1.setText(def);
                System.out.println("Name cleared");
            jTextField2.setText(def);
                System.out.println("Mobile cleared");
            jTextField3.setText(def);
                System.out.println("ID cleared");
            
            jRadioButton1.setSelected(false);  
                System.out.println("male selection cleared");
            jRadioButton2.setSelected(false);
                System.out.println("Female selection cleared");
                    
            jLabel4.setIcon(null);
                 System.out.println("Image cleared");
                 
                 
                 
                    
           /* res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
         */
            
    }//GEN-LAST:event_jButton2ActionPerformed

    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.out.println("Submit button clicked");
        
        String textFieldValue = jTextField1.getText(); // name
            String textFieldValue1 = textFieldValue.toUpperCase();
                    
                    
        String textFieldValue2 = jTextField2.getText(); //mobile
           
              
         String textFieldValue4 = jTextField3.getText(); //ID
        // String imageIcon = jLabel4.getText();
        
         
        
         
        // String  data1 ;
        String data1 = null;
        // String data1 = new String();
         
        
        //trying to prevent entering null name, id  number and phone number into the database
        
        if (textFieldValue1.isEmpty() || textFieldValue2.isEmpty() || textFieldValue4.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter the details first");
        } 
        
                
        else
        {
        
        //used two if two work with radiobutton , although it is not good programming but it worked !!!
         if (jRadioButton1.isSelected())
             
              {
             //jRadioButton1.isSelected(); //male selected
                data1 = "Male";
               } 
         
         if (jRadioButton2.isSelected())
         
             {
             jRadioButton2.isSelected();
             data1 = "Female";
             
             }
         
         
        //colletion image to insert into a database
         
            
        
               System.out.println("Image Path this is from the submit button- " + path);
              //System.out.println("Image Name this is from the submit button- " + f.getName());
              
                //   f = new File(path);
               
                
         
        
        System.out.println("Full Name: " + textFieldValue1  + "\nMobile: " +textFieldValue2 +" \nID: "+textFieldValue4 + "\nGender: "+data1);
        
        //Here i need to figure out how to store data into sqlite database
        
        //trying to see if it works
        
        
        
      // jdbc:sqlite:groupmember.db;
         Connection conn = null;
         
         PreparedStatement stmt = null;
         
       
        
        try 
           {
               
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:login_form.db");
            
                     System.out.println("Opened database successfully");
              
             
             System.out.println("\nReady to commint data into database");
            conn.setAutoCommit(false);
           
             //stmt = conn.createStatement();
             
             
           String sql = ("INSERT INTO details (names,idnumber,mobile,gender,photo) VALUES('" + textFieldValue1 + "','" + textFieldValue4 + "','" + textFieldValue2 + "','" + data1 + "',?);");
               
        
        
            stmt=conn.prepareStatement(sql);
                   
            stmt.setBytes(1, pimage);
            stmt.execute();
                
                   conn.commit();
                   stmt.close();
                   conn.close();
             
             
            
            
             System.out.println("Records created successfully");
             
                
                  JOptionPane.showMessageDialog(null, "Details Saved successfully");
                  
               //home_page page2 = new home_page();
               //page2.updatingjlist();

        
        
        
              
           } 
           catch (ClassNotFoundException ex)
                  {
                       System.out.println("unknown error 1");
                    } 
        catch (SQLException ex)
                {
                    System.out.println("unknown error 1");
            
                 } 
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    public void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
         System.out.println("Full name text area");
         String textFieldValue = jTextField1.getText();
         System.out.println(textFieldValue);
          
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    public void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
          System.out.println("Mobile phone Number");
          String textFieldValue2 = jTextField2.getText();
         System.out.println(textFieldValue2);
    }//GEN-LAST:event_jTextField2ActionPerformed

    public void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        System.out.println("Gender Male button");
        
        jRadioButton1.isSelected();
            System.out.println("Male selected");
              
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    public void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
         System.out.println("Gender Female button");
         
            jRadioButton2.isSelected();
             System.out.println("Female selected");
             
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                    
        
                     System.out.println("Picture button selected");
            
                     JFileChooser fileChooser = new JFileChooser();
                     
                      //Only search for images with these extensions.

                  FileNameExtensionFilter fnwf = new FileNameExtensionFilter("PNG JPG AND JPEG", "png", "jpeg", "jpg");
                     fileChooser.addChoosableFileFilter(fnwf);
                     int load = fileChooser.showOpenDialog(null);
                     
                     //If open button has being clicked.
                     if (load == fileChooser.APPROVE_OPTION) 
                          {
                           //  File f = null;
                             f = fileChooser.getSelectedFile();
                             
                             
                             
                            //Store image path in a string.
                          //  String path = null;
                            path = f.getAbsolutePath();
                            
                                
                            
                               
                           
                            
                         //Show image path in the textfield.
                          //jTextField1.setText(path);
                          System.out.println(path);
                          ImageIcon ii = new ImageIcon(path);
                          
                          
                          //Resize image to fit jlabel.
                             Image img = ii.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_SMOOTH);
                             
                             //display image on jpanel
                             jLabel4.setIcon(new ImageIcon(img));
                     
                             
                             try
                             {
                                 
                             File image=new File(path);
                             
                            
                             
                             FileInputStream fis=new FileInputStream(image);
                             
                              ByteArrayOutputStream baos=new ByteArrayOutputStream();
                                 byte[] buf=new byte[1024];
                                 
                                 for(int readnum; (readnum=fis.read(buf)) !=-1;)
                                        {            
                                         baos.write(buf,0,readnum);                
                                       }
                           
                                  pimage = baos.toByteArray();
                             
                             }
                             
                             catch (FileNotFoundException ex) 
                             {
                             Logger.getLogger(register_form.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex)
                            {
                             Logger.getLogger(register_form.class.getName()).log(Level.SEVERE, null, ex);
                         }
                             
                                  
                     
                          }
                     
                          
                       
                     
                    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        dispose();
         //System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton2StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2StateChanged

   
    
    
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new register_form().setVisible(true);
              
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
    
    //making these varible global so that they can be accesed from anyway in the program
    
    File f = null;         
    String path = null; 
    byte[] pimage = null;
   
   
}

        
