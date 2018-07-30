package com.jai.osgi.provider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.jai.osgi.provider.able.HelloWorldService;
import com.jai.osgi.provider.impl.HelloWorldServiceImpl;

public class ProviderActivator implements BundleActivator{
	
	private ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		registration = context.registerService(
				HelloWorldService.class.getName(), 
				new HelloWorldServiceImpl(), 
				null);
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		registration.unregister();		
	}

}
