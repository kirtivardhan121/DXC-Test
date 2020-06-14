package com.dxc.mtd.service;

import java.util.ArrayList;
import java.util.List;

import com.dxc.mtd.model.Bus;

public class BusReservationService extends Thread {

	private Bus bus;
	private int seatRequired;
	private List<Integer> seatReserved;

	public BusReservationService(Bus bus, int seatRequired, String name) {
		super();
		this.bus = bus;
		this.seatRequired = seatRequired;
		setName(name);
		this.seatReserved = new ArrayList<Integer>(); 
	}

	public boolean isSeatsAvailable() {
		return bus.getSeatCount()>bus.getLastReservedSeat();
	}

	public void bookSeat() {
		if(isSeatsAvailable()) {

			bus.setLastReservedSeat(bus.getLastReservedSeat()+1);
			seatReserved.add(bus.getLastReservedSeat());
		}
	}

	public void run() {
		Thread t = Thread.currentThread();
		synchronized (bus) {


			if(isSeatsAvailable()) {

				while(seatRequired > 0) {
					bookSeat();
					seatRequired--;
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				System.out.println(t.getName()+">> Seats Reserved are: "+ seatReserved);
			} else {
				System.out.println(t.getName() +"No Seats Available");
			}
		}
	}
}
