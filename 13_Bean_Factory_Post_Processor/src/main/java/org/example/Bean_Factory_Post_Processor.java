package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class Bean_Factory_Post_Processor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("My Bean Factory Processor is being called.") ;

        BeanDefinition bd = beanFactory.getBeanDefinition("triangle");
        bd.getPropertyValues().add("str", "Isskander Isskander") ;
    }
}
