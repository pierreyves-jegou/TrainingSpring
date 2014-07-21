/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.trainingSpring;

import com.mycompany.trainingSpring.beans.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author pierre
 */
public class Main {
    
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/mycompany/trainingSpring/applicationContext.xml");
    
    
    public static void main(String args[]){
        Main main= new Main();
        MyBean myBean = main.applicationContext.getBean("myBeanId", MyBean.class);
        myBean.displayHelloWorld();
    }
    
            
            
}
