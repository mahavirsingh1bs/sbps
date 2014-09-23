/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.service.impl;

import in.ac.sbps.dao.TeacherDAO;
import in.ac.sbps.domain.Teacher;
import in.ac.sbps.exception.DAOException;
import in.ac.sbps.exception.ServiceException;
import in.ac.sbps.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author mahavir.singh
 */
public class TeacherServiceImpl implements TeacherService {
    
    @Autowired
    private TeacherDAO teacherDAO;
    
    @Override
    public void register(Teacher teacher) throws ServiceException {
        try {
            teacherDAO.create(teacher);
        } catch (DAOException ex) {
            throw new ServiceException(ex.getMessage(), ex);
        }
    }
    
}
