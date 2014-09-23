/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.dao.impl;

import in.ac.sbps.dao.StudentDAO;
import in.ac.sbps.domain.Student;
import in.ac.sbps.util.SClass;
import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mahavir.singh
 */
@Repository
public class StudentDAOImpl extends GenericDAOImpl<Long, Student> 
    implements StudentDAO {
    private static final String PERCENTILE = "%";
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Student> findAllStudent() {
        Query query = entityManager.createQuery("SELECT s FROM Student s");
        return query.getResultList();
    }

    @Override
    public List<Student> searchStudents(String name, String sClass, String village) {
        String queryString = "SELECT s FROM Student s WHERE (s.firstName LIKE :firstName OR s.lastName LIKE :lastName)";
        if (!sClass.equals("")) {
            queryString = queryString.concat(" AND s.stuClass LIKE :stuClass ");
        }
        queryString = queryString.concat(" AND s.village LIKE :village ");
        
        Query query = entityManager.createQuery(queryString);
        
        query.setParameter("firstName", PERCENTILE + name + PERCENTILE);
        query.setParameter("lastName", PERCENTILE + name + PERCENTILE);
        if (!sClass.equals("")) {
            query.setParameter("stuClass", PERCENTILE + SClass.classValueOf(sClass) + PERCENTILE);
        }
        query.setParameter("village", PERCENTILE + village + PERCENTILE);
        return query.getResultList();
    }
    
}
