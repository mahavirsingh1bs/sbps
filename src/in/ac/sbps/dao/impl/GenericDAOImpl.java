/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.dao.impl;

import in.ac.sbps.dao.GenericDAO;
import in.ac.sbps.exception.DAOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mahavir.singh
 */
@Repository
public class GenericDAOImpl<ID extends Serializable, T> implements GenericDAO<ID, T> {
    
    @Autowired
    private PlatformTransactionManager transactionManager;
    
    @Autowired
    private EntityManagerFactory emf;
    
    @Autowired
    protected EntityManager entityManager;
    
    /**
     * type
     */
    private Class<T> type;

    /**
     * Constructor default
     */
    public GenericDAOImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    /**
     * This is a method to create a T.
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public T create(T t) throws DAOException {
        try {
            System.out.println(emf == ((JpaTransactionManager )transactionManager).getEntityManagerFactory());
            entityManager.persist(t);
            return t;
        } catch (PersistenceException exception) {
            // throw PersistenceExceptionUtil.convertPersistenceException(exception);
            throw new DAOException(exception);
        }
    }

    /**
     * This is to find an entity with given ID.
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public T find(ID id) throws DAOException {
        try {
            return (T) entityManager.find(type, id);
        } catch (PersistenceException exception) {
            //throw PersistenceExceptionUtil.convertPersistenceException(exception);
            throw new DAOException(exception);
        }
    }

}
