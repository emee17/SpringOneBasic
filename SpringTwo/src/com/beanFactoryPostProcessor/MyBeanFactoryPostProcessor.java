package com.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException
	{
		BeanDefinition beanDefination = beanFactory.getBeanDefinition("restaurant");
		MutablePropertyValues propertyValue = beanDefination.getPropertyValues();
		propertyValue.addPropertyValue("welcomeNote", "This is the modified note using BeanFactoryPostProcessor ");
	}

}
