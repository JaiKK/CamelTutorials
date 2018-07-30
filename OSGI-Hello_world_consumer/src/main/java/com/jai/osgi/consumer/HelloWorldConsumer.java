package com.jai.osgi.consumer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import com.jai.osgi.provider.able.HelloWorldService;

public class HelloWorldConsumer implements ActionListener{
	private final HelloWorldService service;
	private final Timer timer;

	public HelloWorldConsumer(HelloWorldService service) {
		super();
		this.service = service;
		
		timer = new Timer(1000, this);
	}
	
	public void startTimer() {
		timer.start();
	}
	public void stopTimer() {
		timer.stop();
	}	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		service.hello();
	}

}
