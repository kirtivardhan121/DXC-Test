package com.dxc.mtd.model;

import java.util.List;

public class Bus {

	private int seatCount;
	private int lastReservedSeat;
	
	
	public Bus(int seatCount) {
		this.seatCount = seatCount;
		this.lastReservedSeat = 0;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public int getLastReservedSeat() {
		return lastReservedSeat;
	}

	public void setLastReservedSeat(int lastReservedSeat) {
		this.lastReservedSeat = lastReservedSeat;
	}
	
}
