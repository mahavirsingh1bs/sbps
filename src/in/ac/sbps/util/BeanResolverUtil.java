/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.util;

import in.ac.sbps.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author mahavir.singh
 */
public class BeanResolverUtil {
    private static final ApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);
    
    public static Object getBean(String beanName) {
        return context.getBean(beanName);
    }
    
}
