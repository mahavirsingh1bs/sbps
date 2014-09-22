/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.config;

import in.ac.sbps.dao.StudentDAO;
import in.ac.sbps.dao.TeacherDAO;
import in.ac.sbps.dao.impl.StudentDAOImpl;
import in.ac.sbps.dao.impl.TeacherDAOImpl;
import in.ac.sbps.service.StudentService;
import in.ac.sbps.service.impl.StudentServiceImpl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaDialect;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author mahavir.singh
 */
@Configuration
@EnableTransactionManagement
public class AppConfig {

    private EntityManager entityManager;
    
    @Bean(name = "studentDAO")
    public StudentDAO studentDAO() {
        return new StudentDAOImpl();
    }

    @Bean(name = "teacherDAO")
    public TeacherDAO teacherDAO() {
        return new TeacherDAOImpl();
    }

    @Bean(name = "studentService")
    public StudentService studentService() {
        return new StudentServiceImpl();
    }
    
    @Bean(name = "entityManagerFactory")
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean em = new LocalEntityManagerFactoryBean();
        em.setPersistenceUnitName("sbpsPU");

        // JpaVendorAdapter vendorAdapter = new EclipseLinkJpaVendorAdapter();
        // em.setJpaVendorAdapter(vendorAdapter);
        // em.setJpaDialect(new EclipseLinkJpaDialect());
        return em;
    }

    @Bean(name = "entityManager")
    public EntityManager entityManager(EntityManagerFactory emf) {
        if (entityManager == null) {
            entityManager = (EntityManager )emf.createEntityManager();
        }
        return entityManager;
    }
    
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }
    
    @Bean(name = "jpaVendorAdapter")
    public JpaVendorAdapter jpaVendorAdapter() {
        return new EclipseLinkJpaVendorAdapter();
    }
    
    @Bean(name = "jpaDialect")
    public JpaDialect jpaDialect() {
        return new EclipseLinkJpaDialect();
    }
    
    @Bean(name = "exceptionTranslator")
    public PersistenceExceptionTranslator exceptionTranslator() {
        return new EclipseLinkJpaDialect();
    }
}
