/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.dao.impl;

import in.ac.sbps.dao.TeacherDAO;
import in.ac.sbps.domain.Teacher;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mahavir.singh
 */
@Repository
public class TeacherDAOImpl extends GenericDAOImpl<Long, Teacher> 
    implements TeacherDAO {
    
}
