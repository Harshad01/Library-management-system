/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Management.System;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author harsh
 */
public class IssueBook extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
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

        AddBook_panel = new javax.swing.JPanel();
        BookID_Label = new javax.swing.JLabel();
        BookID_tf = new javax.swing.JTextField();
        BookName_label = new javax.swing.JLabel();
        BookName_tf = new javax.swing.JTextField();
        ISBN_label = new javax.swing.JLabel();
        ISBN_tf = new javax.swing.JTextField();
        Publisher = new javax.swing.JLabel();
        Publisher_tf = new javax.swing.JTextField();
        Edition_label = new javax.swing.JLabel();
        Edition_tf = new javax.swing.JTextField();
        Price_label = new javax.swing.JLabel();
        Price_tf = new javax.swing.JTextField();
        Pages = new javax.swing.JLabel();
        Pages_tf = new javax.swing.JTextField();
        BookSearch_btn = new javax.swing.JButton();
        AddStudent_panel = new javax.swing.JPanel();
        StudentID_label = new javax.swing.JLabel();
        StudentID_tf = new javax.swing.JTextField();
        StudentName_label = new javax.swing.JLabel();
        StudentName_tf = new javax.swing.JTextField();
        FatherName_label = new javax.swing.JLabel();
        FatherName_tf = new javax.swing.JTextField();
        Course_label = new javax.swing.JLabel();
        Course_tf = new javax.swing.JTextField();
        Branch_label = new javax.swing.JLabel();
        Branch_tf = new javax.swing.JTextField();
        Year_label = new javax.swing.JLabel();
        Year_tf = new javax.swing.JTextField();
        Semester_label = new javax.swing.JLabel();
        Semester_tf = new javax.swing.JTextField();
        StudentSearch_btn = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        DateOfIssue_label = new javax.swing.JLabel();
        Back_btn = new javax.swing.JButton();
        Issue_btn = new javax.swing.JButton();
        BackGroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(875, 582));
        getContentPane().setLayout(null);

        AddBook_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Issue Book", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        AddBook_panel.setOpaque(false);
        AddBook_panel.setLayout(null);

        BookID_Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BookID_Label.setText("Book_ID:-");
        AddBook_panel.add(BookID_Label);
        BookID_Label.setBounds(24, 47, 65, 25);

        BookID_tf.setBackground(new java.awt.Color(255, 255, 255));
        BookID_tf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddBook_panel.add(BookID_tf);
        BookID_tf.setBounds(99, 52, 80, 26);

        BookName_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BookName_label.setText("Name:-");
        AddBook_panel.add(BookName_label);
        BookName_label.setBounds(24, 99, 65, 20);

        BookName_tf.setEditable(false);
        BookName_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BookName_tf.setPreferredSize(new java.awt.Dimension(7, 28));
        AddBook_panel.add(BookName_tf);
        BookName_tf.setBounds(99, 96, 269, 28);

        ISBN_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ISBN_label.setText("ISBN:-");
        AddBook_panel.add(ISBN_label);
        ISBN_label.setBounds(24, 143, 42, 20);

        ISBN_tf.setEditable(false);
        ISBN_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ISBN_tf.setPreferredSize(new java.awt.Dimension(7, 28));
        AddBook_panel.add(ISBN_tf);
        ISBN_tf.setBounds(99, 140, 269, 28);

        Publisher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Publisher.setText("Publisher:-");
        AddBook_panel.add(Publisher);
        Publisher.setBounds(24, 187, 72, 20);

        Publisher_tf.setEditable(false);
        Publisher_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Publisher_tf.setPreferredSize(new java.awt.Dimension(7, 28));
        AddBook_panel.add(Publisher_tf);
        Publisher_tf.setBounds(100, 184, 268, 28);

        Edition_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Edition_label.setText("Edition:-");
        AddBook_panel.add(Edition_label);
        Edition_label.setBounds(24, 232, 56, 20);

        Edition_tf.setEditable(false);
        Edition_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Edition_tf.setPreferredSize(new java.awt.Dimension(7, 28));
        AddBook_panel.add(Edition_tf);
        Edition_tf.setBounds(100, 230, 268, 28);

        Price_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price_label.setText("Price:-");
        AddBook_panel.add(Price_label);
        Price_label.setBounds(24, 277, 44, 20);

        Price_tf.setEditable(false);
        Price_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Price_tf.setPreferredSize(new java.awt.Dimension(7, 28));
        AddBook_panel.add(Price_tf);
        Price_tf.setBounds(100, 274, 268, 28);

        Pages.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pages.setText("Pages:-");
        AddBook_panel.add(Pages);
        Pages.setBounds(24, 321, 50, 20);

        Pages_tf.setEditable(false);
        Pages_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Pages_tf.setPreferredSize(new java.awt.Dimension(7, 28));
        AddBook_panel.add(Pages_tf);
        Pages_tf.setBounds(100, 318, 268, 28);

        BookSearch_btn.setBackground(new java.awt.Color(153, 255, 255));
        BookSearch_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BookSearch_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Management/System/Icons/icons8_search_30px_1.png"))); // NOI18N
        BookSearch_btn.setText("Search");
        BookSearch_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BookSearch_btn.setFocusPainted(false);
        BookSearch_btn.setFocusable(false);
        BookSearch_btn.addActionListener(this);
        AddBook_panel.add(BookSearch_btn);
        BookSearch_btn.setBounds(200, 40, 100, 40);

        getContentPane().add(AddBook_panel);
        AddBook_panel.setBounds(30, 30, 380, 370);

        AddStudent_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Student Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        AddStudent_panel.setOpaque(false);
        AddStudent_panel.setLayout(null);

        StudentID_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StudentID_label.setText("Student_ID:-");
        AddStudent_panel.add(StudentID_label);
        StudentID_label.setBounds(30, 60, 81, 20);

        StudentID_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StudentID_tf.setPreferredSize(new java.awt.Dimension(71, 28));
        AddStudent_panel.add(StudentID_tf);
        StudentID_tf.setBounds(140, 60, 80, 28);

        StudentName_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StudentName_label.setText("Name:-");
        AddStudent_panel.add(StudentName_label);
        StudentName_label.setBounds(30, 110, 50, 20);

        StudentName_tf.setEditable(false);
        StudentName_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StudentName_tf.setPreferredSize(new java.awt.Dimension(71, 28));
        AddStudent_panel.add(StudentName_tf);
        StudentName_tf.setBounds(140, 110, 232, 28);

        FatherName_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FatherName_label.setText("Father's Name:-");
        AddStudent_panel.add(FatherName_label);
        FatherName_label.setBounds(30, 150, 106, 20);

        FatherName_tf.setEditable(false);
        FatherName_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FatherName_tf.setPreferredSize(new java.awt.Dimension(7, 28));
        AddStudent_panel.add(FatherName_tf);
        FatherName_tf.setBounds(140, 150, 232, 28);

        Course_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Course_label.setText("Course:-");
        AddStudent_panel.add(Course_label);
        Course_label.setBounds(30, 190, 56, 20);

        Course_tf.setEditable(false);
        Course_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Course_tf.setPreferredSize(new java.awt.Dimension(7, 28));
        AddStudent_panel.add(Course_tf);
        Course_tf.setBounds(140, 190, 232, 28);

        Branch_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Branch_label.setText("Branch:-");
        AddStudent_panel.add(Branch_label);
        Branch_label.setBounds(30, 240, 56, 20);

        Branch_tf.setEditable(false);
        Branch_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Branch_tf.setPreferredSize(new java.awt.Dimension(7, 28));

        AddStudent_panel.add(Branch_tf);
        Branch_tf.setBounds(140, 240, 232, 28);

        Year_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Year_label.setText("Year:-");
        AddStudent_panel.add(Year_label);
        Year_label.setBounds(30, 280, 41, 20);

        Year_tf.setEditable(false);
        Year_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Year_tf.setPreferredSize(new java.awt.Dimension(7, 28));
        AddStudent_panel.add(Year_tf);
        Year_tf.setBounds(140, 280, 232, 28);

        Semester_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Semester_label.setText("Semester:-");
        AddStudent_panel.add(Semester_label);
        Semester_label.setBounds(30, 330, 72, 20);

        Semester_tf.setEditable(false);
        Semester_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Semester_tf.setPreferredSize(new java.awt.Dimension(7, 28));
        AddStudent_panel.add(Semester_tf);
        Semester_tf.setBounds(140, 330, 232, 28);

        StudentSearch_btn.setBackground(new java.awt.Color(153, 255, 255));
        StudentSearch_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StudentSearch_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Management/System/Icons/icons8_search_30px_1.png"))); // NOI18N
        StudentSearch_btn.setText("Search");
        StudentSearch_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StudentSearch_btn.setFocusPainted(false);
        StudentSearch_btn.setFocusable(false);
        StudentSearch_btn.addActionListener(this);
        AddStudent_panel.add(StudentSearch_btn);
        StudentSearch_btn.setBounds(240, 50, 100, 40);

        getContentPane().add(AddStudent_panel);
        AddStudent_panel.setBounds(440, 30, 380, 410);

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDateChooser1.setDateFormatString("YYYY-MM-dd\n\n");
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(160, 430, 200, 30);

        DateOfIssue_label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        DateOfIssue_label.setText("Date Of Issue:-");
        getContentPane().add(DateOfIssue_label);
        DateOfIssue_label.setBounds(40, 430, 110, 22);

        Back_btn.setBackground(new java.awt.Color(153, 255, 255));
        Back_btn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Management/System/Icons/icons8_left_3_30px_1.png"))); // NOI18N
        Back_btn.setText("Back");
        Back_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Back_btn.setFocusPainted(false);
        Back_btn.setFocusable(false);
        Back_btn.addActionListener(this);
        getContentPane().add(Back_btn);
        Back_btn.setBounds(200, 490, 110, 40);

        Issue_btn.setBackground(new java.awt.Color(153, 255, 255));
        Issue_btn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Issue_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Management/System/Icons/icons8_event_accepted_tentatively_30px.png"))); // NOI18N
        Issue_btn.setText("Issue");
        Issue_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Issue_btn.setFocusPainted(false);
        Issue_btn.setFocusable(false);
        Issue_btn.addActionListener(this);
        getContentPane().add(Issue_btn);
        Issue_btn.setBounds(60, 490, 110, 40);

        BackGroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Management/System/Icons/Summer Dog.jpg"))); // NOI18N
        BackGroundImage.setText("jLabel1");
        getContentPane().add(BackGroundImage);
        BackGroundImage.setBounds(0, 0, 860, 560);

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == BookSearch_btn){
                String sql = "select * from book where book_id = ?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, BookID_tf.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    BookName_tf.setText(rs.getString("name"));
                    ISBN_tf.setText(rs.getString("isbn"));
                    Publisher_tf.setText(rs.getString("publisher"));
                    Edition_tf.setText(rs.getString("edition"));
                    Price_tf.setText(rs.getString("price"));
                    Pages_tf.setText(rs.getString("pages"));
                }
                st.close();
                rs.close();

            }
            if(ae.getSource() == StudentSearch_btn){
                String sql = "select * from student where student_id = ?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, StudentID_tf.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    StudentName_tf.setText(rs.getString("name"));
                    FatherName_tf.setText(rs.getString("father"));
                    Course_tf.setText(rs.getString("course"));
                    Branch_tf.setText(rs.getString("branch"));
                    Year_tf.setText(rs.getString("year"));
                    Semester_tf.setText(rs.getString("semester"));
                }
                st.close();
                rs.close();

            }
            if(ae.getSource() == Issue_btn){
                try{
                    String sql = "insert into issueBook(book_id, student_id, bname, sname, course, branch, dateOfIssue) values(?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1, BookID_tf.getText());
                    st.setString(2, StudentID_tf.getText());
                    st.setString(3, BookName_tf.getText());
                    st.setString(4, StudentName_tf.getText());
                    st.setString(5, Course_tf.getText());
                    st.setString(6, Branch_tf.getText());
                    st.setString(7, ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
                    int i = st.executeUpdate();
                    if (i > 0)
                        JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
                    else
                        JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(ae.getSource() == Back_btn){
                this.setVisible(false);
                new Home().setVisible(true);

            }

            con.c.close();
        }catch(Exception e){

        }
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel AddBook_panel;
    private javax.swing.JPanel AddStudent_panel;
    private javax.swing.JLabel BackGroundImage;
    private javax.swing.JButton Back_btn;
    private javax.swing.JLabel BookID_Label;
    private javax.swing.JTextField BookID_tf;
    private javax.swing.JLabel BookName_label;
    private javax.swing.JTextField BookName_tf;
    private javax.swing.JButton BookSearch_btn;
    private javax.swing.JLabel Branch_label;
    private javax.swing.JTextField Branch_tf;
    private javax.swing.JLabel Course_label;
    private javax.swing.JTextField Course_tf;
    private javax.swing.JLabel DateOfIssue_label;
    private javax.swing.JLabel Edition_label;
    private javax.swing.JTextField Edition_tf;
    private javax.swing.JLabel FatherName_label;
    private javax.swing.JTextField FatherName_tf;
    private javax.swing.JLabel ISBN_label;
    private javax.swing.JTextField ISBN_tf;
    private javax.swing.JButton Issue_btn;
    private javax.swing.JLabel Pages;
    private javax.swing.JTextField Pages_tf;
    private javax.swing.JLabel Price_label;
    private javax.swing.JTextField Price_tf;
    private javax.swing.JLabel Publisher;
    private javax.swing.JTextField Publisher_tf;
    private javax.swing.JLabel Semester_label;
    private javax.swing.JTextField Semester_tf;
    private javax.swing.JLabel StudentID_label;
    private javax.swing.JTextField StudentID_tf;
    private javax.swing.JLabel StudentName_label;
    private javax.swing.JTextField StudentName_tf;
    private javax.swing.JButton StudentSearch_btn;
    private javax.swing.JLabel Year_label;
    private javax.swing.JTextField Year_tf;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    // End of variables declaration
}
