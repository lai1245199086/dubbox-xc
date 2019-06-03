package org.dubbox.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MybatisTest
{
    @Test
    public void testQueryUser() {
    	String configLocation = "classpath*:/applicationContext-dao.xml";
    	ApplicationContext context = new ClassPathXmlApplicationContext( configLocation);
    	context.getBean("sqlSessionFactory");
    }

}
