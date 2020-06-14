package com.dxc.sl.service;

public class IntegerCombiner implements Combiner<Integer>{

	@Override
	public Integer combine(Integer ele1, Integer ele2) {
		
		return ele1+ele2;
	}

}
