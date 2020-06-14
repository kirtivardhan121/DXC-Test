package com.dxc.mtd.service;

public class NumberCounterService extends Thread{

	private int startFrom;
	private int stopAt;
	
	public NumberCounterService(int startFrom, int stopAt, String name) {
		super();
		this.startFrom = startFrom;
		this.stopAt = stopAt;
		setName(name);
	}
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int i = startFrom; i<=stopAt; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(t.getName() +">>"+ i);
		}
	}
}
