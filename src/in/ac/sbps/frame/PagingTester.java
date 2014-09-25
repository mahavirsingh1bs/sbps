/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.frame;

import in.ac.sbps.table.model.PagingModel;
import in.ac.sbps.table.model.StudentTableModel;
import java.awt.*;
import javax.swing.*;

public class PagingTester extends JFrame {

  public PagingTester() {
    super("Paged JTable Test");
    setSize(300, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    // PagingModel pm = new PagingModel();
    StudentTableModel pm = new StudentTableModel(
            new String [] {
                "Name", "Father Name", "Student Class", "Village"
            }, new Class[] {
                String.class, String.class, String.class, String.class
            }, 1);
    JTable jt = new JTable(pm);

    // Use our own custom scrollpane.
    JScrollPane jsp = StudentTableModel.configurePagingScrollPageForTable(jt);
    //JScrollPane scrollPane = new JScrollPane(jt);
    getContentPane().add(jsp, BorderLayout.CENTER);
    // setContentPane(scrollPane);
  }

  public static void main(String args[]) {
    PagingTester pt = new PagingTester();
    pt.setVisible(true);
  }
}