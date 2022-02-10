package com.dxc.mtd.ui;

import com.dxc.mtd.model.Bus;
import com.dxc.mtd.service.BusReservationService;

public class ReservationCounter {

	public static void main(String[] args) {
		
		Bus bus = new Bus(25);
		
		BusReservationService s1 = new BusReservationService(bus, 10, "Alice");
		BusReservationService s2 = new BusReservationService(bus, 10, "Bob");
		BusReservationService s3 = new BusReservationService(bus, 10, "James");
		
		s1.start();
		s2.start();
		s3.start();
	}
}