/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Management.System;


import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author harsh
 */
public class BookDetails extends javax.swing.JFrame {

    /**
     * Creates new form BookDetails
     */
    public BookDetails() {
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

        BookDetails_label = new javax.swing.JLabel();
        BookDetails_panel = new javax.swing.JPanel();
        Back_Label_btn = new javax.swing.JLabel();
        Search_tf = new javax.swing.JTextField();
        Search_btn = new javax.swing.JButton();
        Delete_btn = new javax.swing.JButton();
        Table_JScroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(827, 545));
        getContentPane().setLayout(null);

        BookDetails_label.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BookDetails_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Management/System/Icons/books_emoji_60px.png"))); // NOI18N
        BookDetails_label.setText("Book Details");
        getContentPane().add(BookDetails_label);
        BookDetails_label.setBounds(260, 0, 330, 70);

        BookDetails_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        BookDetails_panel.setOpaque(false);
        BookDetails_panel.setLayout(null);

        Back_Label_btn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Back_Label_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Management/System/Icons/icons8_left_3_30px.png"))); // NOI18N
        Back_Label_btn.setText("Back");
        Back_Label_btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                Home home = new Home();
                home.setVisible(true);
            }
        });
        BookDetails_panel.add(Back_Label_btn);
        Back_Label_btn.setBounds(12, 26, 79, 30);

        Search_tf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search_tf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Search_tf.setPreferredSize(new java.awt.Dimension(7, 30));
        BookDetails_panel.add(Search_tf);
        Search_tf.setBounds(95, 27, 324, 30);

        Search_btn.setBackground(new java.awt.Color(153, 255, 255));
        Search_btn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Management/System/Icons/icons8_search_30px_1.png"))); // NOI18N
        Search_btn.setText("Search");
        Search_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Search_btn.setFocusPainted(false);
        Search_btn.setFocusable(false);
        BookDetails_panel.add(Search_btn);
        Search_btn.setBounds(437, 25, 105, 32);

        Delete_btn.setBackground(new java.awt.Color(153, 255, 255));
        Delete_btn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Management/System/Icons/icons8_remove_30px.png"))); // NOI18N
        Delete_btn.setText("Delete");
        Delete_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Delete_btn.setFocusPainted(false);
        Delete_btn.setFocusable(false);
        BookDetails_panel.add(Delete_btn);
        Delete_btn.setBounds(552, 25, 105, 32);

        Table_JScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int row = table.getSelectedRow();
                Search_tf.setText(table.getModel().getValueAt(row, 1).toString());
            }
        });
        table.setBackground(new Color(240, 248, 255));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        Table_JScroll.setViewportView(table);

        BookDetails_panel.add(Table_JScroll);
        Table_JScroll.setBounds(12, 69, 666, 308);

        getContentPane().add(BookDetails_panel);
        BookDetails_panel.setBounds(70, 80, 690, 390);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Management/System/Icons/Summer Dog.jpg"))); // NOI18N
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 820, 510);

        pack();
        Book();
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
            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookDetails().setVisible(true);
            }
        });
    }

    public void Book() {
        try {
            conn con = new conn();
            String sql = "select * from book";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {

        }
    }

    public void actionPerformed(ActionEvent ae){
        try{

            conn con = new conn();
            if(ae.getSource() == Search_btn){

                String sql = "select * from book where concat(name, book_id) like ?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, "%" + Search_tf.getText() + "%");
                ResultSet rs = st.executeQuery();

                table.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
                st.close();

            }
            if(ae.getSource() == Delete_btn){
                String sql = "delete from book where name = '" + Search_tf.getText() + "'";
                PreparedStatement st = con.c.prepareStatement(sql);

                JDialog.setDefaultLookAndFeelDecorated(true);
                int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.NO_OPTION) {

                } else if (response == JOptionPane.YES_OPTION) {
                    int rs = st.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Deleted !!");
                } else if (response == JOptionPane.CLOSED_OPTION) {

                }
                st.close();


            }

            con.c.close();
        }catch(Exception e){

        }
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Back_Label_btn;
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel BookDetails_label;
    private javax.swing.JPanel BookDetails_panel;
    private javax.swing.JButton Delete_btn;
    private javax.swing.JButton Search_btn;
    private javax.swing.JTextField Search_tf;
    private javax.swing.JScrollPane Table_JScroll;
    private javax.swing.JTable table;
    // End of variables declaration
}