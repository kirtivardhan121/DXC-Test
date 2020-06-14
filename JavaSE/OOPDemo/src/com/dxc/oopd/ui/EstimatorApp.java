package com.dxc.oopd.ui;

import com.dxc.oopd.model.Circular;
import com.dxc.oopd.model.Estimator;
import com.dxc.oopd.model.Rectangular;


public class EstimatorApp {

	public static void main(String[] args) {

		Estimator est = new Estimator(200, 100);
		Rectangular r = new Rectangular(10, 10);
		Circular c = new Circular(3);

		System.out.println("PaintingCost of REctangular shape "+est.getPaintCost(r));
		System.out.println("BoarderCost of REctangular shape "+est.getBorderCost(r));

		System.out.println("PaintingCost of Circular shape "+est.getPaintCost(c));
		System.out.println("BoarderCost of Circular shape "+est.getBorderCost(c));


	}

}
