/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.frame;

import in.ac.sbps.domain.Student;
import in.ac.sbps.panel.AboutUsPanel;
import in.ac.sbps.panel.ContactUsPanel;
import in.ac.sbps.panel.StudentDetail;
import in.ac.sbps.panel.StudentSearch;
import in.ac.sbps.panel.TeacherDetail;
import in.ac.sbps.panel.TeacherSearch;
import in.ac.sbps.service.StudentService;
import in.ac.sbps.util.SClass;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author mahavir.singh
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        welcomeLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        studentMenu = new javax.swing.JMenu();
        addStudentMenuItem = new javax.swing.JMenuItem();
        editStudentMenuItem = new javax.swing.JMenuItem();
        deleteStudentMenuItem = new javax.swing.JMenuItem();
        teacherMenu = new javax.swing.JMenu();
        addTeacherMenuItem = new javax.swing.JMenuItem();
        editTeacherMenuItem = new javax.swing.JMenuItem();
        searchMenu = new javax.swing.JMenu();
        studentSearchMenuItem = new javax.swing.JMenuItem();
        teacherSearchMenuItem = new javax.swing.JMenuItem();
        aboutUsMenu = new javax.swing.JMenu();
        contactUsMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        welcomeLabel.setText("Welcome to Shri Bhagwan Public School");

        studentMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        studentMenu.setText("Student");
        studentMenu.setFont(new java.awt.Font("Raavi", 1, 12)); // NOI18N
        studentMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentMenuMouseEntered(evt);
            }
        });

        addStudentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        addStudentMenuItem.setText("Add");
        addStudentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentMenuItemActionPerformed(evt);
            }
        });
        studentMenu.add(addStudentMenuItem);

        editStudentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        editStudentMenuItem.setText("Edit");
        editStudentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentMenuItemActionPerformed(evt);
            }
        });
        studentMenu.add(editStudentMenuItem);

        deleteStudentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        deleteStudentMenuItem.setText("Delete");
        deleteStudentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentMenuItemActionPerformed(evt);
            }
        });
        studentMenu.add(deleteStudentMenuItem);

        jMenuBar1.add(studentMenu);

        teacherMenu.setText("Teacher");
        teacherMenu.setFont(new java.awt.Font("Raavi", 1, 12)); // NOI18N

        addTeacherMenuItem.setText("Add");
        addTeacherMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeacherMenuItemActionPerformed(evt);
            }
        });
        teacherMenu.add(addTeacherMenuItem);

        editTeacherMenuItem.setText("Edit");
        teacherMenu.add(editTeacherMenuItem);

        jMenuBar1.add(teacherMenu);

        searchMenu.setText("Search");
        searchMenu.setFont(new java.awt.Font("Raavi", 1, 12)); // NOI18N

        studentSearchMenuItem.setText("Student");
        studentSearchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSearchMenuItemActionPerformed(evt);
            }
        });
        searchMenu.add(studentSearchMenuItem);

        teacherSearchMenuItem.setText("Teacher");
        teacherSearchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSearchMenuItemActionPerformed(evt);
            }
        });
        searchMenu.add(teacherSearchMenuItem);

        jMenuBar1.add(searchMenu);

        aboutUsMenu.setText("About Us");
        aboutUsMenu.setFont(new java.awt.Font("Raavi", 1, 12)); // NOI18N
        aboutUsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutUsMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(aboutUsMenu);

        contactUsMenu.setText("Contact Us");
        contactUsMenu.setFont(new java.awt.Font("Raavi", 1, 12)); // NOI18N
        contactUsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactUsMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(contactUsMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addComponent(welcomeLabel)
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(welcomeLabel)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentMenuItemActionPerformed
        StudentDetail studentDetail = new StudentDetail();
        this.setContentPane(studentDetail);
    }//GEN-LAST:event_addStudentMenuItemActionPerformed

    private void editStudentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentMenuItemActionPerformed
        StudentDetail studentDetail = new StudentDetail();
        this.setContentPane(studentDetail);
    }//GEN-LAST:event_editStudentMenuItemActionPerformed

    private void deleteStudentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentMenuItemActionPerformed
        StudentDetail studentDetail = new StudentDetail();
        this.setContentPane(studentDetail);
    }//GEN-LAST:event_deleteStudentMenuItemActionPerformed

    private void addTeacherMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeacherMenuItemActionPerformed
        TeacherDetail teacherDetail = new TeacherDetail();
        this.setContentPane(teacherDetail);
    }//GEN-LAST:event_addTeacherMenuItemActionPerformed

    private void studentSearchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSearchMenuItemActionPerformed
        /**
        this.setContentPane(new JPanel());
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTable jTable1 = new javax.swing.JTable();
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            StudentDataAdapter.getData(),
            new String [] {
                "Name", "Father Name", "Student Class", "Village"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, SClass.class, java.lang.String.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        */
        StudentSearch studentSearch = new StudentSearch();
        this.setContentPane(studentSearch);
    }//GEN-LAST:event_studentSearchMenuItemActionPerformed

    private void teacherSearchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSearchMenuItemActionPerformed
        TeacherSearch teacherSearch = new TeacherSearch();
        this.setContentPane(teacherSearch);
    }//GEN-LAST:event_teacherSearchMenuItemActionPerformed

    private void studentMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMenuMouseEntered
        
    }//GEN-LAST:event_studentMenuMouseEntered

    private void contactUsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactUsMenuMouseClicked
        ContactUsPanel contactUsPanel = new ContactUsPanel();
        this.setContentPane(contactUsPanel);
    }//GEN-LAST:event_contactUsMenuMouseClicked

    private void aboutUsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsMenuMouseClicked
        AboutUsPanel aboutUsPanel = new AboutUsPanel();
        this.setContentPane(aboutUsPanel);
    }//GEN-LAST:event_aboutUsMenuMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutUsMenu;
    private javax.swing.JMenuItem addStudentMenuItem;
    private javax.swing.JMenuItem addTeacherMenuItem;
    private javax.swing.JMenu contactUsMenu;
    private javax.swing.JMenuItem deleteStudentMenuItem;
    private javax.swing.JMenuItem editStudentMenuItem;
    private javax.swing.JMenuItem editTeacherMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu searchMenu;
    private javax.swing.JMenu studentMenu;
    private javax.swing.JMenuItem studentSearchMenuItem;
    private javax.swing.JMenu teacherMenu;
    private javax.swing.JMenuItem teacherSearchMenuItem;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}

class StudentDataAdapter {
    public static String[][] getData() {
        StudentService studentService = (StudentService )in.ac.sbps.util.BeanResolverUtil.getBean("studentService");
        List<Student> students = studentService.findAllStudent();
        String[][] result = new String[students.size()][4];
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            result[i][0] = student.getFirstName() + " " + student.getLastName();
            result[i][1] = student.getFatherName();
            result[i][2] = SClass.enumToString(student.getStuClass());
            result[i][3] = student.getVillage();
        }
        return result;
    }
}