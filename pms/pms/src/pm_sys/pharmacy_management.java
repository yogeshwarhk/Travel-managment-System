/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm_sys;
import java.io.FileReader;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author bhanu
 */
public class pharmacy_management extends javax.swing.JFrame {
    /**
     * Creates new form pharmacy_management
     */
    public pharmacy_management() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    void D()
    {
        user.setText(null);
        pass.setText(null);
        cbox.setSelectedItem("Select user type");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cbox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        check = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setText("TRAVEL MANAGEMENT SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 520, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel2.setText("USER NAME :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, 110));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel3.setText("PASSWORD :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 118, 35));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 286, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel4.setText("USER TYPE :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 118, 44));

        cbox.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select user type", "Admin", "User" }));
        getContentPane().add(cbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 286, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 137, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jButton2.setText("REGISTER");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 137, -1));

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 286, 40));

        check.setText("Show Password");
        check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkMouseClicked(evt);
            }
        });
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pm_sys/ZPcDax.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JSONArray jrr = new JSONArray();
        Object ob = null;
        JSONParser Jp = new JSONParser();
        //fetch file--
        try{
            FileReader file = new FileReader("verify.json");
            ob=Jp.parse(file);
            jrr=(JSONArray) ob;
            file.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error Occured While fetching");
        }
//        register RR= new register();
        JSONObject obj = new JSONObject();
        int size = jrr.size();
        obj.put("User-type",cbox.getSelectedItem().toString());
        obj.put("Username",user.getText());
        obj.put("Password",pass.getText());
        String utype=cbox.getSelectedItem().toString();
        for(int i=0;i<size;i++){
            if(obj.equals(jrr.get(i))){
                
                
                try
            {
                if(utype.equals("Admin"))
                {
                    admin A= new admin();
                    user.setText("");
                    pass.setText("");
                    cbox.setSelectedItem("Select user type");
                    setVisible(false);
                    A.setVisible(true);
           
                }
                else if(utype.equals("User"))
                {
                    user U= new user();
                    user.setText("");
                    pass.setText("");
                    cbox.setSelectedItem("Select user type");
                    setVisible(false);
                    U.setVisible(true);
                }
                 else
                {
                 JOptionPane.showMessageDialog(rootPane,"wrong user");       
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(rootPane,ex);
            }
           
                break;
            }else if(i==size-1){
                JOptionPane.showMessageDialog(null,"Incorrect User/Password!");
            }
        }
        //j
       
    
        
        
        
        
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //D();
        
        register R = new register();
        R.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkActionPerformed

    private void checkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkMouseClicked
        // TODO add your handling code here:
        if(check.isSelected())
        {
            pass.setEchoChar((char)0);
        }
        else
        {
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_checkMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(pharmacy_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pharmacy_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pharmacy_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pharmacy_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pharmacy_management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JCheckBox check;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}