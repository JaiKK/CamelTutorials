package com.jai.osgi.provider.impl;

import java.util.logging.Logger;

import com.jai.osgi.provider.able.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	private static final Logger LOGGER = Logger.getLogger(HelloWorldServiceImpl.class.getName());
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");
		LOGGER.info("Hello World!!!");
	}

}
