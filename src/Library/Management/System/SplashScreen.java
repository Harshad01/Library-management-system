/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Management.System;
import javax.swing.*;

/**
 *
 * @author harsh
 */
public class SplashScreen extends javax.swing.JFrame {



    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        Background = new javax.swing.JPanel();
        LibraryPhoto = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        LoadingName = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(697, 451));

        Background.setLayout(null);

        LibraryPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Management/System/Icons/6615-removebg-preview.png"))); // NOI18N
        Background.add(LibraryPhoto);
        LibraryPhoto.setBounds(120, 0, 470, 310);

        Name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Name.setText("Library Management System");
        Background.add(Name);
        Name.setBounds(190, 300, 330, 50);
        Background.add(LoadingBar);
        LoadingBar.setBounds(0, 440, 700, 10);

        LoadingName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LoadingName.setText("Loading....");
        Background.add(LoadingName);
        LoadingName.setBounds(0, 420, 270, 16);

        LoadingValue.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LoadingValue.setText("0%");
        Background.add(LoadingValue);
        LoadingValue.setBounds(670, 420, 30, 16);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Management/System/Icons/Cinnamint.jpg"))); // NOI18N
        Background.add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 700, 450);

        getContentPane().add(Background, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SplashScreen sp = new SplashScreen();
        Login_user Login = new Login_user();
        sp.setVisible(true);

        try {
            for(int i =0;i<=100;i++){
                Thread.sleep(100);
                sp.LoadingValue.setText(i+"%");

                if(i==10){
                    sp.LoadingName.setText("Turning On Module.....");

                }

                if(i==20){
                    sp.LoadingName.setText("Loading Module.....");
                }

                if(i==50){
                    sp.LoadingName.setText("Connecting to the Database.....");
                }

                if(i==70){
                    sp.LoadingName.setText("Connection Successful.....");
                }

                if(i==80){
                    sp.LoadingName.setText("Launching Application.....");
                }
                sp.LoadingBar.setValue(i);
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
        new SplashScreen().setVisible(false);
        Login.setVisible(true);
        sp.dispose();


    }

    // Variables declaration - do not modify
    private javax.swing.JPanel Background;
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel LibraryPhoto;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingName;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel Name;
    // End of variables declaration
}
