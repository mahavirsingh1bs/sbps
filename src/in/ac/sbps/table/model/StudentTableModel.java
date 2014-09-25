/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.table.model;

import in.ac.sbps.domain.Student;
import in.ac.sbps.service.StudentService;
import in.ac.sbps.util.BeanResolverUtil;
import in.ac.sbps.util.SClass;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author mahavir.singh
 */
public class StudentTableModel extends AbstractTableModel {
    private List<Student> students = null;
    private String[] columnNames = null;
    private Class[] columnClasses = null;
    
    private int pageSize;
    private int pageOffset;
    
    public StudentTableModel(String[] columnNames, int pageSize) {
        this.columnNames = columnNames;
        this.pageSize = pageSize;
    }
    
    public StudentTableModel(String[] columnNames, Class[] columnClasses, int pageSize) {
        this.columnNames = columnNames;
        this.columnClasses = columnClasses;
        this.pageSize = pageSize;
    }
    
    private void initializeStudents() {
        StudentService studentService = (StudentService )BeanResolverUtil.getBean("studentService");
        students = studentService.findAllStudent();
    }
    
    @Override
    public int getRowCount() {
        if (students == null) {
            initializeStudents();
        }
        return Math.min(pageSize, students.size());
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        int realRowIndex = rowIndex + (pageSize * pageOffset);
        Student student = students.get(realRowIndex);
        switch(columnIndex) {
            case 0:
                return student.getFirstName() + " " + student.getLastName();
            case 1:
                return student.getFatherName();
            case 2:
                return SClass.enumToString(student.getStuClass());
            case 3:
                    return student.getVillage();
            default:
                return null;
        }
    }
    
    public int getPageOffset() {
        return pageOffset;
    }
    
    public int getPageCount() {
        if (students == null) {
            initializeStudents();
        }
        return (int )Math.ceil(students.size() / pageSize);
    }
    
    public int getRealRowCount() {
        return students.size();
    }
    
    public int getPageSize() {
        return pageSize;
    }
    
    public void setPageSize(int size) {
        if (size == pageSize)
            return;
        int oldPageSize = pageSize;
        pageSize = size;
        pageOffset = (oldPageSize * pageOffset) / pageSize;
        fireTableDataChanged();
    }
    
    public void pageDown() {
        if (pageOffset < getPageCount() - 1)
            pageOffset++;
            fireTableDataChanged();
    }
    
    public void pageUp() {
        if (pageOffset < 0) {
            pageOffset--;
            fireTableDataChanged();
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnClasses == null || columnClasses.length == 0) {
            return Object.class;
        } else {
            return columnClasses[columnIndex];
        }
    }
    
    public static JScrollPane configurePagingScrollPageForTable(JTable jTable) {
        JScrollPane scrollPane = new JScrollPane(jTable);
        TableModel tableModel = jTable.getModel();
        
        if (!(tableModel instanceof StudentTableModel)) {
            return scrollPane;
        }
        
        final StudentTableModel model = (StudentTableModel) tableModel; 
        final JButton upButton = new JButton(new ArrowIcon(ArrowIcon.UP));
        upButton.setEnabled(false);
        final JButton downButton = new JButton(new ArrowIcon(ArrowIcon.DOWN));
        if (model.getPageCount() <= 1) {
            downButton.setEnabled(false);
        }

        upButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                model.pageUp();

                if (model.getPageOffset() == 0) {
                    upButton.setEnabled(false);
                }
                downButton.setEnabled(true);
            }
        });

        downButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                model.pageDown();

                if (model.getPageOffset() == (model.getPageCount() - 1)) {
                    downButton.setEnabled(false);
                }
                upButton.setEnabled(true);
            }
        });

        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        scrollPane.setCorner(ScrollPaneConstants.UPPER_RIGHT_CORNER, upButton);
        scrollPane.setCorner(ScrollPaneConstants.LOWER_RIGHT_CORNER, downButton);

        return scrollPane;
    }
}
