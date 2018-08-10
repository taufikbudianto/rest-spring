/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taufik.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Controller;
/**
 *
 * @author Randy
 */
@Controller
public class ApplicationListener implements org.springframework.context.ApplicationListener<ContextRefreshedEvent> {

    @Value("${basepackage.abstractmanagedbean}")
    private String abstractManagedBeanBasePackage;
    private final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * Checking class in AbstractManagedBean base package.
     */
    private void checkingAbstractManagedBeanPackage() {
        if (abstractManagedBeanBasePackage != null) {

            log.info("Checking AbstractManagedBean instances.");

            for (String basePackage : abstractManagedBeanBasePackage.split(",")) {
                
                log.info("Reading base package : {}", basePackage);
            }
        }
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {
       
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
