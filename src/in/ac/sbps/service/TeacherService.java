/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.service;

import in.ac.sbps.domain.Teacher;
import in.ac.sbps.exception.ServiceException;

/**
 *
 * @author mahavir.singh
 */
public interface TeacherService {
    void register(Teacher teacher) throws ServiceException;
}
