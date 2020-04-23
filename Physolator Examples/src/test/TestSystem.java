package test;

import de.physolator.usr.PhysicalSystem;
import de.physolator.usr.PlotterDescriptors;
import de.physolator.usr.V;

public class TestSystem extends PhysicalSystem {
	
	@V(unit = "m")
	public double x = 3;

	
	
	@Override
	public void f(double t, double h) {
	x = Math.sin(t);
	}


	@Override
	public void initPlotterDescriptors(PlotterDescriptors r) {
		r.add("x", 10, -1.5, 1.5);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
start();
	}

}
