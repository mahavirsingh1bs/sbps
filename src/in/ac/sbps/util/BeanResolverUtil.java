/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mahavir.singh
 */
public class BeanResolverUtil {
    private static final ApplicationContext context = 
            new ClassPathXmlApplicationContext("classpath:/in/ac/sbps/config/applicationContext.xml");
    
    public static Object getBean(String beanName) {
        return context.getBean(beanName);
    }
    
    /**
    public static void main(String...args) {
        System.out.println(getBean("studentDAO"));
    }
    */
}
