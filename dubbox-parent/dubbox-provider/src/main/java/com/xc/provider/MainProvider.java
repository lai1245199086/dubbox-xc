package com.xc.provider;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProvider 
{
	static Log log = LogFactory.getLog(MainProvider.class);
	public static void main(String[] args) throws IOException, InterruptedException {
		MainProvider main = new MainProvider();
		CountDownLatch latch = new CountDownLatch(1);
		main.start();
		log.info("The Porvider has been Started !!!");
        latch.await();
    }
 
    void start() {
        String[] configLocation = new String[]{"classpath*:/dubbo-provider.xml","classpath*:/applicationContext-dao.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext( configLocation);
    }
}
