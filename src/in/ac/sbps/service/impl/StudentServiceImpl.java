/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.service.impl;

import in.ac.sbps.dao.StudentDAO;
import in.ac.sbps.domain.Student;
import in.ac.sbps.exception.DAOException;
import in.ac.sbps.exception.ServiceException;
import in.ac.sbps.service.StudentService;
import in.ac.sbps.util.SClass;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mahavir.singh
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;
    
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void register(Student student) throws ServiceException {
        try {
            studentDAO.create(student);
        } catch (DAOException ex) {
            throw new ServiceException(ex.getMessage(), ex.getCause());
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public List<Student> findAllStudent() {
        return studentDAO.findAllStudent();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public List<Student> searchStudents(String name, String sClass, String village) {
        return studentDAO.searchStudents(name, sClass, village);
    }
    
}
