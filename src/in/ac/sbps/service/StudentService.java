/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.service;

import in.ac.sbps.domain.Student;
import java.util.List;

/**
 *
 * @author mahavir.singh
 */
public interface StudentService {
    void register(Student student);
    List<Student> findAllStudent();
    List<Student> searchStudents(String name, String sClass, String village);
}
