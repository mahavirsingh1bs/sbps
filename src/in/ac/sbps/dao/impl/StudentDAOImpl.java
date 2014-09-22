/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.dao.impl;

import in.ac.sbps.dao.StudentDAO;
import in.ac.sbps.domain.Student;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mahavir.singh
 */
@Repository
public class StudentDAOImpl extends GenericDAOImpl<Long, Student> 
    implements StudentDAO {
    
}
