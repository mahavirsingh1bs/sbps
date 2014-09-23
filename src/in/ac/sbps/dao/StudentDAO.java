/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.dao;

import in.ac.sbps.domain.Student;
import java.util.List;

/**
 *
 * @author mahavir.singh
 */
public interface StudentDAO extends GenericDAO<Long, Student> {
    List<Student> findAllStudent();
    List<Student> searchStudents(String name, String sClass, String village);
}
