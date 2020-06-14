package com.dxc.sl.service;

public interface Combiner<T> {

	public abstract T combine(T ele1, T ele2);
}
