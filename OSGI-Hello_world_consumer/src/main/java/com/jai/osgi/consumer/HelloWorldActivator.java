package com.jai.osgi.consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.jai.osgi.provider.able.HelloWorldService;

public class HelloWorldActivator implements BundleActivator {
	
	private HelloWorldConsumer consumer;

	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		ServiceReference reference = context.getServiceReference(
				HelloWorldService.class.getName()
				);
		
		consumer = new HelloWorldConsumer(
				(HelloWorldService) context.getService(reference)
				);

		consumer.startTimer();
		
		System.out.println("Testing this ....");
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		consumer.stopTimer();
	}

}
